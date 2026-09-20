package io.github.ritikdevlab.learning.ch3.controlflow;

public class LoopsDemo {
    public static void main(String[] args) {
        /**
         * There is 3 types of loops
         * 1. while:- if condition is true run it, else not.
         * 2. do-while:- first run it once, continue looping if condition is true, else not.
         * 3. for:- run the code according to given iterations.
         */
        // Demonstration of "while" loop.
        int balance = 12;
        int goal = 13;
        while (balance < goal) {
            double interest = balance * 1.2;
            IO.println(interest);
            balance++;// If not for false statement, The loop will run indefinitely.
        }

        int num = 2;
        while (num <= 3) {
            IO.println("Number" + num);
            num++;
        }

        // Demonstration of "nested while" loop
        int j = 1;
        while (j <= 5) {
            IO.println("Day" + j);
            int m = 3;
            while (m >= 0) {
                IO.println("Hour" + m);
                m--;
            }
            j++;
        }

        // Demonstraion of "do-while" loop.
        int i = 1;
        do {
            IO.println(1);
            i++;
        } while (i <= 2);

        // Demonstation of "for" loop
        // Simple formula-> for (initialization; condition; update)
        for (int k = 1; k <= 5; k++) {
            IO.println("Number " + k);
        }
    }
}
