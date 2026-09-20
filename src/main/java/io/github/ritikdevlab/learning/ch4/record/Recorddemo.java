package io.github.ritikdevlab.learning.ch4.record;

import java.util.Arrays;

public class Recorddemo {
/**
 * This program demonstrates Java Records.
 *
 * Records are special classes mainly used to store immutable data.
 *
 * A record automatically creates:
 * 1. Private final fields
 * 2. Canonical constructor
 * 3. Getter-like accessor methods
 * 4. toString()
 * 5. equals()
 * 6. hashCode()
 */
	// Entry point method
	void main() {
		/**
		 * Creating an object of Components record.
		 *
		 * Java automatically creates:
		 * x()
		 * y()
		 */
		Commmect v = new Commmect(1, 1);
		IO.println("The value of x = " + v.x() + " and the value of y is = " + v.y());


		/**
		 * Array of Call records.
		 *
		 * Initially all elements are null because
		 * objects are not yet created.
		 */
		Call[] n = new Call[2];
		IO.println(Arrays.toString(n));

		/**
		 * Calling the custom constructor.
		 *
		 * This constructor internally calls:
		 * this(25.1,11.1)
		 */
		Call N = new Call();
		IO.println("The value of the x = " + N.x() + ", the value of the y = " + N.y());

		/**
		 * Calling an instance method inside the record.
		 */
		IO.println("The value is " + N.random());

		/**
		 * Calling the factory method.
		 *
		 * Factory method creates and returns objects.
		 */
		Call k = Call.createCall(12, 16);
		IO.println("The value of x = " + k.x()
					+ " , the value of y = " + k.y());

		/**
		 * Calling the chained constructor through
		 * another factory method.
		 */
		Call j = Call.crCall(2);
		IO.println("x = " + j.x() + " y = " + j.y());

		/**
		 * Using explicit canonical constructor.
		 *
		 * Values are already in correct order.
		 */
		Range r = new Range(12, 16);
		IO.println("From = " + r.from() + " To = " + r.to());
		/**
		 * Constructor swaps values because
		 * from > to.
		 */
		Range R = new Range(15, 12);
		IO.println("From = " + R.from() + " To = " + R.to());

		/**
		 * Compact constructor example.
		 */
		range a = new range(12, 16);
		IO.println("From = " + a.from() + " To = " + a.to());
		/**
		 * Compact constructor swaps the values
		 * automatically.
		 */
		range b = new range(15, 12);
		IO.println("From = " + b.from() + " To = " + b.to());
	}
}

record Commmect(double x , double y){
	//Here there is not any need for the class
	/**
	 * Simple record.
	 *
	 * Java automatically creates:
	 * Components(double x, double y)
	 *
	 * This automatic constructor is called
	 * the canonical constructor.
	 */
	
}



record Call (double x , double y) {
	/**
	 * Record containing:
	 * 1. Static field
	 * 2. Static block
	 * 3. Custom constructor
	 * 4. Methods
	 * 5. Factory methods
	 * 6. Chained constructor
	 */

	/**
	 * Static field belongs to the class,
	 * not individual objects.
	 */
	private static final int num = 2;
	/**
	 * Static block executes only once
	 * when the class is loaded.
	 */
	static {
		int number = 12;
		IO.println("The number is " + (number + num));
	}
	/**
	 * Custom overloaded constructor.
	 *
	 * Calls another constructor using this().
	 */
	public Call() {
		this(25.1,11.1);
	}
	/**
	 * Instance method inside the record.
	 */
	double random() {
		return Math.random();
	}
	/**
	 * Factory method.
	 *
	 * Used to create objects indirectly.
	 */
	static Call createCall (double a , double b) {
		return new Call(a, b);
	}
	/**
	 * Chained constructor.
	 *
	 * Calls canonical constructor.
	 */
	public Call (int x) {
		this(x , 12);
	}
	/**
	 * Factory method for the chained constructor.
	 */
	static Call crCall(int x) {
		return new Call(x);
	} 
}

record Range(int from, int to) {
	/**This is also the custom constructor and
	 * The custom constructor is that
	 * which write everything manually
	 * also the
	 *
	 * Explicit canonical constructor.
	 *
	 * Here we manually write:
	 * 1. Parameters
	 * 2. Validation
	 * 3. Assignments
	 */


    public Range(int from, int to) {
    	/**
		 * Swapping values if from > to.
		 */
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        /**
		 * Manual assignment of fields.
		 */
        this.from = from;
        this.to = to;
    }
}

record range(int from, int to) {
	/**This is compact constructor and 
	 * Here we do not fully write everything
	 *  but the java understand what to do next
	 * Also 
	 * 
	 * Compact constructor example.
	 *
	 * In compact constructors:
	 * 1. Parameters are implicit
	 * 2. Java automatically assigns fields
	 * 3. We only write extra logic
	 */

    range {
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }
        /**
		 * Java automatically does:
		 *
		 * this.from = from;
		 * this.to = to;
		 */
    }
}		
