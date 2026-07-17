package io.github.ritikdevlab.learning.Ch3.Operators;
public class BitwiseOperator {
    public static void main(String[] args) {
        /**
         * 1. Bitwise AND = &, Bitwise OR = |, Bitwise XOR = ^, BitWise NOT = ~
         *      Left shift = <<, Right shift = >>, Unsigned right shift = >>>.
         */
        int num = 5;
        IO.println("Binary Number:- " + Integer.toBinaryString(num));

        int number = 6;
        IO.println("Binary Number:- " + Integer.toBinaryString(number));

        int operation = num & number;
        IO.println("Result = " + operation);
        IO.println("Binary Number:- " + Integer.toBinaryString(operation));

        long longNumber = 7;
        IO.println("Binary Number:- " + Long.toBinaryString(longNumber));

        long forConversion = 6;
        IO.println("Binary Number:- " + Long.toBinaryString(forConversion));

        long orOperation = longNumber | forConversion;
        IO.println("Operation Result:- " + orOperation);
        IO.println("Binary Conversion:- " + Long.toBinaryString(orOperation));

        short shortNumber = 6;
        IO.println("Binary Number:- " + Integer.toBinaryString(shortNumber));

        short forConvert = 7;
        IO.println("Binary Number:- " + Integer.toBinaryString(forConvert));

        short xorOperation = (short) (shortNumber ^ forConvert);
        IO.println("Operation Result:- " + Integer.toBinaryString(xorOperation));

        byte byteNumber = 6;
        IO.println("Binary Number:- " + Integer.toBinaryString(byteNumber));

        byte forNotOperation = (byte) (~byteNumber);
        IO.println("Binary Number:- " + Integer.toBinaryString(forNotOperation));

        int intNumber = 7;
        IO.println("Binary Number:- " + Integer.toBinaryString(intNumber));

        int leftShiftOperation = intNumber << 1;
        IO.println("Operation Result:- " + leftShiftOperation);
        IO.println("Binary Conversion:- " + Integer.toBinaryString(leftShiftOperation));

        int intFirstNumber = 10;
        int rightShiftOperation = intFirstNumber >> 1;
        IO.println("Binary Conversion:- " + Integer.toBinaryString(rightShiftOperation));

        int negativeNumber = -12;
        IO.println("Binary Conversion:- " + Integer.toBinaryString(negativeNumber));

        int referance = negativeNumber >>> 2;
        IO.println("Operation Result:- " + referance);
        IO.println("Binary conversion:- " + Integer.toBinaryString(referance));
    }
}
