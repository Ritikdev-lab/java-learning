package io.github.ritikdevlab.learning.ch5.reflection;

import java.lang.reflect.Constructor;
import java.util.Date;

public class ClassObject {
    static class Employee {
        public Employee() {}
        public Employee(String name) {
            IO.println("Employee name:- " + name);
        }
        public void getProfession() {
            IO.println("I am an employee");
        }
    }

    static class Manager extends Employee {
        @Override
        public void getProfession() {
            IO.println("I am an manager");
        }
    }

    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE {
            @Override
            public String toString() {
                return "XL";
            }
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {
        Employee e = new Manager();

        IO.println("class name With class = " + e.getClass());
        IO.println("class name with without class = " + e.getClass().getName());

        IO.println("-".repeat(25));

        // if the class name is in a package,the package name is part of the classname.
        var now = new Date();
        Class cl = now.getClass();
        String className = cl.getName();
        IO.println("The fully qualified class name:- " + className);
        IO.println("Or");
        IO.println("The fully qualified class name:- " + now.getClass().getName());

        IO.println("-".repeat(25));

        String fullClassName = "java.util.Date";
        Class cla = Class.forName(fullClassName);
        IO.println("With Class:- " + cla);

        IO.println("-".repeat(25));

        // It gives the type class.
        Class cl1 = Date.class;
        Class cl2 = int.class; // Here the int is not a class but type class.
        Class cl3 = Double[].class;
        IO.println("The Object of type class:- " + cl1 + ", " + cl2 + ", " + cl3);

        IO.println("-".repeat(25));

        if (e.getClass() == Manager.class && e.getClass().getName() == Manager.class.getName()) {
            IO.println("The experiment is a success");
        } else {
            IO.println("Experiment is not a success");
        }

        IO.println("-".repeat(25));

        if (Size.EXTRA_LARGE.getClass() == Size.class
                && Size.EXTRA_LARGE.getClass().getName() == Size.class.getName()) {
            IO.println("Enum class Experiment check is a success");
        } else {
            IO.println("Enum class Experiment check is not a success");
        }

        IO.println("-".repeat(25));

        var nameOfClass = "java.util.Date";
        Class newClass = Class.forName(nameOfClass);
        Object obj = newClass.getConstructor().newInstance();
        IO.println(obj.toString());

        IO.println("Or");

        Class forExperiment = Employee.class;
        Constructor getConst = forExperiment.getConstructor(String.class);
        @SuppressWarnings("unused")
        Object getObj = getConst.newInstance("Ritik");

        IO.println("-".repeat(25));

        // Use of printStackTrace() method
        try {
            @SuppressWarnings("unused")
            int x = 10 / 0;
        } catch (ArithmeticException l) {
            l.printStackTrace();
        }
    }
}
