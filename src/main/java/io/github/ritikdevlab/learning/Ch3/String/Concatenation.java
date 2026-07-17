package io.github.ritikdevlab.learning.Ch3.String;
public class Concatenation {
    public static void main(String[] args) {
        String a = "This is";
        String b = "class";
        IO.println("Output = " + a + b);
        
        String n = "This is";
        String m = " class";
        IO.println("Output =  " + n + m);

        int age = 16;
        String rate = "pg" + age;
        IO.println("Output = " + rate);
        

        int num1 = 12;
        int num2 = 2;
        int result = num1 + num2;
        IO.println("The answer is " + result);

        // Demonstration of String.join method.
        String all = String.join("&","R","B","D","L","J");
        IO.println("Result = " + all);
        
        // Demonstration of repeat method.
        String repeated = "java".repeat(3);
        IO.println("Output = " + repeated);
        

        String z = "Ritik";
        String x = z.repeat(4);
        IO.println("Output = " + x);

        /**
         * Below the age become 421 instead of 43
         *  Because When a String appears first, 
         *  Java converts everything after it into a String and just joins them.
         */
        int fromAge = 42;
        String output = "Next year, you'll be " + fromAge + 1 + ".";
        IO.println("Age Become = " + output);

        // Below we use parentheses so not be confused and the answer will come is 46.
        int initialAge = 45;
        String ageBecome = "Next year, you'll be " + (initialAge + 1) + ".";
        IO.println("Age Become = " + ageBecome);
        
    }
}
