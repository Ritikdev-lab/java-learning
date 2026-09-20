package io.github.ritikdevlab.learning.ch5.abstractclasses;

public class Student extends Person{
    private String major;
    /**
     * Construct a Student object.
     * 
     * @param name the student's name
     * @param major the student's major
     * @author Ritikdev-lab
     * @since 1.0
     * @version 1.0
     */
    public Student(String name, String major) {
        //pass name to superclass constructor
        super(name);
        this.major = major;
    }
    /**
     * Return a description of this student.
     *
     * @return a description of the student
     * @author Ritikdev-lab
     * @since 1.0
     * @version 1.0
     */
    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
