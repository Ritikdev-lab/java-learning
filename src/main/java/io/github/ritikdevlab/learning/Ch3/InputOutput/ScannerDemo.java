package io.github.ritikdevlab.learning.Ch3.InputOutput;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IO.println("Enter name:- ");
    
        // Demonstration of nextLine() method.
        String name = sc.nextLine();
        IO.println("Name:- " + name);
        IO.println("Enter age:- ");
    
        // Demonstraion of nextInt() method.
        int age = sc.nextInt();
        IO.println("Age:- " + age);
        IO.println("Enter PI");
    
        // Demonstration of nextDouble() method.
        double PI = sc.nextDouble();
        IO.println("Pi:- " + PI);
        // Below it consume the new line
        sc.nextLine();
        IO.println("Enter name:- ");
    
        // Demonstration of next() method.
        String name2 = sc.next();
        IO.println("Name:- " + name2);
    
        // Demonstration of hasNext() method.
        boolean name3 = sc.hasNext();
        IO.println("Name:- " + name3);
        
        // Demonstrates of hasNextInt() method.
        boolean name4 = sc.hasNextInt();
        IO.println("Number:- " + name4);
    
        // Demonstrates of hasNextDouble() method.
        boolean name5 = sc.hasNextDouble();
        IO.println("Name:- " + name5);
        sc.close();  
    }
}
