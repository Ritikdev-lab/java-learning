package io.github.ritikdevlab.Example;

import java.util.Arrays;

/**
 * This program demonstrates array manipulation.
 */
public class LotteryDrawing {

    void main() {
        int k = Integer.parseInt(
            IO.readln("How many numbers do you need to draw? ")
        );

        int n = Integer.parseInt(
            IO.readln("What is the highest number you can draw? ")
        );

        // fill an array with numbers 1 2 3 . . . n
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;
        // it stores all the numbers from 1 to highest numbers in numbers[]

        // draw k numbers and put them into a second array
        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            // Here it runs maximum of n numbers and if higher than this,
            // the program will not run

            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);

            // Math.random() gives values from 0.0 to less than 1.0
            // multiplying by n scales the range to 0 to n - 1

            // store the element at the random location in result[i]
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];

            // reduce the available range
            n--;
        }

        // print the sorted array
        Arrays.sort(result);

        // The purpose of Arrays.sort(result); is to arrange the
        // randomly drawn numbers in ascending order

        IO.println("Bet the following combination. It'll make you rich!");

        // This is enhanced for loop
        for (int r : result)
            IO.println(r);
    }
}