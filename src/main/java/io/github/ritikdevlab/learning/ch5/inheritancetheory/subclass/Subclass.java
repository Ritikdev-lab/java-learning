package io.github.ritikdevlab.learning.ch5.inheritancetheory.subclass;

import io.github.ritikdevlab.learning.ch5.inheritancetheory.superclass.SuperDemo;

public final class Subclass extends SuperDemo {
    private double Bonus;

    /**
     * It is the Subclass
     * 
     * @param Name the name of the Boss
     * @param Salary the salary of the Boss
     * @param b the bonus of the Boss
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public Subclass(String Name, int Salary, int b) {
        super(Name, Salary);
        this.Bonus = b;
    }

    /**
     * Factory method for making it more protected
     * 
     * @param N the name of the Boss
     * @param S the salary of the Boss
     * @param B the bonus of the Boss
     * @return the Subclass Constructor
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public static Subclass CreateSubclass(String N, int S, int B) {
        return new Subclass(N, S, B);
    }

    /**
     * The bonus for the Boss
     * 
     * @return the bonus of the Boss
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public double getBonus() {
        double baseSalary = super.getSalary();
        return baseSalary + Bonus;
    }

    /**
     * Set the Bonus Ammount
     * 
     * @param Ammount the bonus ammount to be set
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public void setBonus(double Ammount) {
        Bonus = Ammount;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param Obj the reference object with which to compare
     * @return {@code true} if this object is the same as the Obj argument;
     *         {@code false} otherwise
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public boolean equals(Object Obj) {
        if (!super.equals(Obj)) {
            return false;
        }
        Subclass Sub = (Subclass) Obj;
        return Double.compare(Bonus, Sub.Bonus) == 0;
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
        result = 31 * result + Double.hashCode(Bonus);
        return result;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    @Override
    public String toString() {
        return super.toString()
                + "[Bonus=" + Bonus
                + "]";
    }
}
