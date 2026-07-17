package io.github.ritikdevlab.learning.Ch3.InputOutput;
public class Input25 {
    public static void main(String[] args) {
        // Demonstration of readln method.
        String name = IO.readln("What is your name:");
        IO.println("Age: "+name);

        // Demonstation of Integer.parseInt() method.
        int age = Integer.parseInt(IO.readln("What is the age:"));
        IO.println("Age: "+age);

        // Demonstration of Double.parseDouble() method.
        double PI = Double.parseDouble(IO.readln("What is the value of PI:"));
        IO.println("PI: "+PI);
    } 
}
