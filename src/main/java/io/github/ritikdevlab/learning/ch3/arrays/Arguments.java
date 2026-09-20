package io.github.ritikdevlab.learning.ch3.arrays;

public class Arguments {
    public static void main(String[] args) {
        IO.print(switch (args[0]) {
            case "-a" -> "Hi";
            case "-b" -> "Bye";
            case "-h" -> "Hello,";
            default -> args[0];
        });
        IO.print(" " + args[1]);
        IO.println("!");
    }// Input->java Arguments.java -h World.Output->Hello, World!
     // If default print that word
}
