package io.github.ritikdevlab.Example.v1ch05;

/**
 * The familar Manager class, with equals, hashCode, and toString method.
 */
public class Manager extends Employee {
    private double bonus;
    /**
     * Construct a manager with the given name, salary, and bonus.
     * @param name the manager name
     * @param salary the manager salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }
    /**
     * Get the manager salary.
     * @return the manager salary
     */
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    /**
     * Set the manager bonus.
     * @param bonus the manager bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    /**
     * Test whether two managers are equal
     * @param othObject the object to test equality with
     * @return true if this object is equal to the otherObject
     */
    public boolean equals(Object othObject) {
        if (!super.equals(othObject)) {
            return false;
        }
        var other = (Manager) othObject;
        // super.equal checked that this and other belong to the same class
        return bonus == other.bonus;
    }
    /**
     * Get the hash code of this manager.
     * @return the hash code
     */
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }
    /**
     * Get the string representation of this manager.
     * @return the string representation
     */
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
