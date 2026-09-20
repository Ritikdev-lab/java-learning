package io.github.ritikdevlab.learning.ch3.values;

public class ConstantValue {
    public static void main(String[] args) {
        /**
         * 1. For making a value Constant we use 'final'.
         * 
         * 2. The Constant value can not be changed.
         * 
         * 3. For Constant variable we write it in upper case letters.
         *      Ex-SPEED_OF_LIGHT
         * 
         * 4. For nomal variable we write it in lowercase.
         *      Ex-normalSpeed
         */
        
        final double PI = 3.14159;
        IO.println("PI Value = " + PI);
    }
}
