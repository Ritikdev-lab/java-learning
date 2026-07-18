package io.github.ritikdevlab.learning.Ch3.Arrays;

import java.util.Arrays;

public class MultiDemo {
    public static void main(String[] args) {
        //// This is Array Declaration + Allocation + Manual Initialization
        int[][] matrix;
        matrix = new int[2][3];// Here there are 2 rows and 3 columns
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        IO.println(matrix[1][0]);
        IO.println(Arrays.deepToString(matrix));

        // This is Array declaration + initialization
        double[][] matrix1 = new double[2][4];// Here there are 2 rows and 4 colums
        matrix1[0][0] = 1.1;
        matrix1[0][1] = 2.2;
        matrix1[0][2] = 3.3;
        matrix1[0][3] = 4.4;
        matrix1[1][0] = 5.5;
        matrix1[1][1] = 6.6;
        matrix1[1][2] = 7.7;
        matrix1[1][3] = 8.8;
        IO.println(Arrays.deepToString(matrix1));

        // This is initializing a multidimensional array without a call to new
        int[][] marks = { { 20, 30, 40 }, { 50, 60, 70 } };
        IO.println(Arrays.deepToString(marks));

        // This is the aninomous array in Multidimentional array
        int[][] box = new int[][] { { 2, 5, 6 }, { 4, 7, 9 }, { 2, 1, 6 } };
        IO.println(Arrays.deepToString(box));

        // Use of 'enhance for loop' for Multidimentional array
        for (int[] num5 : marks) {
            for (int num6 : num5) {
                IO.print(num6 + " ");// Prints numbers in the same line
            }
            IO.println();// Moves to the next line, so the next row prints below it
        }

        // Populate 'number' using random elements FROM 'marks'
        int[][] number = new int[2][3];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                // Pick a random row index (0 or 1) based on marks length
                int a = (int) (Math.random() * number.length);
                // Pick a random column index (0, 1, or 2) based on that row's length
                int b = (int) (Math.random() * number[a].length);
                // Assign the randomly picked value to the new array
                number[i][j] = marks[a][b];
            }
        }
        // Sort the 2D array (row by row)
        for (int[] row : number) {
            Arrays.sort(row);
        }
        // Print the final result
        IO.println("Final random and sorted array is:- ");
        IO.println(Arrays.deepToString(number));

        // Allocate the array and fill it using loop
        int[][] uber = new int[2][3];
        for (int a = 0; a < uber.length; a++) {
            for (int b = 0; b < uber[a].length; b++) {
                uber[a][b] = (a * 3) + (b + 3);
            }
        }
        IO.println(Arrays.deepToString(uber));

        boolean Qn = Arrays.deepEquals(number, box);
        IO.println(Qn);
    }
}
