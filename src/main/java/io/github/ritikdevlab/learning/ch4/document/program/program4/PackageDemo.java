package io.github.ritikdevlab.learning.ch4.document.program.program4;

import io.github.ritikdevlab.learning.ch4.document.program.program3.employee;

//The Employee class is defined in that package
/**
 * This program demonstrates the use of package
 */
public class PackageDemo {
    void main() {
        //Because of the import statement,we donot have to use
        //program.program3.Employee here
        var harry = new employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);
        //Because of the static import statement,we do not have to use IO.println here
        IO.println("name = " + harry.getName() + ",salary = " + harry.getSalary());
    }
}
