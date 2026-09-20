package io.github.ritikdevlab.learning.ch3.values;

public class VariableValue {
    public static void main(String[] args) {
        /**
         * 1. For variable we use 'var'.
         * 
         * 2. It autometically assign the the data types required.
         */
        
        var num1 = 12;
        var num2 = 13;
        var num3 = num1 + num2;
        IO.println("Sum = "+ num3);
    }
}
