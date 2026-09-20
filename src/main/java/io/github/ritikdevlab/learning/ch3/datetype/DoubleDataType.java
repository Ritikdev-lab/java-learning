package io.github.ritikdevlab.learning.ch3.datetype;

public class DoubleDataType {
    public static void main(String[] args) {
        /**
         * 1. Double is default.
         * 
         * 2. Only in float "f" is required at last of the value. Ex-12.23f.
         */
        
        float flotValue1 = 12.234f;
        float flotValue2 = 1.2344f;
        float totalFloatValue = flotValue1 + flotValue2;
        IO.println("Sum = " + totalFloatValue);

        double doubleValue1 = 123.12;
        double doubleValue2 = 12.23;
        double computedDifference = doubleValue1 - doubleValue2;
        IO.println("Difference = " + computedDifference);

        // Demonstrate of getting infinity.
        double decimalNumber1 = 2.22;
        double decimalNumber2 = 0;
        double result = decimalNumber1 / decimalNumber2;
        IO.println("Division Result = " + result);
        
        // Demonstrates of getting negetive infinity.
        float negativeFloatValue = -1.12f;
        float myFloatValue = 0f;
        float resultOfDivision = negativeFloatValue / myFloatValue;
        IO.println("Division Result = " + resultOfDivision);
        
        // Demonstrates of getting NaN.
        float firstFlotValue = 0f;
        float secondFlotValue = 0f;
        float divisionResult = firstFlotValue / secondFlotValue;
        IO.println("Division Result = " + divisionResult);
    }
}
