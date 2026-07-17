package io.github.ritikdevlab.learning.Ch4;
/**
 * This program demonstrates parameter passing in Java.
 *
 * Java always uses pass-by-value:
 * 1. Primitive variables pass a copy of the actual value.
 * 2. Object variables pass a copy of the reference.
 *
 * Because object references point to the same object,
 * methods can modify the object's state.
 * However, methods cannot replace the caller's reference
 * with a different object.
 */
public class ParamDemo {
    public static void main(String[] args) {
        /*
        Test 1:Methods can not modify numeric parameters and it use the copy of the value given
        */
        IO.println("Testing tripleValue:");
        double percent = 100;
        IO.println("Before: percent = " + percent);
        tripleValue(percent);
        IO.println("After:percent = " + percent);

        /*
        Test 2:Methods can change the state of object parameters. 
        And it is because the copy of the reference point to the same objects which is pointed by the actual object reference
        */
        IO.println("\nTesting tripleSalary:");
        var harry = new Staff("Harry", 50000);
        IO.println("Before:salary = " + harry.getSalary());
        tripleSalary(harry);
        IO.println("After:salary = " + harry.getSalary());

        /* *
        Test 3:Methods can not attach new objects to objest parameters.
        Also here it use the copied objects not the real one so the changes happen to the copied result.
        */
        IO.println("\nTesting swap:");
        var a = new Staff("Alice", 70000);
        var b = new Staff("Bob" ,60000);
        IO.println("Before:a = " + a.getName());
        IO.println("Before:b = " + b.getName());
        swap(a,b);
        IO.println("After:a = " + a.getName());
        IO.println("After:b = " + b.getName());
    }    
    //Helper mehods must be outside main() and marked static
    static void tripleValue(double x) {
        x = 3 * x;
        IO.println("End of Method: x " + x);
    }

    static void tripleSalary(Staff harry) {
        //Works
        harry.raiseSalary(200);
        IO.println("End of method: salary = " + harry.getSalary());
    }    
    static void swap(Staff a , Staff b) {
        Staff temp = a;
        //Here x become bob 
        a = b;
        //Here the y become alice
        b = temp;
        IO.println("End of method: x = " + a.getName());
        IO.println("End of method: y = " + b.getName());        
    }
}

/**
 * A simplified employee class to demonstrate static fields and methods.
 * This class is used in StaticDemo.java and ParamDemo.java
 */
    class Staff {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;
    //It initializes the name and salary of the employee and assigns a unique id by calling the advanceId() method, which generates a new id for each employee created. 
    Staff (String n, double s) {
        name = n;
        salary = s;
        id = advanceId();
    }
    String getName() {
        return name;
    } 
    double getSalary() {
        return salary;
    }
    //It returns the unique id assigned to the employee.
    int getId() {
        return id;
    }
    void raiseSalary (double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    //It return the current value of nextId and then increments it by 1 for the next employee 
    static int advanceId() {
        int r = nextId;
        nextId++;
        return r;
    }
    //runs demo
    static void main() {
        var e = new Staff ("Harry", 50000);
        IO.println(e.getName() + " " + e.getSalary());
    }
}