package io.github.ritikdevlab.learning.ch6.innerclasses;

public class StaticClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.printClass();
		inner.staticDisplay();
		inner.instanceDisplay();
		
		Utility.Helper.print();
	}
}
class Outer {
	private final static int STATIC_NUMBER = 132;
	private final int INSTANCE_NUMBER = 432;
	
	public Outer() {
		super();
	}
	
	public static void staticMethod() {
		IO.println("This is static method.");
	}
	
	public void instanceMethod() {
		IO.println("This is an instance method");
	}
	
	public int getInstanceNumber() {
		return INSTANCE_NUMBER;
	}

	public static class Inner {
		public void printClass() {
			IO.println("Class Name = " + this.getClass().getName());
		}
		
		// Static inner class can only access the enclosing class static field and static method directly.
		public void staticDisplay() {
			IO.println("Static number = " + STATIC_NUMBER);
			staticMethod();
		}
		
		// instance method and instance field can be indirectly accessed through the object creation.
		public void instanceDisplay() {
			Outer outer = new Outer();
			IO.println("Instance number = " + outer.INSTANCE_NUMBER);
			outer.instanceMethod();
		}
	}
}

interface Utility {
	/**
	 * The nested class Helper is implicitly "public static".
	 */
	class Helper {
		static void print() {
			IO.println("It is a Helper class");
		}
	}
}