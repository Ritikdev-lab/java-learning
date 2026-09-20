package io.github.ritikdevlab.example;
import java.time.LocalDate;
/**
 * Test the Employee class by creating employee objects,
 * incrasing there salaries, and displaying there information
 */
public class EmployeeDemo {
    /**
     * Create employee objects, raises there salarys,
     * and displays employee information
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        // print out information about all Employee objects
        for (Employee e : staff) {
            IO.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}

/**
 * Represents an employee with a name,salary,
 * and hire date.
 */
class Employee {
    //These are instance fields
    /**
     * The employee's name, assigned during construction can not be changed afterwards.
     */
    private final String name;
    private double salary;
    private LocalDate hireDay;
    /**
     * Create an employee with the specific information.
     * 
     * @param n the employee name
     * @param s the employee salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    /**
     * {@return employee name}
     */
    String getName() {
        return name;
    }
    /**
     * {@return employee salary}
     */
    double getSalary() {
        return salary;
    }
    /**
     * {@return the employee hire date}
     */
    LocalDate getHireDay() {
        return hireDay;
    }
    /**
     * Increase the employee's salary by a percentage
     * 
     * @param byPercent the percentage increase
     */
    void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

