package io.github.ritikdevlab.learning.ch3.operators;

public class Convertersion {
    public static void main (String[] args) {
  
        //1. If either of the operands is of type double, the other one will be converted to a double
        int a = 12;
        double b = 12.2;
        double sumResult = a + b;
        IO.println("Sum in double = " + sumResult);
    
        //2. if either of the operands is of type float, the other one will be converted to a float
        int d = 23;
        float e = 1.3f;
        float floatSum = d + e;
        IO.println("Sum in float = " + floatSum);
    
        //3. if either of the operands is of type long, the other one will be converted to a long
        long g = 11;
        int h = 12;
        long result = g + h;
        IO.println("Sum in long = " + result);
    
        //4. Otherwise, both operands will be converted to an int
        byte i = 3;
        int j = 1;
        int intSum = i - j;
        IO.println("Sum in int = " + intSum);
    
    }
}
