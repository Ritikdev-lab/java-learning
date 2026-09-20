package io.github.ritikdevlab.example.inheritanceexample;

import io.github.ritikdevlab.example.inheritanceexample.com.*;

public class InheritanceDemo {
    /**
     * This program demonstrates inheritance.
     */
    void main() {
        //Constructs a Managet object
        Manager Boss = new Manager("Ritik sabat", 80000, 2025, 6, 8);
        Boss.setBonus(20000);
        Employee[] staff = new Employee[3];
        //fill the staff array with Manager and Employee objects.
        staff[0] = Boss;
        staff[1] = new Employee("Harry Hacker", 50000, 2020, 6, 19);
        staff[2] = new Employee("Tommy Tester", 40000, 2024, 11, 12);
        //Print out the information about all Employee objects
        for(Employee e: staff) {
            IO.println("Name = " + e.getName() + " ,Salary = " + e.getSalary());
        } 
    }
}
