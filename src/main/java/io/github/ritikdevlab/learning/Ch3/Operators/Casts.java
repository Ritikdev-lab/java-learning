package io.github.ritikdevlab.learning.Ch3.Operators;
public class Casts {
    public static void main (String[] args) {
        /**
         * 1. Implicit casting is done from lower value to higher value 
         *      and done autometically byte-> short-> int-> long-> float-> double 
         *      if we give the data type. 
         *      Ex- long change = b(which is declared byte 3) -> long change = 3.
         * 
         * 2. Explicit casting is done from from higher value to lower value 
         *      and done manually like-double, float, long, int, short, byte.
         * 
         * 3. For explicit casting use the type to cast in parenthesis 
         *      like-(int) for int casting.
         * 
         * 4. When arithmetic(+, -, *, /, %) is performed by byte, short, char
         *      they autometically promoted to int without need for any data type.
         *      Ex- a(byte) + b(byte) become int even if we do not use the int data tye. 
         */
        double x = 9.997;
        int nx = (int) x;
        IO.println("In int = " + nx);
    
        // Demonstration of Math.round() method
        double d = 9.997;
        int nd = (int) Math.round(d);
        IO.println("In int = " + nd);
    
        int num1 = 123;
        byte num2 = (byte) num1;
        IO.println("In byte = " + num2);

        int num3 = 257;
        byte number = (byte) num3;
        IO.println("In byte = " + number);
    }
}
