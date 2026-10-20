package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

public class VariableScope {
	public static void main(String[] args) {
		/**
		 * CONCEPTS:-
		 * 
		 * 1. Variable Scope:- The region of a program where a variable can be accessed.
		 * 2. Free variable:- A free variable is a variable used inside a lambda but 
		 * 						not declared as a parameter or local variable inside that lambda.
		 * 3. Capturing:- Capturing means the lambda retains access to the value of a free variable 
		 * 					from its surrounding scope.
		 * 4. Closure:- A closure is a block of code together with the values of the free variables it needs.
		 * 5. Effectively final:- A Local variable is effectively final when 
		 * 							it is initialized and never reassigned afterward.
		 */
		String message = "Hello";
		for (int i = 0; i < 5; i++) {
			// "number" is initialized once and never reassigned.So it is effectively final.
			int number = i;
			Runnable task = () -> IO.println(number + ": " + message);
			task.run();
		}
	}
}
