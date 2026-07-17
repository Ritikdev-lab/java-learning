package io.github.ritikdevlab.learning.Ch3.String;
public class Stringbuilder {
    public static void main(String[] args) {
        // Demonstration of StringBuilder() method.
        StringBuilder sb = new StringBuilder();
        sb.append("java");
        IO.println("Output:- " + sb);  
      
        // Demonstration of StringBuilder(CharSequence seq)
        StringBuilder build = new StringBuilder("Hello");
        IO.println("Output:- " + build);
      
        // Demonstration of length() method.
        IO.println("Length:- " + build.length());
      
        // Demonstration of append(String str) method.
        build.append(" java");
        IO.println("Output:- " + build);
      
        // Demonstration of appendCodePoint(int cp) method.
        build.appendCodePoint(0x1F600);
        IO.println("Output:- " + build);
      
        // Demonstration of insert(int offset, String str) method.s
        StringBuilder stringBuilderExample = new StringBuilder("Hlo");
        stringBuilderExample.insert(1, "el");
        IO.println("Output:- " + stringBuilderExample);
      
        // Demonstration of delete(int startIndex, int endIndex) method.
        StringBuilder messageBuilder = new StringBuilder("Hello");
        messageBuilder.delete(1, 4);
        IO.println("Output:- " + messageBuilder);
      
        // Demonstration of repeat() method.
        StringBuilder initialize = new StringBuilder();
        initialize.repeat("Hi",3);
        IO.println("Output:- " + initialize);
      
        // Demonstration of reverse() method.
        StringBuilder javaStringBuilder = new StringBuilder("java");
        javaStringBuilder.reverse();
        IO.println("Output:- " + javaStringBuilder);
      
        // Demonstration of toString() method.
        StringBuilder textAccumulator = new StringBuilder("Hello");         
        textAccumulator.toString();
        IO.println("Output:- " + textAccumulator);
    }
}
