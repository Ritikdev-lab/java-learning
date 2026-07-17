package io.github.ritikdevlab.Example.v1ch05;

import java.util.ArrayList;

/**
 * This program demonstrates the ArrayList class.
 */
public class ArrayListTheory {
    public static void main(String[] args) {
        // Fill the staff array list with three Employee objects
        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Tony Tester", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        // Raise everyone's Salary by 5%
        for (Employee e : staff) {
            // print out information about all Employee objects
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            IO.println("name=" + e.getName() + " ,salary=" + e.getSalary() + " ,hireDay=" + e.getHireDay());
        }
    }
}
