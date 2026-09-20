package io.github.ritikdevlab.example;

class CompoundInterest {
    void main() {
        final double STARTRATE = Double.parseDouble(IO.readln("Give the starting interest rate:- "));//It means that the interest rates starts
        final int NRATES = Integer.parseInt(IO.readln("Give the number of differnt type of interest rate:- "));//The total number of different interest rates to calculate.
        final int NYEARS = Integer.parseInt(IO.readln("The number of years:-"));//The number of years for the investment period
        
        //Creates an array for interest rates and populates it with values starting from STARTRATE.
        double[] interestRates = new double[NRATES];
        for (int j = 0; j < interestRates.length; j++)
            interestRates[j] = (STARTRATE + j) / 100.0;
            
        //Creates a 2D array where rows represent years and columns represent different interest rates.
        double[][] balances = new double[NYEARS][NRATES];   
        
        //Initializes the first year (row 0) with a starting balance of 10,000 for all rates.
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;
            
        //It create nested loop to Calculates the new balance by adding the interest earned from the previous year's balance.
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRates[j]; 
                balances[i][j] = oldBalance + interest;
            }
        }
        
        //Here it transform the the interestRates and balance to printTable method
        printTable(interestRates, balances);
    }

    void printTable(double[] headers, double[][] values) { //Here it means headers = interestRates and values = balance
        for (double header : headers) {
            IO.print("%10.2f".formatted(header));//Formally, %10.2f means the entire field is 10 characters wide (including the number), and it shows 2 decimal places. It's not exactly "10 spaces between numbers.
        }

        IO.println();//Prints a newline character to move to the next row.
        IO.println("-".repeat(10 * headers.length));// Prints a horizontal divider line(---) that spans the width of all columns.

        for (double[] row : values) {
            for (double value : row) {
                IO.print("%10.2f".formatted(value)); //Prints each balance right-aligned in a 10-character wide column with 2 decimal places.
            }
            IO.println();//Moves the cursor to the next line after finishing a row.
        }
    }
}    