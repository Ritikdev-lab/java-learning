package io.github.ritikdevlab.learning.Ch3.InputOutput;
import java.lang.IO;
public class Io {
    public static void main(String[] args) {
        IO.println("Hello");
        IO.println(100);

        System.out.print("Hello ");
        System.out.print("World");
        System.out.println("Line 1");
        System.out.println();
        System.out.println("Line 2");

        String name = IO.readln("Enter your name: ");
        System.out.println(name);
        
        String input = IO.readln();
        System.out.println(input);
    }
}
