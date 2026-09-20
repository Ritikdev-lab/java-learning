package io.github.ritikdevlab.learning.ch3.operators;

public class AssignmentOperator {
    public static void main(String[] args) {
        /**
         * 1. In it the given mathematical operation is done first between 
         *      the variable and given number and then it is assigned to that variable.
         *      Ex-num += 3 => num = num + 3.
         */
        // Demonstration of additional assignment operator.
        long numForSum = 12;
        long sumResult = numForSum += 3;
        IO.println("Addition Result = "+ sumResult);

        // Demonstration of multiplication assignment operator.
        byte numForMultiply = 12;
        int multiplyResult = numForMultiply *= 2;
        IO.println("Multiplication Result = " + multiplyResult);

        // Demonstration of Substraction assignment operator.
        int assignmentValue = 14;
        float result = assignmentValue -= 3;
        IO.println("Subtraction Result = " + result);

        // Demonstration of Division assignment operator.
        int value = 24;
        int divisionResult = value /= 12;
        IO.println("Division Result = " + divisionResult);

        // Demonstration of remainder assignment operator.
        float initialValue = 8;
        float remainder = initialValue %= 3;
        IO.println("Remainder = " + remainder);
    }
}
