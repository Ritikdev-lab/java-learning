package io.github.ritikdevlab.learning.Ch5;
import java.text.NumberFormat;
import java.text.ParseException;

public class ObjectsWrappers {
    public static void main(String[] args) {
        // 1. Convert the int value into the Integer Object
        Integer intObj = Integer.valueOf(12);
        IO.println("Here int 12 convert into Integer object " + intObj);

        // 2. Convert the Integer Object back to int
        int convertBack = intObj.intValue();
        IO.println("Convert Integer Object 12 to int " + convertBack);

        // 3. Return the String value of base 10 and it is a instance method
        String returnString = intObj.toString();
        IO.println("Convert the integer Object of 12 into string " + returnString);

        //4. Return the Strign value of base 10. It takes the int as parametor and it is static method
        String returnStaticString = Integer.toString(10);
        IO.println("Convert the integer class(int datatype) to String " + returnStaticString);

        // 5. Convert the Integer Object into the string of given base
        String returnStringGivenBase = Integer.toString(intObj, 2);
        IO.println("The String of the 12 of base 2 is " + returnStringGivenBase);

        //6. Convert form the String to int
        int convertToInteger = Integer.parseInt("15");
        IO.println("The 15 String is converted into the int " + convertToInteger);

        //7. Convert from the String of given base into the int value
        int convertToIntegerGivenBase = Integer.parseInt(returnStringGivenBase, 2);
        IO.println("Here the String of 1100 base 2 is converted into the int " + convertToIntegerGivenBase);

        //8. Convert the numeric String into the Integer Object
        Integer stringObj = Integer.valueOf("123");
        IO.println("Here the String is of 123 is converted into the Integer object " + stringObj);

        //9. Convert the numeric String of given base into the Integer Object
        Integer stringObjGivenBase = Integer.valueOf("1100", 2);
        IO.println("Here the String of 1100 of base 2 is convert into " + stringObjGivenBase);

        /**10. parse change the String of the NumberFormat method 
         * which change the the number acording to country into the Number abstract superclass
         * Which then converted into the int
         */
        try {
            NumberFormat nf = NumberFormat.getInstance();
            Number num = nf.parse("416");
            System.out.println("NumberFormat.parse = " + num.intValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
          
            

    }
}
