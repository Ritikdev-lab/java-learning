package io.github.ritikdevlab.learning.Ch4.mainDemo;
public class Demo1 {

/**
 * This program explains Java 25 main methods rules.
 * 
 *RULES:
 *	1.Static main methods are preferred over instance main methods
 *	2.main(String[] args) is preferred over main()
 *	3.private main method are ignored
 * 	4.If main is not static, the class must have 
 * 	  a non-private no-argument constructor.
 * 	  Then the launcher constructs an instance of the class and invokes the main method on it.
 * 	5. A valid main method can now be:
 *      static void main(String[] args)
 *      static void main()
 *      void main(String[] args)
 *      void main()
 */

	//RULE 1 + RULE 2
	//Highest priority
	//static + String[] args

	static void main(String[] args) {
		IO.println("It is static main(String[] args) called");
	}

	//Lower priority than above

	static void main() {
		IO.println("static main() called");
	}
	
}