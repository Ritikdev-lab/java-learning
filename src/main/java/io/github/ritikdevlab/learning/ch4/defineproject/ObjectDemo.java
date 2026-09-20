package io.github.ritikdevlab.learning.ch4.defineproject;

public class ObjectDemo {
	public static void main(String[] args) {
		while (true) {
			String Qn = IO.readln("Operation (Add , Minus , Multiply , Divide, Circle ,Exit):- ");
			switch (Qn.toLowerCase()) {
				case "add" -> {
					String qn = IO.readln("Do you want to operation in the integer vallue or double value (D / I):- ");
					if (qn.equalsIgnoreCase("I")) {
						int First = Integer.parseInt(IO.readln("Give the first number:- "));
						int Last = Integer.parseInt(IO.readln("Give the Second number:- "));
						Component co = Component.CreateComponent(First, Last);
						int add = co.Add(First, Last);
						IO.println("The result of " + co.ShowFirst() + " and " + co.ShowLast() + " is:- " + add);
					} else if (qn.equalsIgnoreCase("D")) {
						double First = Double.parseDouble(IO.readln("Give the first number:- "));
						double Last = Double.parseDouble(IO.readln("Give the Second number:- "));
						Another an = new Another(First, Last);
						double add = an.Add(First, Last);
						IO.println("The result of " + an.First() + " and " + an.Last() + " is:- " + add);
					} else {
						IO.println("Invalid input");
					}
				}
				case "minus" -> {
					String qn = IO.readln("Do you want to operation in the integer vallue or double value (D / I):- ");
					if (qn.equalsIgnoreCase("I")) {
						int First = Integer.parseInt(IO.readln("Give the first number:- "));
						int Last = Integer.parseInt(IO.readln("Give the Second number:- "));
						int minus = Component.CreateComponent(First, Last).Minus(First, Last);
						IO.println("The result of " + First + " and " + Last + " is:- " + minus);
					} else if (qn.equalsIgnoreCase("D")) {
						double First = Double.parseDouble(IO.readln("Give the first number:- "));
						double Last = Double.parseDouble(IO.readln("Give the Second number:- "));
						Another an = new Another(First, Last);
						double minus = an.Minus(First, Last);
						IO.println("The result of " + an.First() + " and " + an.Last() + " is:- " + minus);
					} else {
						IO.println("Invalid input");
					}
				}
				case "multiply" -> {
					String qn = IO.readln("Do you want to operation in the integer vallue or double value (D / I):- ");
					if (qn.equalsIgnoreCase("I")) {
						int First = Integer.parseInt(IO.readln("Give the first number:- "));
						int Last = Integer.parseInt(IO.readln("Give the Second number:- "));
						Component co = Component.CreateComponent(First, Last);
						int multiply = co.Multiply(First, Last);
						IO.println("The result of " + co.ShowFirst() + " and " + co.ShowLast() + " is:- " + multiply);
					} else if (qn.equalsIgnoreCase("D")) {
						double First = Double.parseDouble(IO.readln("Give the first number:- "));
						double Last = Double.parseDouble(IO.readln("Give the Second number:- "));
						Another an = new Another(First, Last);
						double multiply = an.Multiple(First, Last);
						IO.println("The result of " + an.First() + " and " + an.Last() + " is:- " + multiply);
					} else {
						IO.print("Invalid input");
					}
				}
				case "divide" -> {
					String qn = IO.readln("Do you want to operation in the integer vallue or double value (D / I):- ");
					if (qn.equalsIgnoreCase("I")) {
						int First = Integer.parseInt(IO.readln("Give the first number:- "));
						int Last = Integer.parseInt(IO.readln("Give the Second number:- "));
						if (Last == 0) {
							IO.print("Error: Division by zero is not allowed.");
						} else {
							int divide = Component.CreateComponent(First, Last).Divide(First, Last);
							IO.println("The result of " + First + " and " + Last + " is:- " + divide);
						}
					} else if (qn.equalsIgnoreCase("D")) {
						double First = Double.parseDouble(IO.readln("Give the first number:- "));
						double Last = Double.parseDouble(IO.readln("Give the Second number:- "));
						Another an = new Another(First, Last);
						double divide = an.Divide(First, Last);
						IO.println("The result of " + an.First() + " and " + an.Last() + " is:- " + divide);
					} else {
						IO.println("Invalid input");
					}
				}
				case "circle" -> {
					String qn = IO.readln("Do you want to operation in the integer vallue or double value (D / I):- ");
					if (qn.equalsIgnoreCase("D")) {
						double radious = Double.parseDouble(IO.readln("Give the radious:- "));
						Another An = new Another(radious, radious);
						double result = An.Circle(radious);
						IO.println("The Circumference of a radious " + An.First() + " is " + result);

					} else if (qn.equalsIgnoreCase("I")) {
						int radious = Integer.parseInt(IO.readln("Give the radious:- "));
						double result = Component.CreateComponent(radious, radious).Circle(radious);
						IO.println("The Circumference of a radious " + radious + " is " + result);
					} else {
						IO.println("Invalid Input");
					}
				}
				case "exit" -> {
					IO.println("Exiting the program.");
					return;
				}
				default -> {
					IO.println("Invalid input");
				}
			}
		}
	}
}

/**
 * <h2>Arithmetic Operation(int)</h2>
 * 
 * {@literal Represents an integer calculator that performs arithmetic operation}
 * 
 * <p>
 * <strong>Note:</strong> The there are only 5 types of mathematical operation.
 * 
 * <ul>
 * <li>{@link Component#Add(int, int)}:Addition of two integer</li>
 * <li>{@link Component#Minus(int, int)}:Subtraction of two integer</li>
 * <li>{@link Component#Multiply(int, int)}:Multiply two integer</li>
 * <li>{@link Component#Divide(int, int)}:Divide two integer</li>
 * <li>{@link Component#Circle(int)}:Radious of the circle</li>
 * </ul>
 * 
 * <p>
 * <em>Example:</em>
 * 
 * <pre>{@code
 * Component Math = new Components();
 * Math.Add(12, 13);
 * Math.Minus(14, 12);
 * Math.Multiply(2, 12);
 * Math.Divide(14, 2);
 * Math.Circle(22.1);
 * }
 * </pre>
 * 
 * @since 1.0
 * @version 1.0
 * @see Another
 * @see Another#<init>(double,double)
 * @see <a href=
 *      "https://docs.oracle.com/en/java/javase/25/docs/api/index.html">Java
 *      Documantation(Java 25) </a>
 * @author Ritikdev-lab
 */
class Component {
	private int FirstNumber;
	private int SecondNumber;
	/**
	 * {@literal The mathematical constant PI.}
	 */
	private static final double PI = Math.PI;

	/**
	 * Construnts a calculator components with two integer values.
	 * 
	 * @param a the first integer value
	 * @param b the second integer value
	 * @since 1.0
	 */
	Component(int a, int b) {
		FirstNumber = a;
		SecondNumber = b;
	}

	/**
	 * Creates and returns a new calculator components.
	 * 
	 * @param a the first integer value
	 * @param b the second integer value
	 * @return a new components instance
	 * @since 1.0
	 */
	public static Component CreateComponent(int a, int b) {
		return new Component(a, b);
	}

	/**
	 * Adds two integers.
	 * 
	 * @param a the first operand
	 * @param b the second operand
	 * @return the sum of the operands
	 * @since 1.0
	 */
	public int Add(int a, int b) {
		return a + b;
	}

	/**
	 * Subtracts the second integer from the first.
	 * 
	 * @param a the first operand
	 * @param b the second operand
	 * @return the difference of the operands
	 * @since 1.0
	 */
	public int Minus(int a, int b) {
		return a - b;
	}

	/**
	 * Multiply two integers.
	 * 
	 * @param a the first operands
	 * @param b the second operands
	 * @return the product of the operands
	 * @since 1.0
	 */
	public int Multiply(int a, int b) {
		return a * b;
	}

	/**
	 * Divides the first integer by the second.
	 * 
	 * @param a the dividend
	 * @param b the divisor
	 * @return the quotient
	 * @throws ArithmeticException if {@code b} is Zero
	 * @since 1.0
	 */
	public int Divide(int a, int b) {
		return a / b;
	}

	/**
	 * {@returns the first stored integer value}
	 * 
	 * @since 1.0
	 */
	public int ShowFirst() {
		return FirstNumber;
	}

	/**
	 * {@returns the second stored integer value}
	 * 
	 * @since 1.0
	 */
	public int ShowLast() {
		return SecondNumber;
	}

	/**
	 * Computes the ciecumference of a circle.
	 * 
	 * @param a the radius of the circle
	 * @return the circumference of the circle
	 * @since 1.0
	 */
	public double Circle(int a) {
		return 2 * PI * a;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param otherObject the object to compare with
	 * @return true if the objects are equal, false otherwise
	 * @author Ritikdev-lab
	 * @since 1.0
	 * @version 1.0
	 */
	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject == null) {
			return false;
		}
		if (getClass() != otherObject.getClass()) {
			return false;
		}

		Component other = (Component) otherObject;

		return Integer.compare(FirstNumber, other.FirstNumber) == 0
				&& Integer.compare(SecondNumber, other.SecondNumber) == 0;
	}

	/**
	 * Returns a hash code value for the object.
	 * 
	 * @return a hash code value for the object
	 * @since 1.0
	 * @author Ritikdev-lab
	 * @version 1.0
	 */
	@Override
	public int hashCode() {
		int result = Integer.hashCode(FirstNumber);
		result = 31 * result + Integer.hashCode(SecondNumber);
		return result;
	}

	/**
	 * Returns a string representation of the object.
	 * 
	 * @return a string representation of the object
	 * @since 1.0
	 * @author Ritikdev-lab
	 * @version 1.0
	 */
	@Override
	public String toString() {
		return getClass().getName()
				+ "[FirstNumber = " + FirstNumber
				+ "SecondNumber = " + SecondNumber
				+ "]";
	}
}

/**
 * <h2>Arithmetic Operation(double)</h2>
 * 
 * {@literal Represents a calculator that performs arithmetic operatons on double values.}
 * 
 * <p>
 * <strong>Note:</strong> The there are only 5 types of mathematical operation
 * in {@linkplain Another the another class}
 * 
 * <ul>
 * <li>{@link Another#Add(double, double)}:Addition of two doble</li>
 * <li>{@link Another#Minus(double, double)}:Subtraction of two double</li>
 * <li>{@link Another#Multiple(double, double)}:Multiply two double</li>
 * <li>{@link Another#Divide(double, double)}:Divide two double</li>
 * <li>{@link Another#Circle(double)}:Radious of the double</li>
 * </ul>
 * 
 * <p>
 * <em>Example:</em>
 * {@snippet :
 * Component Math = new Components();
 * Math.Add(12.12, 13.11);
 * Math.Minus(14.1, 12.0);
 * Math.Multiply(21.12, 12.1);
 * Math.Divide(14.2, 2.0);
 * Math.Circle(22.1);
 * }
 * 
 * @since 1.0
 * @version 1.0
 * @see Component
 * @author Ritikdev-lab
 */
class Another {
	private double First;
	private double Last;
	/**
	 * Approximation of the mathematical constant PI.
	 */
	private double PI = 22.0 / 7.0;

	/**
	 * Constructs a calculator with two double values.
	 * 
	 * @param a the first value
	 * @param b the second value
	 * @since 1.0
	 */
	Another(double a, double b) {
		this.First = a;
		this.Last = b;
	}

	/**
	 * Adds two double values.
	 * 
	 * @param a the first operand
	 * @param b the second operands
	 * @return the sum of the operands
	 * @since 1.0
	 */
	public double Add(double a, double b) {
		return a + b;
	}

	/**
	 * Substracts the second value from the first.
	 * 
	 * @param a the first operand
	 * @param b the second operand
	 * @return the difference of the operands
	 * @since 1.0
	 */
	public double Minus(double a, double b) {
		return a - b;
	}

	/**
	 * Miltiplies two double values.
	 * 
	 * @param a the first operand
	 * @param b the second operand
	 * @return the product of the operands
	 * @since 1.0
	 */
	public double Multiple(double a, double b) {
		return a * b;
	}

	/**
	 * Divide the first values by the second.
	 * 
	 * @param a the dividend
	 * @param b the divisor
	 * @return the quotient
	 * @throws ArithmeticException if {@code b} is zero
	 * @since 1.0
	 */
	public double Divide(double a, double b) {
		if (b == 0.0) {
			throw new ArithmeticException("Division by zero");
		}
		return a / b;
	}

	/**
	 * {@return the first stored double value}
	 * 
	 * @since 1.0
	 */
	public double First() {
		return First;
	}

	/**
	 * {@return the second stored double value}
	 * 
	 * @since 1.0
	 */
	public double Last() {
		return Last;
	}

	/**
	 * Computes the circumference of a circle
	 * 
	 * @param a the radious of the circle
	 * @return the circumference of the circle
	 * @since 1.0
	 */
	public double Circle(double a) {
		return 2 * PI * a;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param otherObject the object to compare with
	 * @return true if the objects are equal, false otherwise
	 * @since 1.0
	 * @author Ritikdev-lab
	 * @version 1.0
	 */
	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject == null) {
			return false;
		}
		if (getClass() != otherObject.getClass()) {
			return false;
		}

		Another other = (Another) otherObject;

		return Double.compare(First, other.First) == 0
				&& Double.compare(Last, other.Last) == 0;
	}

	/**
	 * Returns a hash code value for the object.
	 * 
	 * @return a hash code value for the object
	 * @since 1.0
	 * @author Ritikdev-lab
	 * @version 1.0
	 */
	@Override
	public int hashCode() {
		int result = Double.hashCode(First);
		result = 31 * result + Double.hashCode(Last);
		return result;
	}

	/**
	 * Returns a string representation of the object.
	 * 
	 * @return a string representation of the object
	 * @since 1.0
	 * @author Ritikdev-lab
	 * @version 1.0
	 */
	@Override
	public String toString() {
		return getClass().getName()
				+ "[First = " + First
				+ "Last = " + Last
				+ "]";
	}
}