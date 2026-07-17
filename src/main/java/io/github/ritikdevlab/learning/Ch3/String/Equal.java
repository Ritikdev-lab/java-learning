package io.github.ritikdevlab.learning.Ch3.String;
public class Equal {
    public static void main(String[] args) {
        // Below the result is true because it compare memory address not the string.
        String word = "Hello";
        String secondWord = "Hello";
        boolean check = word == secondWord;
        IO.println("Check Result:- " + check);

        // Below the result is false because String is equal but the memory address is false
        String greating = "Hello";
        String subString = greating.substring(0,greating.indexOf("llo"));
        String call = "He";
        boolean checkEqual = subString == call;
        IO.println("Check Result:- " + checkEqual);

        // Below the equal() instance method compare two strings according to its characteristics.
        String k2 = "Hello";
        boolean compair = k2.substring(0,k2.indexOf("llo")).equals("He");
        IO.println("Compare Result:- " + compair);
        
        // Demonstration of equalIgnoreCase() instance method.
        boolean result = k2.substring(0,k2.indexOf("llo")).equalsIgnoreCase("he");
        IO.println("Compare Result:- " + result);
    }
}
