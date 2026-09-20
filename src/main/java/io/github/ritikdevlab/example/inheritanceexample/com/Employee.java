package io.github.ritikdevlab.example.inheritanceexample.com;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents an employee with a name,salary,
 * and hire date.
 */
public class Employee {
    // These are instance fields
    /**
     * The employee's name, assigned during construction can not be changed
     * afterwards.
     */
    private final String name;
    private double salary;
    private LocalDate hireDay;

    /**
     * Create an employee with the specific information.
     * 
     * @param n     the employee name
     * @param s     the employee salary
     * @param year  the hire year
     * @param month the hire month
     * @param day   the hire day
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    /**
     * {@return employee name}
     * 
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public String getName() {
        return name;
    }

    /**
     * {@return employee salary}
     * 
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public double getSalary() {
        return salary;
    }

    /**
     * {@return the employee hire date}
     * 
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Increase the employee's salary by a percentage
     * 
     * @param byPercent the percentage increase
     * @apiNote This method modifies the salary of the employee by increasing it by
     *          the specified percentage.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * @param otherObject the reference object with which to compare.
     * @return {@code true} if this object is the same as the otherObject argument;
     *         {@code false} otherwise.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name)
                && Double.compare(salary, other.salary) == 0
                && Objects.equals(hireDay, other.hireDay);
    }

    /**
     * Returns a hash code value for the object.
     * 
     * @return a hash code value for this object.
     * @apiNote This method returns a hash code value for the employee object based
     *          on its name, salary, and hire date.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Double.hashCode(salary);
        result = 31 * result + Objects.hashCode(hireDay);
        return result;
    }
    /**
     * Returns a string representation of the employee.
     * 
     * @return a string representation of the employee.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public String toString() {
        return getClass().getName()
                + "[name = " + name
                + " ,salary = " + salary
                + " ,hireDay = " + hireDay
                + "]";
    }

}