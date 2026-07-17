package io.github.ritikdevlab.learning.Ch3.ControlFlow;
public class BreakDemo {
	public static void main(String[] args) {
		/**
		 * 1. In the statement that break the control flow is devided into 4 types
		 * 2. The break stops and jump out of the code immedieatly
		 * 		like the loop or switch but it continue to run the method
		 */
		// The 1st type is the normal break
		int a = Integer.parseInt(IO.readln("Give the number between 1 to 5:-"));
		while (a <= 5) {
			a++;
			IO.println("Hello " + a);
			if (a < 3)
				IO.println("Continue");
			else
				IO.println("Stop");
			break; // If the input greater than 3 it will break the loop and jump to the next code
		}
		IO.println("Here method continues");

		// The 2nd type is the labeled break
		int b = 1;
		IO.println("Start:-");
		Outer: // This is the label
		while (b <= 6) {
			IO.println("Year " + b);
			for (int c = 3; c >= 1; c--) {
				IO.println("Month " + c);// Here it directly jump to if code without month 2 and 1
				if (b == 4) {
					IO.println("Stop");
					break Outer;// This break whole "while" loop after 4
				}
			}
			b++;
		}

		// The 3rd type is continue
		// It do not stop the code but skip that
		for (int l = 3; l >= 1; l--) {
			if (l == 2)
				continue;// Here it skip the Number 2 and continue to 1
			IO.println("Number " + l);
		}

		// The 4th type is labeled continue
		IO.println("Start 2:-");
		Outermost: // This is the label
		for (int f = 4; f >= 1; f--) {
			IO.println("Month " + f);
			for (int j = 1; j <= 3; j++) {
				IO.println("Day " + j);
				if (f == 3)
					continue Outermost;// Then it skip the whole 3 statement and start with month 2
			}
		}

		/**
		 * Here is the use of the return and there is no lebeled return.
		 * This directly stop the program and return to the method.
		 * Not like break(which break out of loop but continue to process the further
		 * code.)
		 */
		for (int f = 1; f <= 3; f++) {
			IO.println("Year " + f);
			for (int l = 1; l <= 3; l++) {
				IO.println("month " + l);

			}
		}
		return;
		/*
		 * If i want to print something after the return it will not print because the
		 * return stop the whole program and return to the method
		 */
	}
}
