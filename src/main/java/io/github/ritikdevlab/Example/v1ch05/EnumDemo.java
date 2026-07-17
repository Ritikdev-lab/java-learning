package io.github.ritikdevlab.Example.v1ch05;
/**
 * This program demonstrates enumerated types
 */
public class EnumDemo {
    public static void main(String[] args) {
        String input = IO.readln("Enter a size:(SMALL, MEDIUM, LARGE, EXTRA_LARGE):").toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        IO.println("size = " + size);
        IO.println("abbreviation = " + size.getAbbbreviation());
        if (size == Size.EXTRA_LARGE) {
            IO.println("Good job--you paid attention to the _.");
        }
    }
    
    enum Size{
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
        private String abbreviation;
        private Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }
        public String getAbbbreviation() {
            return abbreviation;
        }
    }    
}
