package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

/**
 * Demonstrates the "this" keyword referring to the enclosing class.
 */
class Greeter {
	private String text = "Hello";

	void greet() {
		Runnable lamda = () -> {
			IO.println("Lambda this: " + this);
			IO.println("Lambda text: " + this.text);
		};
		lamda.run();
	}

	@Override
	public String toString() {
		return "Greeter object";
	}
}

class Student {
	void study() {
		Runnable lamda = () -> {
			IO.println("Student lambda this: " + this);
		};
		lamda.run();
	}

	@Override
	public String toString() {
		return "Student object";
	}
}

public class ThisLambda {
	public static void main(String[] args) {
		Greeter g = new Greeter();
		g.greet();
		
		Student s = new Student();
		s.study();
	}
}