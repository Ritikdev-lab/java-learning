package io.github.ritikdevlab.learning.ch3.string;

public class Index {
    public static void main(String[] args) {
        // Demonstrates the use of length instance method.
        String name = "Ritiksabat";
        IO.println("Length:- " + name.length());

        // Demonstrates the use of substring instance method.
        String sentence = "Thisisjava";
        IO.println("Substring:- " + sentence.substring(6));
    
        // Demonstrates the use of indixOf instance method.
        String forMethod = "Thisisdog";
        IO.println("Index of 'This':- " + forMethod.indexOf("This"));
    
        // Demonstrates the use of charAt instance method.
        String subject = "Iamgoingtoschool";
        IO.println("Character at 0:- " + subject.charAt(0));
    
        String first = "banana";
        String second = "an";
        int find = first.indexOf(second);
        int sum = find + second.length();
        IO.println("Find Index Of 'an':- " + find);
        IO.println("Sum Result:- " + sum);

        String forExperiment = "Ritiksabat";
        String character = "a";
        int result = forExperiment.indexOf(character);
        int methodSum = result + character.length();
        IO.println("Find Index Of 'a':- " + result);
        IO.println("Sum:- " + methodSum);
    
        // Demonstraton of substring instance method.
        String strangeName = "Blackred";
        String colour = strangeName.substring(2,5);
        IO.println("Sub-String from index 2 to 5 is " + colour);
    
    }
}
