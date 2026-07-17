package io.github.ritikdevlab.learning.Ch3.InputOutput;
import java.util.Locale;
public class Formatting {
    public static void main(String a[]) {
        double x = 10000.0 / 3.0;
        // Here the width of character 8 and precision of 2 characters.     
        System.out.print("%8.2f\n".formatted(x));

        // %d mean Decimal integer and output is 159
        System.out.printf("%d\n", 159);

        // %x mean Hexadecimal and output is 9f
        System.out.printf("%x\n", 159);

        // %o mean octal and output is 237
        System.out.printf("%o\n", 159);

        // %f mean flot number and output is 15.900000
        System.out.printf("%f\n", 15.9);

        // %a mean Hexadecimal floating-point and output is 0x1.fcccccccccccdp3
        System.out.printf("%a\n", 15.9);

        // %e mean Exponential number and output is 1.590000e+01
        System.out.printf("%e\n", 15.9);

        // %g mean general format and it Chooses shorter between %f and %e
        System.out.printf("%g\n", 2.1);

        // %s mean String and output is Hello
        System.out.printf("%s\n", "Hello");

        // %c mean character and output is H
        System.out.printf("%c\n", 'H');

        // %b mean boolean and output is true
        System.out.printf("%b\n", true);

        // %h mean Hash code (in hexadecimal) and output is 42628b2
        System.out.printf("%h\n", "Hello");

        // %tT mean Date/Time and output is current time
        System.out.printf("%tT\n", new java.util.Date());

        // %% mean print % and output is 20%
        System.out.printf("Discount: 20%%\n");

        // %n mean New line (platform independent)
        System.out.printf("Hello%nWorld\n");

        // %+f mean +f mean or it can be -f also it can be f or other and output is +3333.330000
        System.out.printf("%+f\n", 3333.33);

        // Here space add a blank space if number is positive and the output is 3333.330000
        System.out.printf("% f", 3333.33);

        // Here 010 Fills empty space with 0 and output is 0003333.33
        System.out.printf("%010.2f", 3333.33);

        // - is called left justify and it Aligns text to the left and the output is |3333.33 |
        System.out.printf("|%-10.2f|", 3333.33);

        // ( mainly used in accounting format and the output is System.out.printf("%(f", -3333.33);
        System.out.printf("%(f", -3333.33);

        // It is also called group separetor and it adds comma to large numbers and the output is 3,333.33
        System.out.printf("%,.2f", 3333.33);

        // It Shows decimal point even if no digits after it and the output is 3333.
        System.out.printf("%#.0f", 3333.0);

        // For %x or %o (prefix added) and it add 0x for hex, 0 for octal and the output is 0xcafe
        System.out.printf("%#x", 51966);

        // $ → Argument index and it Reuses same argument in different formats and theoutput is 159 9f
        System.out.printf("%1$d %1$x", 159);

        // It Uses the same previous value again and the output is 159 9f
        System.out.printf("%d %<x", 159);
  
        // 1. Width (8 characters total) and Precision (2 decimals)
        System.out.println("1. Width & Precision: [%8.2f]".formatted(x));

        // 2. Multiple Arguments (String and Integer)
        String name = "Alice";
        int age = 24;
        System.out.println("2. Multiple Args: %s will be %d next year.".formatted(name, age + 1));

        // 3. Flag: Group Separators (comma)
        System.out.println("3. Group Separators: %,.2f".formatted(1234567.89));

        // 4. Flags: Leading Zeros (0) and showing the Plus Sign (+)
        System.out.println("4. Zero Padding: %08d".formatted(42));
        System.out.println("5. Always show sign: %+d".formatted(42));

        // 5. Flag: Left-Justification (-) inside a fixed width
        System.out.println("6. Left-Justify: [%-10s] (10 wide)".formatted("Hi"));

        // 6. Argument Indexing ($) and Relative Index (<)
        System.out.println("7. Arg Index: %1$d in hex is %1$x".formatted(255));
        System.out.println("8. Relative Index: %d is %<X in hex".formatted(255));

        // 7. Locale-Specific Formatting (US vs Germany)
        System.out.println(String.format(Locale.US, "9. US Locale: %,.2f", x));
        System.out.println(String.format(Locale.GERMANY, "10. German Locale: %,.2f", x));
        
        // Not in my previous code, but in your table:
        System.out.println("11. Octal: %o".formatted(255)); // Prints: 377    
    }
}
