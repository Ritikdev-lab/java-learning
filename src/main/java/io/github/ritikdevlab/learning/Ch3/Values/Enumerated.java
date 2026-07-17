package io.github.ritikdevlab.learning.Ch3.Values;
public class Enumerated {
    public static void main(String[] args) { 
        /**
         * 1. 'enum' keyword is used to decalre the enumeration.
         * 
         * 2. Below 'Size' is called the enum type.
         * 
         * 3. SMALL,MEDIUM,LARGE is called the enum constant.
         * 
         * 4. enum constant is restricted because the enum is final.
         */
        
        //This is the enumurated statement.
        enum Size{SMALL,MEDIUM,LARGE};
        Size s = Size.MEDIUM;
        IO.println("s = " + s);

        Size a = Size.LARGE;
        IO.println("a = " + a);
        
        Size b = Size.SMALL;
        IO.println("b = " + b);
    }
}
