package io.github.ritikdevlab.learning.ch3.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        /**
         * 1. This is called Ternary or conditional operator(condition ? a : b).
         * 2. In ternary operator if the condition is true return a and if not return b.
         */
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        IO.println("Ans = " + max);

        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        IO.println(result);
    
        // Demonstration of nested ternary
        int a1 = 10, b1 = 20, c = 30;
        int max1 = (a1 > b1) 
                ? (a1 > c ? a1 : c) 
                : (b1 > c ? b : c);
        System.out.println("Max = " + max1);
    }
}
