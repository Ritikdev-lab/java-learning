package io.github.ritikdevlab.learning.ch6.interfacedemo;

import java.util.Arrays;

class Manager implements Comparable<Manager> {
	private String name;
	private double salary;

	/**
	 * Constructs a new {@code Manager}.
	 *
	 * @param name   the name of the manager
	 * @param salary the salary of the manager
	 */
	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	 * Returns the name of this manager.
	 *
	 * @return the manager's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the salary of this manager.
	 *
	 * @return the manager's salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Compares this manager with another manager based on salary.
	 *
	 * <p>
	 * The comparison is performed using {@link Double#compare(double, double)}.
	 * </p>
	 *
	 * <p>
	 * The result is:
	 * </p>
	 * <ul>
	 * <li>A negative value if this manager's salary is lower.</li>
	 * <li>Zero if both managers have the same salary.</li>
	 * <li>A positive value if this manager's salary is higher.</li>
	 * </ul>
	 *
	 * @param m the manager to compare with this manager
	 * @return a negative integer, zero, or a positive integer depending on whether
	 *         this manager's salary is less than, equal to, or greater than the
	 *         specified manager's salary
	 *
	 * @throws ClassCastException if the specified object is not an instance of the
	 *                            same class as this manager
	 */
	@Override
	public int compareTo(Manager m) {
		if (getClass() != m.getClass()) {
			throw new ClassCastException();
		}
		return Double.compare(salary, m.salary);
	}
}


class Employee implements Comparable<Employee> {
	private String name;
	private double salary;
	private int rank;

	/**
	 * Constructs a new {@code Employee}.
	 *
	 * @param name   the name of the employee
	 * @param salary the salary of the employee
	 * @param rank   the rank of the employee
	 */
	public Employee(String name, double salary, int rank) {
		this.name = name;
		this.salary = salary;
		this.rank = rank;
	}

	/**
	 * Returns the name of this employee.
	 *
	 * @return the employee's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the salary of this employee.
	 *
	 * @return the employee's salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Returns the rank of this employee.
	 *
	 * @return the employee's rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Compares this employee with another employee based on rank.
	 *
	 * <p>
	 * The comparison is performed using {@link Integer#compare(int, int)}.
	 * </p>
	 *
	 * <p>
	 * The result is:
	 * </p>
	 * <ul>
	 * <li>A negative value if this employee's rank is lower.</li>
	 * <li>Zero if both employees have the same rank.</li>
	 * <li>A positive value if this employee's rank is higher.</li>
	 * </ul>
	 *
	 * @param e the employee to compare with this employee
	 * @return a negative integer, zero, or a positive integer depending on whether
	 *         this employee's rank is less than, equal to, or greater than the
	 *         specified employee's rank
	 *
	 * @throws ClassCastException if the specified object is not an instance of the
	 *                            same class as this employee
	 */
	@Override
	public int compareTo(Employee e) {
		if (getClass() != e.getClass()) {
			throw new ClassCastException();
		}
		return Integer.compare(rank, e.rank);
	}
}


public class ConceptInterface {
	public static void main(String[] args) {
		var boss = new Manager[3];

		boss[0] = new Manager("Sourabha Jena", 20000);
		boss[1] = new Manager("Rabi Barik", 30000);
		boss[2] = new Manager("Sagar Sahoo", 10000);

		Arrays.sort(boss);

		for (Manager m : boss) {
			IO.println("Name=" + m.getName() + ", Salary=" + m.getSalary());
		}

		var staff = new Employee("Karan Rout", 10000, 2);
		var newStaff = new Employee("Nakula Panda", 45000, 4);

		int compare = staff.compareTo(newStaff);

		if (compare < 0) {
			IO.println("New staff has High Rank");
		} else if (compare > 0) {
			IO.println("Old staff has High Rank");
		} else {
			IO.println("Rank of both staff is same");
		}
	}
}
