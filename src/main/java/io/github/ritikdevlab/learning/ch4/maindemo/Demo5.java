package io.github.ritikdevlab.learning.ch4.maindemo;

public class Demo5 {
	/**
	 * RULE 4:
	 * If main is not static,
	 * Java create an object autometically.
	 * For that , class Must have
	 * a non-private no-argument constructor
	 */
	Demo5() {
		IO.println("Demo object create autometically");
	}
	void main() {
		IO.println("instance main() called");
	}
}