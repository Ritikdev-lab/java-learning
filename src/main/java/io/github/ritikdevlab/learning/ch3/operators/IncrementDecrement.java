package io.github.ritikdevlab.learning.ch3.operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        /**
         * 1. In pre-increment or pre-decrement first increase or decrease by 1 then use it.
         *      Ex- 2 * ++b => first b result(assume 2) increase to 3 then 2 * 3 = 6. same for another.
         * 
         * 2. In post-increment or post-decrement first use it then increse or decrese by 1.
         *      Ex- 2 * d-- => first d result(assume 3) * 2 = 6 which is then decrease by 1 = 5.same for another.
         * 
         * 3. In Java, arithmetic operations with byte, short, or char are promoted to int
         */
        //Demonstration of pre-increment. 
        long a = 7;
        long b = 2 * ++a;
        IO.println("Pre-increment Result:- " + b);
    
        // Demonstration of post-increment 
        int c = 7;
        int d = 2 * c++;
        IO.println("Post-increment Result:- " + d);
    
        // Demonstration of post-decrement
        int number = 12;
        number--;
        IO.println("Post-decrement Result:- " + number);

        // Demonstration of pre-decrement
        byte num = 13;
        byte devideResult = (byte) (24 / --num);
        IO.println("Pre-decrement Result in byte:- " + devideResult);
    } 
}
