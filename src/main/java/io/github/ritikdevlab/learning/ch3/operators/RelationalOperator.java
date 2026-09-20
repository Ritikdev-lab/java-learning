package io.github.ritikdevlab.learning.ch3.operators;

public class RelationalOperator {
    public static void main(String[] args) {
        /**
         * 1. Not equal to = !=.
         * 
         * 2. equals to = ==.
         * 
         * 3. Logical or = ||.
         * 
         * 4. Logical and = &&.
         * 
         * 5. Logical or => If one is true the result is true.
         * 
         * 6. Logical and => if two is true then result is true.
         */
        var comparision = 2 != 4;
        IO.println("Ans = " + comparision);

        boolean isEqual = 3 == 5;
        IO.println("Ans = " + isEqual);

        boolean comparisonResult = 4 < 5;
        IO.println("Ans = " + comparisonResult);

        boolean compire = 6 > -3;
        IO.println("Ans = " + compire);

        boolean check = 6 <= 7;
        IO.println("Ans = " + check);

        var result = 8 >= 5;
        IO.println("Ans = " + result);

        int number = 5;
        boolean checkResult = number != 0 && 1 / number < number + 5;
        IO.println("Ans = " + checkResult);

        byte first = 6;
        int second = 8;
        boolean compireResult = first < second && first > 4 || second > 4;
        IO.println("Ans = " + compireResult);
    }
}
