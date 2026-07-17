package io.github.ritikdevlab.project;
public class SalaryDemo {
    public static void main(String[] args) {
        //Use of var instead of Me[]
        var M = new Me[3];
        M[0] = new Me("Ritik",20_000);
        M[1] = new Me("Rabin",10_000);
        M[2] = new Me("Jagan",50_000);
        for(Me e : M){
            e.raiseSalary(5);
        }
        for(Me e : M) {
            IO.println("Name = " + e.printName() + " ,Salary = " + e.print() + " ,previous salary =" + e.original() + " ,Change = " + e.change());
        }
    }
}

/**
 * Represents an employee and provides opeations for 
 * viewing and updating salary information
 */
class Me {
    private final String name;
    private int salary;
    public int Variable;
    private int originalSalary;
    /**
     * Create an employee with the specific name and salary.
     * 
     * @param n the employee name
     * @param s the initial salary
     */
    public Me (String n,int s) {
        //Here the value first is originalSalary = salary but leter it only salary changes so originalSalary - salary is possible
        this.name = n;
        this.originalSalary = s;
        this.salary = s;
    }
    /**
     * {@return the employee name}
     */
    String printName() {
        return this.name;
    }
    /**
     * {@return current salary}
     */
    int print() {
        return this.salary;
    }
    /**
     * Return the difference between the original salary and the current salary.
     * 
     * @return the salary difference
     */
    int change() {
        this.Variable = this.salary - this.originalSalary;
        return this.Variable;
    }
    /**
     * Return the original salary before any raises.
     * 
     * @return the original salary
     */
    int original() {
        return this.originalSalary;
    }
    /**
     * Increases the salary by a given percentage.
     * 
     * @param byPercent the percent increases
     */
    void raiseSalary(int byPersent) {
        double raise = this.salary * byPersent / 100;
        this.salary += raise;
    }

}