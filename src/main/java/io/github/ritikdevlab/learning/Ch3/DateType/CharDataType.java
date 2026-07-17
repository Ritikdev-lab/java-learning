package io.github.ritikdevlab.learning.Ch3.DateType;
public class CharDataType {
    public static void main(String[] args) {
        /**
         * 1. Char data type contains only one character.
         * 
         * 2. It must be inside the ''. Ex-'R'.
         * 
         * 3. "" is used for the String which is sequence character.
         * 
         * 4. Backword slash = \ , Forword slash = /.
         */
        // Demonstrates Unicode uses.
        char unicodeValue = '\u2764';
        IO.println("Character = " + unicodeValue);

        char charValue = 'R';
        IO.println("Character = " + charValue);

        // Demonstrates Explicit casting uses.
        char explicitChar = (char) (65);
        IO.println("Value = " + explicitChar);

        // Demonstrates the escape sequence.
        IO.println("Hello\nWorld");
        IO.println("Ritik\u0008sabat");

        String name = "Rabin\u0020sabat";
        IO.println("Name = " + name);

        // Demonstrates the incrementation in Char data type.
        char forIncrement = 'a';
        char incremented = forIncrement++;
        IO.println("increment Of a = " + incremented);
    }
}
