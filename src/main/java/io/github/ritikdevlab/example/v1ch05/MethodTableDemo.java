package io.github.ritikdevlab.example.v1ch05;

import module java.base;

public class MethodTableDemo {
	void main() throws Exception {
		// get method pointers to the square and sqrt methods
		Method square = this.getClass().getDeclaredMethod("square", double.class);
		Method sqrt = Math.class.getMethod("sqrt", double.class);
		
		// print table of x- and y- values
		printTable(1, 10, 10, square);
		printTable(1, 10, 10, sqrt);
	}
	
	/**
	 * Return the square of a number.
	 * 
	 * @param x a number
	 * @return x squared
	 */
	static double square(double x) {
		return x * x; 
	}
	
	/**
	 * Print a table with x- and y-values for a method.
	 * 
	 * @param from the lower bound for the x-values
	 * @param to to the upper bound for the x-values
	 * @param n the number of rows in the table
	 * @param f a method with a double parameter and double return value
	 * @throws Exception if an error occurs while invoking the method
	 */
	void printTable(double from, double to, int n, Method f) throws Exception {
		// print out the method as table header
		IO.println(f);
		
		double dx = (to - from) / (n - 1);
		
		for (double x = from; x <= to; x += dx) {
			double y = (Double) f.invoke(null, x);
			IO.println("%10.4f | %10.4f".formatted(x, y));
		}
	}
}
