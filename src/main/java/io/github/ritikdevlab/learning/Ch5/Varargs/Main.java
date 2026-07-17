package io.github.ritikdevlab.learning.Ch5.Varargs;

public class Main {
    public static void main(String[] args) {
        //Test of the the Method highestNumber
        int findhighestNumberTest = Varargs.highestNumber(1, 3, 6, 10, 20, 100);
        IO.println("The Highest number is " + findhighestNumberTest);

        //Test of the Method findNumber
        int findResult = Varargs.findNumber(12, 1, 12, 7, 9, 10, 40, 1000, 13);
        IO.println("The index of 12 is " + findResult);
    }
}
