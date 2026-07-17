package io.github.ritikdevlab.project;
public class TaskApp {
    public static void main (String[] args) {
        Task[] ta = new Task[0];
        while(true) {
            String command = IO.readln("Task commands (Add, view, remove, rename, exit):- ");
            switch (command.toLowerCase()) {
                case "add"-> {
                    int numTasks = Integer.parseInt(IO.readln("Give the number of task:- "));
                    Task[] tasks = new Task[numTasks];
                        for (int j = 0; j < numTasks; j++) {
                            String nameTask = IO.readln("Names of the task:- ");
                            String Descriptions = IO.readln("Give the Descriptioon of the task:- "); 
                            tasks[j] = new Task(nameTask, Descriptions);
                        }   
                    ta = tasks;
                }
                case "view" -> {
                    for (int i = 0; i < ta.length; i++) {
                        if (ta[i] != null) {
                            IO.println("Task:- " + ta[i].getTaskType());
                            IO.println("ID:- " + ta[i].getId());
                            IO.println("Description:- " + ta[i].getDescription());  
                        } 
                        else {
                            IO.println("No task assigned.");
                        }
                    }
                }
                case "remove" -> {
                    String qn = IO.readln("Do you you want to  remove task (Y/N):- ");
                    if (qn.equalsIgnoreCase("Y")) {
                        int nameToRemove = Integer.parseInt(IO.readln("Enter the Id of the task to remove:- "));
                        boolean found = false;
                        for (int i = 0; i < ta.length; i++) {
                            if (ta[i] != null && ta[i].getId() == nameToRemove) {
                                ta[i] = null;
                                found = true;
                            }
                        }
                        if(!found) {
                            IO.println("Task not found.");
                        }
                    } 
                    else if (qn.equalsIgnoreCase("N")) {    
                        IO.println("No task removed.");
                    } 
                    else {
                        IO.println("Invalid input.");
                    }
                }
                case "rename" -> {
                    String qn = IO.readln("Do you want to rename task (Y/N):- ");
                    if (qn.equalsIgnoreCase("Y")) {
                        int nameToRename = Integer.parseInt(IO.readln("Enter the Id of the task to rename:- "));
                        boolean found = false;
                        for (int i = 0; i < ta.length; i++) {
                            if (ta[i] != null && ta[i].getId() == nameToRename) {
                                String newName = IO.readln("Enter the new name for the task:- ");
                                String newDescription = IO.readln("Enter the new description for the task:- ");
                                ta[i] = new Task(newName, newDescription);
                                found = true;
                            }
                        }
                        if(!found) {
                            IO.println("Task not found.");
                        }
                    } 
                    else if (qn.equalsIgnoreCase("N")) {    
                        IO.println("No task renamed.");
                    } 
                    else {
                        IO.println("Invalid input.");
                    }
                }
                case "exit" -> {
                    IO.println("Exiting the program.");
                    return;
                }
                default -> {
                    IO.println("Invalid command. Please try again.");
                }
            }
            
            IO.println("-".repeat(40));

            for (int i = 0; i < ta.length; i++) {
                if (ta[i] != null) {
                    IO.println("Task:- " + ta[i].getTaskType());
                    IO.println("ID:- " + ta[i].getId());
                    IO.println("Description:- " + ta[i].getDescription());
                } 
            }

            IO.println("-".repeat(40));
        }   
    }
}
/**
 * Represents a task with a name, description, and unique identifier.
 */
class Task {
    private String TaskName;
    private String Description;
    private static int nextId = 1;
    private int id;
    /**
     * Create Task with name and description
     * 
     * @param TN the task name
     * @param D the Task Description
     */
    Task (String TN , String D) {
        this.TaskName = TN;
        this.Description = D;
        this.id = advanceId();
    } 
    /**
     * {@return the Task name}
     */ 
    public String getTaskType() {
        return this.TaskName;
    }
    /**
     * {@return the Description}
     */
    public String getDescription() {
        return this.Description;
    }
    /**
     * {@return the Task id}
     */
    public int getId() {
        return this.id;
    }
    /**
     * Generate and return the next available task id.
     * Each generate id increases by 20.
     * 
     * @return the next task id
     */
    private int advanceId() {
        int p = nextId;
        nextId += 20;
        return p;
    }
}