package io.github.ritikdevlab.learning.Ch5.abstractClasses;

public abstract class Person {
    private String name;
    /**
     * Construct of the Person Object
     * 
     * @param name the name of person
     */
    Person(String name) {
        this.name = name;
    }
    /**
     * The method to get the Person name
     * 
     * @return the name of the person
     */
    public String getName() {
        return name;
    }
    /**
     * Return a description of this person.
     *
     * @return a description of the person
     */
    public abstract String getDescription();
}
