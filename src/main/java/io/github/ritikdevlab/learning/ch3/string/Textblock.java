package io.github.ritikdevlab.learning.ch3.string;

public class Textblock {
    public static void main(String[] args) {
        String text = """
                My name is Ritik sabat.
                I like the java.
                """;
        IO.println("Line:- " + text);

        // Add line/join line => \
        String newText = """
                My name is Ritik.\
                I like the java
                """;
        IO.println("Line:- " + newText);

        // Add space => \s
        String textWithSpace = """   
                My name is Ritik sabat.\
                I like the java\s.
                """;
        IO.println("Like:- " + textWithSpace);
    }
}
