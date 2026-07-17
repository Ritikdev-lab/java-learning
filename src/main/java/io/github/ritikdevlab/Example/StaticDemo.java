package io.github.ritikdevlab.Example;

public class StaticDemo {
    /**
     * Demonstrates the use of static fields and static methods.
     */
    //Create three employee objects.
 void main() {
        var staff = new Employees[3];
        staff[0] = new Employees("Tom", 40000);
        staff[1] = new Employees("Dick", 60000);
        staff[2] = new Employees("Harray", 65000);
        //Print out information about all Employee objects
        for (Employees e : staff) {
            IO.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
        }
        //Call the static method advanceId() to obtain the next available id and print it out
        int n = Employees.advanceId();
        IO.println("Next available id = " + n);
    }
}

/**
 * Represents an employee.
 * Demonstrates the use of static fields and staic methods
 * for generating unique employee identifiers.
 */
class Employees {
    private static int nextId = 1;
    private final String name;
    private double salary;
    private final int id;
    /**
     * Creates an employee with the specified name and salary.
     * A unique identifiers is assigned automatically.
     * 
     * @param n the employee name
     * @param s the employee salary
     */
    Employees (String n, double s) {
        name = n;
        salary = s;
        id = advanceId();
    }
    /**
     * {@return the Employee name}
     */
    String getName() {
        return name;
    } 
    /**
     * {@return the employee salary}
     */
    double getSalary() {
        return salary;
    }
    /**
     * {@return the employee id}
     */
    int getId() {
        return id;
    }
    /**
     * Increment the employee salary by a percentage.
     * 
     * @param byPercent the percent increase
     */
    void raiseSalary (double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    /**
     * Return the next available employee identifier
     * and increments the counter
     * 
     * @return the next employee id
     */
    static int advanceId() {
        int r = nextId;
        nextId++;
        return r;
    }
    //runs demo
    static void main() {
        var e = new Employees ("Harry", 50000);
        IO.println(e.getName() + " " + e.getSalary());
    }
}

