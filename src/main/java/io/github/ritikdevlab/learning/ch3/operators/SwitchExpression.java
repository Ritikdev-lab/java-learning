package io.github.ritikdevlab.learning.ch3.operators;

public class SwitchExpression {
    public static void main(String[] args) {
        /**
         * 1. In the enhance switch statement there is no need to use break.
         * 
         * 2. In classic switch statement we use the break for stoping fallthrough.
         * 
         * 3. In switch expression the case must cover all possibility 
         *      which is called Exhaustiveness.
         * 
         * 4. We can provide multiple labels for each case, separated by commas.
         */
        // Demonstration of enhanced switch statement
        int day = 5;
        switch(day) {
            case 1->IO.println("Sunday");
            case 2->IO.println("Monday");
            case 3->IO.println("Tuesday");
            case 4->IO.println("wednesday");
            case 5->IO.println("Thursday");
            default->IO.println("Suterday");
            /*Here due to -> we do not use break statement*/
        }

        // Demonstration of classic switch statement
        int name = 3;
        switch(name) {
            case 1:IO.println("Ritik");
            break;
            case 2:IO.println("Kuni");
            break;
            case 3:IO.println("Damayanti");
            break;
            default:IO.println("Ranjit");
            break;
        }

        String seasonname = "Spring";
        switch(seasonname) {
            case "Spring","Summer","Winter"->IO.println(6);
            case "Fall"->IO.println(4);
            default->IO.println(-1);
        }   

        /**
         * Demonstration of switch expression 
         *    and others are switch statement.
         */
        enum Size{SMALL,MEDIUM,LARGE,EXTRA_LARGE};
        Size S = Size.SMALL;
        Size M = Size.MEDIUM;
        Size L = Size.LARGE;
        Size E = Size.EXTRA_LARGE;
        String input = IO.readln("Enter size from S,M,l,E: ");
        switch(input) {
            case "S"->IO.println(S);
            case "M"->IO.println(M);
            case "L"->IO.println(L);
            case "E"->IO.println(E);
            default->IO.println("Invalid");
        }
       
        // Demonstration of nested switch.
        int category = 1;
        int item = 2;
        switch (category) {
            case 1:
                System.out.println("Electronics");
                switch (item) {
                    case 1:
                        System.out.println("Mobile");
                        break;
                    case 2:
                        System.out.println("Laptop");
                        break;
                    default:
                        System.out.println("Unknown item");
                }
                break;
            case 2:
                System.out.println("Clothing");
                break;
            default:
                System.out.println("Invalid category");
        }
    }
} 

