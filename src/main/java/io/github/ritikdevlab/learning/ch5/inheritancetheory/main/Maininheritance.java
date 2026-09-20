package io.github.ritikdevlab.learning.ch5.inheritancetheory.main;

import java.util.Objects;

import io.github.ritikdevlab.learning.ch5.inheritancetheory.record.Demonstrates;
import io.github.ritikdevlab.learning.ch5.inheritancetheory.subclass.Subclass;
import io.github.ritikdevlab.learning.ch5.inheritancetheory.superclass.SuperDemo;;

public class Maininheritance {
    public static void main(String[] args) {
        Subclass Boss = Subclass.CreateSubclass("Rabin", 20000, 12000);
        SuperDemo[] Super = new SuperDemo[3];
        Super[0] = Boss;
        Super[1] = new SuperDemo("Ritik", 10000);
        Super[2] = new SuperDemo("Jagan", 1200);
        IO.println("the boss total salary = " + Boss.getBonus());

        for (SuperDemo s : Super) {
            IO.println("The Names = " + s.getName());
            IO.println("The salary are " + s.getSalary());
        }

        Subclass Sub;
        for (int i = 0; i < Super.length; i++) {
            if (Super[i] instanceof Subclass) {
                Sub = (Subclass) Super[i];
                IO.println("Total salary of Boss = " + Sub.getBonus());
            }
        }

        for (int i = 0; i < Super.length; i++) {
            if (Super[i] instanceof Subclass Manager) {
                Manager.setBonus(5000);
                IO.println("The total Salary = " + Manager.getBonus());
            }
        }

        Demonstrates Demo = new Demonstrates(200, 500);

        if (Demo instanceof Demonstrates(var a, var b)) {
            double result = Math.hypot(a, b);
            IO.println("The result of the a^2 + b^2 = " + result);
        }
        int defaultHash = System.identityHashCode(Boss);
        int modifyHash = Boss.hashCode();

        IO.println("The Default harshcode = " + defaultHash + ", Modified hashCode = " + modifyHash);

        String defaultToString = Objects.toIdentityString(Boss);
        String modifiedToString = Boss.toString();

        IO.println("The Default toString = " + defaultToString + " ,Modified toString = " + modifiedToString);

        boolean result = Super[0].equals(Boss);
        boolean Result = Boss.equals(Super[0]);

        IO.println("Result = " + result + "=" + "Result = " + Result);
    }
}
