package io.github.ritikdevlab.learning.Ch3.String;
public class Emptystring {
    public static void main(String[] args) {
        // Below the null is a String. null can not be used in equals method.
        String forCheck = "null";
        IO.println("Compair Result:- " + forCheck.equals(null));

        String word = null;
        boolean compare = word == null;
        IO.println("Compair Result:- " + compare);

        // null and empty are different.
        String empty = "";
        IO.println("Check Result:- :- " + (empty.length() == 0));

        // Demonstration of isEmpty instance method.
        String character = "b";
        IO.println("Check Result:- " + character.isEmpty());

        String subString = "rum";
        boolean checkResult = subString != null && subString.length() != 0;
        IO.println("Check Result:- " + checkResult);
        
        String secondEmptyString = "";
        boolean Check = secondEmptyString != null && secondEmptyString.length() != 0;
        IO.println("Check Result:- " + Check);

    }
}
