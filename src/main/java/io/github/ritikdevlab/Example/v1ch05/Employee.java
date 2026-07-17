package io.github.ritikdevlab.Example.v1ch05;

import java.time.LocalDate;
import java.util.Objects;

/**
 * The familiar Employee class, with equals, hashCode, and toString method.
 */

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * Construct an employee with the given name, salary and hire date.
     * @param name the employee name
     * @param salary the employee salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }
    /**
     * Get the employee name.
     * @return the employee name
     */
    public String getName() {
        return name;
    }
    /**
     * Get the employee salary.
     * @return the employee salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Get the employee hire day.
     * @return the employee hire day
     */
    public LocalDate getHireDay() {
        return hireDay;
    }
    /**
     * Raise the salary of this employee by a certain percentage.
     * @param byPercent the percentage by which to raise the salary
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    /**
     * Test whether two employees are equal
     * @param otherObject the object to test equality with
     * @return true if this object is equal to the otherObject
     */
    public boolean equals(Object otherObject) {
        // A quick test to see if the code is identical
        if (this == otherObject) {
            return true;
        }
        // If the classes do't match, they can't be equal
        if (otherObject == null) {
            return false;
        }
        // Test weither the field have identical values
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        // Now we know otherObject is non-null Employee
        var other = (Employee) otherObject;

        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);

    }
    /**
     * Get the hash code of this employee.
     * @return the hash code
     */
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }
    /**
     * Get the string representation of this employee.
     * @return the string representation
     */
    public String toString() {
        return getClass().getName() + "[name=" + name + " ,salary=" + salary
                + " ,hireDay=" + hireDay + "]";
    }
}
