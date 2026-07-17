package io.github.ritikdevlab.learning.Ch3.DateType;
public class IntegerDataType {
    public static void main(String[] args) {
        /**
         * 1. In long the L is used at the end of he value. Ex-123463135L.
         * 
         * 2. Underscore = _ .
         * 
         * 3. When arithmetic(+, -, *, /, %) is performed by byte, short, char
         *      they autometically promoted to int.
         * 
         * 4. Binary numbers in java are prefixed with 0b or 0B.
         * 
         * 5. For Hexadecimal number the prefix is 0x or 0X.
         */
        
        int firstInteger = 111;
        int secondInteger = 111;
        int integerSum = firstInteger + secondInteger;
        IO.println("Sum Result= "+ integerSum);
    
        byte byteValue1 = 100;
        byte byteValue2 = 50;
        byte cash3 = (byte)(byteValue1 - byteValue2);
        IO.println("Difference = " + cash3);
    
        short shortValue1 = 200;
        short shortValue2 = 100;
        short divisionResult = (short)(shortValue1 / shortValue2);
        IO.println("Divide Result" + divisionResult);
        
        /**
         * Demonstrates the implicit casting.
         * Here the int value automatically converted to long.
         */ 
        long longNum1 = 122;
        long longNum2 = 111;
        long sumResult = longNum1 + longNum2;
        IO.println("Sum result = " + sumResult);

        long longValue = 123097846251L;
        IO.println("Value = " + longValue);
    
        // Demonstrates the Binary literals.
        int binaryvalue = 0b101;
        IO.println("Number = " + binaryvalue);
    
        // Demonstrates Hexadecimal literals.
        int hexadecimalNumber = 0x7E;
        IO.println("Number = " + hexadecimalNumber);
    
        // underscore improves readability and are ignored by compiler.
        int improveNumber = 10_000_000;
        IO.println("Number = " + improveNumber);
    }
}   
