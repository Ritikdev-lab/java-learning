package io.github.ritikdevlab.learning.ch7.exception;

public class FinallyDemo {
	/*
	 * IMPORTANT:
	 * 
	 * 1. finally executes whether:
	 * 		-No exception occurs.
	 * 		-An exception is caught.
	 * 		-An exception is not caught.
	 * 
	 * 2. Use finally mainly for resources cleanup.
	 * 
	 * 3. Avoid return, throw, break, and continue
	 * 	  inside finally because they can change the
	 * 	  normal control flow.
	 */
	public static void main(String[] args) {
		try {
			IO.println("Inside try block");
			int result = 10 / 0;
			IO.println("Result: " + result);
		} catch (ArithmeticException e) {
			IO.println("Inside catch block");
		} finally {
			IO.println("Inside finally block");
		}
		IO.println("Program finished");
	}
}
