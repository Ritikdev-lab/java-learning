package io.github.ritikdevlab.example.v1ch06.interfaces;

/**
 * The familiar Employee class, implementing the Comparable interface.
 */
public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	
	/**
	 * Constructs an employee with a given name and salary.
	 * 
	 * @param name the employee's name
	 * @param salary the employee's salary
	 */
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	/**
	 * {@return the name of this employee}
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * {@return the salary of this employee}
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Raises the salary of this employee.
	 * 
	 * @param bypercent the percentage by which to raise the salary
	 */
	public void raiseSalary(double bypercent) {
		double raise = salary * bypercent / 100;
		salary += raise;
	}
	
	/**
	 * Compares employee by salary.
	 * 
	 * @param other another Employee object.
	 * @return a negative value if this employee has a lower salary than other, 
	 * 			0 if the salary are the same, a positive value otherwise.
	 */
	@Override
	public int compareTo(Employee other) {
		return Double.compare(salary, other.salary);
	}
}	