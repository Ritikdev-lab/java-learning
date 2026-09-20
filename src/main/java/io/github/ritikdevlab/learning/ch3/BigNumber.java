package io.github.ritikdevlab.learning.ch3;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigNumber {
    public static void main(String[] args) {

        /*
         * Use of BigInteger.valueOf() which has range within long range and it take
         * long/int as input.And it convert them to BigInteger.It is used for the small
         * numbers
         */
        BigInteger a = BigInteger.valueOf(100);
        IO.println(a);

        long num = 12L;
        BigInteger v = BigInteger.valueOf(num);
        IO.println(v);

        /*
         * Use of new BigInteger("") which has no limit of range and it take String as
         * input.It used for very very long number
         */
        BigInteger num1 = new BigInteger("999999999999999999999999999999");
        IO.println(num1);

        String num5 = "1234";
        BigInteger num6 = new BigInteger(num5);
        IO.println(num6);

        String Number = "9765677887654345678897324675368876565";
        BigInteger Number2 = new BigInteger(Number);
        IO.println(Number2);

        // This is the addition in BigInteger
        BigInteger num2 = BigInteger.valueOf(12);
        BigInteger num3 = BigInteger.valueOf(13);
        BigInteger sum = num2.add(num3);
        IO.println(sum);

        // This is the Subtraction in BigInteger
        BigInteger b = BigInteger.valueOf(15);
        BigInteger c = BigInteger.valueOf(10);
        BigInteger Subtraction = b.subtract(c);
        IO.println(Subtraction);

        // This is the multipication in BigInteger
        BigInteger g = BigInteger.valueOf(3);
        BigInteger h = BigInteger.valueOf(5);
        BigInteger multiplication = g.multiply(h);
        IO.println(multiplication);

        // This is the Division in BigInteger
        BigInteger Name = new BigInteger("226");
        BigInteger Name2 = new BigInteger("113");
        BigInteger Division = Name.divide(Name2);
        IO.println(Division);

        // This is the modulus in BigInteger
        BigInteger f = new BigInteger("5");
        BigInteger j = new BigInteger("2");
        BigInteger Modulus = f.mod(j);
        IO.println(Modulus);

        // This is the power in BigInteger
        BigInteger d = new BigInteger("2");
        int k = 2;// pow() method takes an int exponent, not BigInteger
        BigInteger Power = d.pow(k);
        IO.println(Power);

        // This is the squre root in BigInteger
        BigInteger s = new BigInteger("4");
        BigInteger Squreroot = s.sqrt();
        IO.println(Squreroot);

        // This is the compare statement in BigInteger
        BigInteger l = new BigInteger("12");
        BigInteger m = new BigInteger("23");
        int Compare = l.compareTo(m);
        IO.println(Compare);
        /*
         * Here 0->equl
         * negative → l < m
         * positive → l > m
         */

        /*
         * Use of BigDecimal.valueOf() which has range within (1)long range->long as
         * input and (2) Double range->Double as input .And it convert them to
         * BigDouble.It is used for the small numbers
         */
        BigDecimal num4 = BigDecimal.valueOf(123);
        IO.println(num4);

        int value = 1233;
        BigDecimal value3 = BigDecimal.valueOf(value);
        IO.println(value3);

        BigDecimal value1 = BigDecimal.valueOf(12.2);
        IO.println(value1);

        float value2 = 12.123F;
        BigDecimal value4 = BigDecimal.valueOf(value2);
        IO.println(value4);

        /*
         * Use of new BigDouble("") which has no limit of range and it take String as
         * input.It used for very very long number
         */
        BigDecimal value5 = new BigDecimal("122.14322347294724759993993939939");
        IO.println(value5);

        String value6 = "122.54";
        BigDecimal value7 = new BigDecimal(value6);
        IO.println(value7);

        // This is the addition in BigDecimal
        BigDecimal value8 = value1.add(value3);
        IO.println(value8);

        // This is the Subtraction in BigDecimal
        BigDecimal value9 = value3.subtract(value1);
        IO.println(value9);

        // This is the multiplication in BigDecimal
        BigDecimal value10 = value3.multiply(value1);
        IO.println(value10);

        // This is devision in BigDecimal
        BigDecimal number = new BigDecimal("12.12");
        BigDecimal number1 = new BigDecimal("2");
        BigDecimal devision1 = number.divide(number1);
        IO.println(devision1);

        // This is devision with round in BigDecimal
        BigDecimal number3 = new BigDecimal("10");
        BigDecimal number5 = new BigDecimal("3");
        BigDecimal devide2 = number3.divide(number5, RoundingMode.HALF_UP);
        IO.println(devide2);// It answer will be 3.33333 but after rounding up it become 3
        /**
         * If the next digit is 5 or more → round UP
         * If it is less than 5 → round DOWN
         * like 2.245->2.25
         * 2.244->2.24
         */

        // This is devision with round up with scale in BigDecimal
        BigDecimal devide3 = number3.divide(number5, 2, RoundingMode.HALF_UP);
        IO.println(devide3);// it give the output of 3.33 because its scale is 2

        // This is the compare statement in BigDecimal
        int compare = devide2.compareTo(devide3);
        IO.println(compare);
        /**
         * Here 0-> equl
         * negative → devide2 < devide3
         * positive → devide2 > devide3
         */
    }
}
