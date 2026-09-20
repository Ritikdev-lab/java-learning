package io.github.ritikdevlab.learning.ch3.inputoutput;

import java.io.Console;

public class SystemDemo {
    public static void main(String[] args) {
        // It only works on console
        Console c = System.console();
        if (c == null) {
            IO.println("No console available");
            return;
        }
        String name = c.readLine("Enter your name:");
        char[] password = c.readPassword("Enter password:");
        IO.println("Welcome " + name);
        // Replaces every character in the array with ' ' (space).Effectively erases the password from memory
        java.util.Arrays.fill(password,' ');
    }
}
