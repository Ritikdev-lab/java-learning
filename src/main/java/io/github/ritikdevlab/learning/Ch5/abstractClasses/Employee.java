package io.github.ritikdevlab.learning.Ch5.abstractClasses;

import java.time.LocalDate;

/**
 * The familiar Employee class, modified to extend the abstract class Person.
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;
    /**
     * Construnt the Employee Object
     * 
     * @param name the name of the Employee
     * @param salary the salary of the Employee
     * @param year the year when hired
     * @param month the month when hired
     * @param day the day when hired
     */
    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }
    /**
     * Get the salary of the Employee
     * 
     * @return the Employee salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Get the date of hire
     * 
     * @return hireday of the Employee
     */
    public LocalDate getHireDay() {
        return hireDay;
    }
    /**
     * Get the desciption of the Employee
     * 
     * @return the Description of the Employee including there salary
     */
    @Override
    public String getDescription() {
        return "an employee with a salary of $%,.2f".formatted(salary);
    }
    /**
     * Raise the salary by given percentage
     * 
     * @param byPercent the percentage of the raise salary amount
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
