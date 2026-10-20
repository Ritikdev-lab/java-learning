package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

import java.util.function.BiFunction;

public class LambdaIntro {
	public static void main(String[] args) {
		StringPrintor p = () -> IO.println("This is useing lambda.");
		p.print();

		Function function = (a, b) -> a * b;
		int calculate = function.calculate(12, 10);
		IO.println(calculate);

		Calender c = year -> year * 12;
		IO.println(c.calculateMonth(calculate));

		BiFunction<Integer, Integer, Integer> f = (_, _) -> 100;
		IO.println(f.apply(12, 10));

		Calender mCalender = _ -> 123;
		IO.println(mCalender.calculateMonth(0));
	}
}

// A functional interface has exactly one abstract method, excluding the public methods of Object class.

@FunctionalInterface
interface StringPrintor {
	void print();
}

@FunctionalInterface
interface Function {
	int calculate(int a, int b);
}

@FunctionalInterface
interface Calender {
	int calculateMonth(int year);
}