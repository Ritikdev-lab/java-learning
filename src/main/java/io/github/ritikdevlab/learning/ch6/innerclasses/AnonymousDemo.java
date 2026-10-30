package io.github.ritikdevlab.learning.ch6.innerclasses;

import java.util.List;
import java.util.ArrayList;

/**
 * Anonymous Class: An anonymous class in Java is a class that has no name and
 * is declared and instantiated at the same time, usually to provide a one-time
 * implementation of an interface or an extension of a class.
 */
public class AnonymousDemo {
	public static void main(String[] args) {
		// This type of trick is called "double brace initialization". But it rarely used.
		Calculator calculate = Calculator.CreateCalculator(new ArrayList<Integer>() {
			{
				add(13);
				add(14);
			}
		});
		IO.println(calculate.add());

		// Instead of the first we can use it which is much more convenient.
		Calculator another = Calculator.CreateCalculator(List.of(14, 12));
		IO.println(another.multiply());

		Calculator c = new Calculator(13, 12);
		IO.println(c.multiplyDouble());

		c.print();

	}
}

class Calculator {
	private int first;
	private int second;

	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public static Calculator CreateCalculator(List<Integer> number) {
		return new Calculator(number.get(0), number.get(1));
	}

	public int add() {
		return first + second;
	}

	public int multiply() {
		return first * second;
	}

	// Here the anonymous class extends the class or create a sub class of it.
	public double multiplyDouble() {
		var m = new Calculator(first, second) {
			private double doubleFirst = super.first;
			private double doubleSecond = super.second;
			/**
			 * Static initiation block is not allowed but instance initiation block is
			 * allowed. Here the super type can be used for the overridden method but not
			 * for the anonymous class own method.
			 */
			{
				IO.println("doubleFirst= " + doubleFirst);
				IO.println("doubeSecond= " + doubleSecond);
			}

			@Override
			public double multiplyDouble() {
				return doubleFirst * doubleSecond;
			}

			public void printDouble() {
				IO.println("This will not print if the type is not 'var'.");
			}
		};
		m.printDouble();
		return m.multiplyDouble();
	}

	// Here anonymous class implements the interface. Here use the interface type Like "PrintOut".
	public void print() {
		PrintOut printer = new PrintOut() {
			@Override
			public void printName() {
				IO.println("Math[" + "first=" + first + " ,second=" + second + "]");
			}
		};
		printer.printName();
	}
}

@FunctionalInterface
interface PrintOut {
	void printName();
}