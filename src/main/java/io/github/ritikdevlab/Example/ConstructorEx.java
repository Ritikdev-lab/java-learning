package io.github.ritikdevlab.Example;
import java.util.random.RandomGenerator;

/**
 * Demonstrates object construction using overloaded constructors,
 * static initialization blocks, and instance initialization blocks.
 */
public class ConstructorEx {
    /**
     * Create several employee objects using different constructors
     * and displays there information.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        //fill the staff array with three Employee object
        var staff = new Employe[3];
        staff[0] = new Employe("Harry" ,40000);
        staff[1] = new Employe(60000);
        staff[2] = new Employe();
        //print out information about all Employee objects
        for (Employe e : staff) {
            IO.println("name = " + e.getName() + ",id = " + e.getId()
            + ",salary = " + e.getSalary());
        }
    }
}
/**
 * {@literal This class demonstrates:}
 * 
 * <ul>
 *    <li>Overloaded constructor</li>
 *    <li>Static initialization blocks</li>
 * </ul>
 * 
 * @author Ritikdev-lab
 * @since 1.0
 */
class Employe {
    private static int nextId;
    private int id;
    //instance field initialization
    private String name = "";
    private double salary;
    private static RandomGenerator generator = RandomGenerator.getDefault();
    //static initiation block
    static {
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }
    //object initiation block
    {
        id = nextId;
        nextId++;
    }
    /**
     * Construct an employee with the specific name and salary.
     * 
     * @param n the employee name
     * @param s the employee salary
     */
    public Employe(String n, double s) {
        name = n;
        salary = s;
    }
    /**
     * Construct an employee with an automatically generated name.
     * 
     * @param s the employee salary
     */
    public Employe(double s) {
        //call the Employee(String,double) construntor
        this("Employee#" + nextId, s);
    }
    /**
     * Construct an employee with default values.
     */
    public Employe() {
        //name initialized to ""-- see above
        //salary not explicitly set-initialized to 0
        //id initialized in initialization block
    }
    /**
     * {@return the employee name}
     */
    public String getName() {
        return name;
    }
    /**
     * {@return the employee salary}
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Return the employee identifier.
     * 
     * @return the employee id 
     */
    public int getId() {
        return id;
    }
}
