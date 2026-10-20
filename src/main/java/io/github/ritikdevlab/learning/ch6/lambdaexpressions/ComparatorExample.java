package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        People[] person = {
            new People("Haria Dash", 41, null),
            new People("Haria Nayak", 31, "Kumar"),
            new People("Ram Pradhan", 21, "Chandra"),
            new People("Debasish Nayak", 51, null),
            new People("Amit Nayak", 25, "Kumar"),
            new People("Rahul Dash", 35, "Prasad"),
            new People("Priya Sharma", 25, null),
            new People("Neha Pradhan", 35, "Rani")
        };

        // 1. comparing(): Sort by full name
        IO.println("\n1. Sort by full name:");
        Arrays.sort(person, Comparator.comparing(People::getName));
        printPeople(person);

        // 2. thenComparing(): First name, then age
        IO.println("\n2. First name, then age:");
        Arrays.sort(person,Comparator.comparing(People::getFirstName).thenComparingInt(People::getAge));
        printPeople(person);

        // 3. comparingInt(): Sort by age
        IO.println("\n3. Sort by age:");
        Arrays.sort(person,Comparator.comparingInt(People::getAge));
        printPeople(person);

        // 4. comparing(): Sort by name length
        IO.println("\n4. Sort by name length:");
        Arrays.sort(person,Comparator.comparingInt(p -> p.getName().length()));
        printPeople(person);

        // 5. nullsFirst(): Null middle names first
        IO.println("\n5. Null middle names first:");
        Arrays.sort(person,Comparator.comparing(People::getMiddleName,Comparator.nullsFirst(Comparator.naturalOrder())));
        printPeople(person);

        // 6. nullsLast(): Null middle names last
        IO.println("\n6. Null middle names last:");
        Arrays.sort(person,Comparator.comparing(People::getMiddleName,Comparator.nullsLast(Comparator.naturalOrder())));
        printPeople(person);

        // 7. naturalOrder(): Alphabetical order
        IO.println("\n7. Natural order:");
        String[] names = {"Ram", "Amit", "Neha", "Haria"};
        Arrays.sort(names, Comparator.naturalOrder());
        IO.println(Arrays.toString(names));

        // 8. reverseOrder(): Reverse alphabetical order
        IO.println("\n8. Reverse natural order:");
        Arrays.sort(names, Comparator.reverseOrder());
        IO.println(Arrays.toString(names));

        // 9. reversed(): Age descending
        IO.println("\n9. Age descending:");
        Arrays.sort(person,Comparator.comparingInt(People::getAge).reversed());
        printPeople(person);
    }

    public static void printPeople(People[] person) {
        for (People p : person) {
            IO.println(p.getName() + " - " + p.getAge() + " | Middle name: " + p.getMiddleName());
        }
    }
}

class People {
    private String name;
    private int age;
    private String middleName;

    public People(String name, int age, String middleName) {
        this.name = name;
        this.age = age;
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return name.substring(0, name.indexOf(" "));
    }

    public String getLastName() {
        return name.substring(name.indexOf(" ") + 1);
    }

    public int getAge() {
        return age;
    }

    public String getMiddleName() {
        return middleName;
    }
}