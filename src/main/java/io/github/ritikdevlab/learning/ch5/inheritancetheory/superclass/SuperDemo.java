package io.github.ritikdevlab.learning.ch5.inheritancetheory.superclass;

import java.util.Objects;

public class SuperDemo {
    private String Name;
    private int Salary;

    /**
     * It is the Superclass
     * 
     * @param N the Name
     * @param S the Salary
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public SuperDemo(String N, int S) {
        this.Name = N;
        this.Salary = S;
    }

    /**
     * {@return The Name}
     * 
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     * @version 1.0
     */
    public final String getName() {
        return Name;
    }

    /**
     * {@return The Salary}
     * 
     * @author Ritikdev-lab
     * @version 1.0
     * @since 1.0
     */
    public final int getSalary() {
        return Salary;
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
        if (this == Obj) {
            return true;
        }
        if (Obj == null) {
            return false;
        }
        if (getClass() != Obj.getClass()) {
            return false;
        }
        SuperDemo Super = (SuperDemo) Obj;

        return Objects.equals(Name, Super.Name)
                && Salary == Super.Salary;
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
        int result = Objects.hashCode(Name);
        result = 31 * result + Integer.hashCode(Salary);
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
        return getClass().getName()
                + "[name=" + Name
                + " ,salary=" + Salary
                + "]";
    }
}
