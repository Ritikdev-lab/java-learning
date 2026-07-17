package io.github.ritikdevlab.project;
/**
 * Demonstrates a single students managemets system.
 * Allows students to be added, viewed,searched and deleted.
 */
public class StudentManagement {
    public static void main(String[] args) {
        int number = Integer.parseInt(IO.readln("Enter the number of students:"));
        feature[] f = new feature[number];
        for (int i = 0; i < number; i++) {
            String name = IO.readln("Add students: ");
            int rollno = Integer.parseInt(IO.readln("Add roll number: "));
            double marks = Double.parseDouble(IO.readln("Add marks: "));
            f[i] = new feature(name, rollno, marks);
        }
        
        String qn = IO.readln("Do you want to view all the students? (yes/no): ");
        if (qn.equalsIgnoreCase("yes")) {
            for (feature s : f) {
                if(s != null) {
                    IO.println("Name: " + s.getNames() + ", Roll No: " + s.searchRollno() + ", Marks: " + s.marks());
                }                
            }
        }

        int searchRollno = Integer.parseInt(IO.readln("Enter the roll number to search: "));
        //Here initiallly assume that the student is not found
        boolean foundSearch = false;
        for (int i = 0; i < f.length;i++) {
            //Check for null to avoid nulPointerException    
            if (f[i] != null && f[i].searchRollno() == searchRollno) {
                IO.println("Found -> Name: " + f[i].getNames() + ", Roll No: " + f[i].searchRollno() + ", Marks: " +  f[i].marks());
                //Update the information from false to true
                foundSearch = true;
                break;//Stop searching once found
            }
        }
        //Here the !foundSearch mean foundSearch = false
        if(!foundSearch) {
            IO.println("Students with roll number " + searchRollno + " not found");
        }
        
        int deleteRollno = Integer.parseInt(IO.readln("Enter the roll number to delete: "));
        boolean foundDelete = false;
        for(int i = 0; i < f.length;i++) {
            if (f[i] != null && f[i].searchRollno() == deleteRollno) {
                f[i] = null; // Mark the students as deleted
                IO.println("Student with roll number " + deleteRollno + " has been deleted.");
                foundDelete = true;
                break;//Stop searching once found
            }
        }
        if(!foundDelete) {
            IO.println("Students with roll number " + deleteRollno + " not found.");
        }    
        
    }
}
/**
 * Represents a students with a name,
 * roll number, and marks.
 */
class feature {
    private final String Name;
    private int rollno;
    private double marks;
    /**
     * Create feature
     * 
     * @param N the student's name
     * @param r the student's roll number
     * @param m the students mark
     */
    public feature (String N, int r , double m) {
        this.Name = N;
        this.rollno = r;
        this.marks = m;
    }
    /**
     * {@return the student's name}
     */
    public String getNames() {
        return this.Name;
    }
    /**
     * {@return the roll no}
     */
    public int searchRollno() {
        return this.rollno;
    }
    /**
     * {@return the student's marks}
     */
    public double marks() {
        return this.marks;
    }

}