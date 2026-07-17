package io.github.ritikdevlab.learning.Ch4.Document.program.program3;
//The classes in this file are part of this package
import module java.base;
//Import statement come after the package statement
/**
 * This class is almost identical to the initial Employee class,but it is inside
 * a  package.Note that the class and its mention are public.
 */
public class employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    public employee(String name, double salary,int year ,int month,int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, month);
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary*byPercent / 100;
        salary += raise;
    }
}
