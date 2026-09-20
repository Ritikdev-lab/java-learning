package io.github.ritikdevlab.learning.ch3.string;

public class Api {
    public static void main(String[] args) {
        // Demonstration of charAt instance method.
        String name = "Rabin sabat";
        char check = name.charAt(0);
        IO.println("Character at 0 is " + check);

        String getSubString = name.substring(0, 5);
        IO.println("Sub-String is " + getSubString);

        int length = name.length();
        IO.println("Length:-" + length);

        boolean checkEqual = name.equals("Rabin sabat");
        IO.println("Check Result:- " + checkEqual);

        boolean checkEqualIgnoreCase = name.equalsIgnoreCase("rabin sabat");
        IO.println("Check Result:- " + checkEqualIgnoreCase);

        // Demonstration of compareTo instance method.
        int compare = name.compareTo("sabat Rabin");
        IO.println("Compare Result:- " + compare);

        // Demonstration of compareToIgnoreCase instance method.
        int compareIgnoreCase = name.compareToIgnoreCase("sabat rabin");
        IO.println("Compare Result:- " + compareIgnoreCase);

        boolean checkEmpty = name.isEmpty();
        IO.println("Check Result:- " + checkEmpty);

        String empty = " ";
        boolean blank = empty.isEmpty();
        IO.println("Check Result:- " + blank);

        // Demonstration of startWith instance method.
        String word = "Ritik";
        boolean CheckStart = word.startsWith("R");
        IO.println("Check Result:- " + CheckStart);

        // Demonstration of endsWith instance method.
        IO.println(word.endsWith("k"));
        int getIndex = name.indexOf("sabat");
        IO.println("Index of 'sabat' is " + getIndex);

        // Demonstration of indexOf(String str, int fromIndex) instance method.
        String text = "Hello World Hello";
        int findSubString = text.indexOf("Hello", 5);
        IO.println("Find Index of 'Hello' Starting from index 5:- " + findSubString);

        // Demonstration of lastIndexOf instance method.
        String wordForCheck = "banana";
        int checkLast = wordForCheck.lastIndexOf('a');
        IO.println("Find Index Of 'a' From Last:-" + checkLast);
        
        String textForExperiment = "hello hi hello";
        int checkFromLast = textForExperiment.lastIndexOf("hello", 8);
        IO.println("Find Index Of 'hello' from Last:- " + checkFromLast);

        // Demonstration of replace instance method.
        String forExperiment = "i like java";
        String replacedResult = forExperiment.replace("java", "python");
        IO.println(forExperiment + " Become " + replacedResult);

        // Demonstration of toUpperCase instance method.
        String forConversion = "hello";
        String k2 = forConversion.toUpperCase();
        IO.println(forConversion + " Become " + k2);

        // Demonstration of toLowerCase() instance method.
        IO.println("HELLO".toLowerCase());

        // Demonstration of strip() instance method.
        String WithWhiteSpace = " Hello world ";
        String operationResult = WithWhiteSpace.strip();
        IO.println("Result:- " + operationResult);

        // Demonstration of stripLeading instance method.
        String forRemoveSpace = " Hello world ";
        String withoutSpace = forRemoveSpace.stripLeading();
        IO.println("Result:- " + withoutSpace);
        
        // Demonstration of stripTrailing() instance method.
        String removeingSpace = " Hello world ";
        String removedSpace = removeingSpace.stripTrailing();
        IO.println("Result:- " + removedSpace);

        // Demonstration of join instance method.
        String joinedResult = String.join("-", "A", "B", "C");
        IO.println("Joined Result:- " + joinedResult);

        // Demonstration of repeat instance method.
        IO.println("Hi".repeat(3));
    }
}
