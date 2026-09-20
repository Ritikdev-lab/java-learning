package io.github.ritikdevlab.learning.ch3.controlflow;


public class Conditional {
    public static void main(String[] args) {
        // Demonstration of if statement.
        if (3 < 5) {
            IO.println("I Am Right!");
        }

        // Demonstration of if-else statement.
        int a1 = 15;
        int b = 14;
        if (a1 > b) {
            IO.println("a is greater than b");
        } else {
            IO.println("b is greater than a");
        }

        int i = Integer.parseInt(IO.readln("Give the number"));
        if (i < 15 && i > 5)
            IO.println(i);
        else
            IO.println("Sorry you are wrong");

        // Demonstration of if-else if-else statement
        int x = 12;
        int y = 13;
        int z = 14;
        if (x > y && x > z) {
            IO.println(12);
        } else if (y > z) {
            IO.println(13);
        } else {
            IO.println(14);// There is no limit to use else if
        }
    }
}
