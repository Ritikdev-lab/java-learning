package io.github.ritikdevlab.learning.ch5.abstractclasses;

/**
 * This program demonstrates abstract Classes.
 */
public class AbstractClassesDemo {
    void main() {
        var people = new Person[2];
        //fill the people arraay with Student and Employee object
        people[0] = new Employee("Harray Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");
        
        //print out names and description of all Person object
        for(Person p : people) {
            IO.println(p.getName() + "," + p.getDescription());
        }
    }
}
