package io.github.ritikdevlab.example.inheritanceexample.com;

/**
 * Represents a manager employee.
 */
public class Manager extends Employee {
    private double bonus;

    /**
     * Constructs a Manager object with the specified name, salary, and hire date.
     *
     * @param name   the name of the manager
     * @param salary the base salary of the manager
     * @param year   the year of hire
     * @param month  the month of hire
     * @param day    the day of hire
     * 
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    /**
     * Returns the total salary of the manager, including the bonus.
     *
     * @return the total salary
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    /**
     * Sets the bonus for the manager.
     *
     * @param b the bonus amount
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public void setBonus(double b) {
        bonus = b;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param otherObject the reference object with which to compare
     * @return {@code true} if this object is the same as the otherObject argument;
     *         {@code false} otherwise
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }
        Manager other = (Manager) otherObject;
        return Double.compare(bonus, other.bonus) == 0;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(bonus);
        return result;
    }
    /**
     * Returns a string representation of the manager.
     *
     * @return a string representation of the manager.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public String toString() {
        return super.toString()
                + "[bonus = " + bonus
                + "]";
    }
}
