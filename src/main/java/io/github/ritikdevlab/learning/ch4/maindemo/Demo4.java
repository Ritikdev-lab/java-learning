package io.github.ritikdevlab.learning.ch4.maindemo;

public class Demo4 {
	/**
	 * RULE 3:
	 * private main methods are ignored
	*/
	//It will not work
	/*private static void main(String[] args) {
		IO.println("Private main");
	}*/
	static void main() {
		IO.println("static main() called");
	}
}