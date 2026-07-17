package io.github.ritikdevlab.project;
public class LotteryOdds {
	public static void main(String[] args) {
        int k = Integer.parseInt(IO.readln("How many numbers do you need to draw? "));
        int n = Integer.parseInt(IO.readln("What is the highest number you can draw? "));
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)  {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        IO.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        //Here the code prints only the last results among the loop because the print statement is outside the loop
	}
}
