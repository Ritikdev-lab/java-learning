package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

import java.math.BigInteger;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.UnaryOperator;

public class Processing {
	/**
	 * Runs the given {@link Runnable} {@code n} times.
	 * <p>
	 * If {@code n} is zero or negative, the action is not run at all.
	 *
	 * @param n the number of times to run {@code action}
	 * @param action the action to run; must not be {@code null}
	 * @throws NullPointerException if {@code action} is {@code null}
	 */
	public static void repeat(int n, Runnable action) {
		for (int i = 0; i < n; i++) {
			action.run();
		}
	}

	/**
	 * Runs the given {@link IntConsumer} {@code n} times, passing the current
	 * iteration index (starting at {@code 0}) to the action each time.
	 * <p>
	 * If {@code n} is zero or negative, the action is not run at all.
	 *
	 * @param n the number of times to run {@code action}
	 * @param action the action to run, receiving the zero-based iteration index;
	 *               must not be {@code null}
	 * @throws NullPointerException if {@code action} is {@code null}
	 */
	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++) {
			action.accept(i);
		}
	}

	/**
	 * Returns the square of the value supplied by {@code s}. Note: {@code s.get()}
	 * is called twice.
	 *
	 * @param s supplier of the value to square
	 * @return {@code s.get() * s.get()}
	 */
	public static int squre(Supplier<Integer> s) {
		return s.get() * s.get();
	}

	public static void main(String[] args) {
		Processing.repeat(5, () -> IO.println("Hello World!"));
		Processing.repeat(6, i -> IO.println("Countdown: " + (6 - i)));

		int result = Processing.squre(() -> 4);
		IO.println("4 * 4 = " + result);

		Consumer<String> print = t -> IO.println(t);
		print.accept("Hello World!");

		Function<String, Integer> length = t -> t.length();
		IO.println(length.apply("Hello"));

		Predicate<Integer> predict = l -> l % 2 == 0;
		IO.println(predict.test(10));

		BiConsumer<String, Integer> b = (name, salary) -> IO.println(name + ": " + salary);
		b.accept("Nabin", 20_000);

		BiFunction<Integer, Integer, Integer> sum = (t, u) -> t + u;
		IO.println(sum.apply(200, 100));

		UnaryOperator<Integer> cube = t -> t * t * t;
		IO.println(cube.apply(5));

		BiPredicate<String, Integer> dualPredicate = (t, u) -> t.length() < u;
		IO.println(dualPredicate.test("King", 6));
		
		BinaryOperator<Double> devide = (t, u) -> t / u;
		IO.println(devide.apply(300.0, 100.0));
		
		// Functional interface for primitive type :-
		
		BooleanSupplier suply = () -> 500 / 200 == 0;
		IO.println(suply.getAsBoolean());
		
		// PSupplier:- IntSupplier, LongSupplier, DoubleSupplier
		IntSupplier age = () -> 21;
		IO.println(age.getAsInt());
		
		// PConsumer:- IntConsumer, LongConsumer, DoubleConsumer
		IntConsumer countDown = j -> {
			for (int k = 0; k < j; k++) {
				IO.println("Countdown: " + (j - k));
			}
		};
		countDown.accept(3);
		
		// ObjPConsumer<T>:- ObjIntConsumer<T>, ObjLongConsumer<T>, ObjDoubleConsumer
		ObjDoubleConsumer<Integer> obj = (t, value) -> IO.println("Multification result: " + 2 * t * value);
		obj.accept(3, 54.00);
		
		// PFunction:- IntFunction<T>, DoubleFunction, LongFunction
		IntFunction<Double> circumference = value -> 2 * 3.142857143 * value;
		IO.println(circumference.apply(5));
		
		/*
		 * PtoQFunction:- IntToDoubleFunction, IntToLongFunction, LongToIntFunction, 
		 * 					LongToDoubleFunction, DoubleToIntFunction, DoubleToLongFunction
		 */
		
		IntToDoubleFunction area = value -> 0.433012702 * value * value;
		IO.println("Area of triangle of side length 6: " + area.applyAsDouble(6));
		
		// ToPFunction<T>:- ToIntFunction<T>, ToDoubleFunction<T>, ToLongFunction<T>
		ToDoubleFunction<Integer> height = value -> 0.866025404 * value;
		IO.println("Height of the triangle of side length 6: " + height.applyAsDouble(6));
		
		// ToPBiFunction<T,U>:- ToIntBiFunction<T>, ToDoubleBiFunction<T>, ToLongBiFunction<T>
		ToDoubleBiFunction<Integer, Integer> stdArea = (t, u) -> 0.5 * t * u;
		IO.println("The standard area of given base 5 and height 6: " + stdArea.applyAsDouble(5, 6));
		
		// PUnaryOperator:- IntUnaryOperator, DoubleUnaryOperator, LongUnaryOperator
		DoubleUnaryOperator circleArea = operand -> 3.142857143 * operand * operand;
		IO.println("The Area of the circle given the radius 10: " + circleArea.applyAsDouble(10));
		
		// PBinaryOperator:- IntBinaryOperator, DoubleBinaryOperator, LongBinaryOperator
		DoubleBinaryOperator force = (left, right) -> left * right;
		IO.println("The net force given mass 20 and acceleration 10: " + force.applyAsDouble(20, 10));
		
		// PPredicate:- IntPredicate, LongPredicate, DoublePredicate
		IntPredicate evenOrOdd = value -> value % 2 == 0;
		IO.println("20 is even: " + evenOrOdd.test(20));
		
		String input = " 618970019642690137449562111 ";
		boolean isPrime = input.strip().transform(BigInteger::new).isProbablePrime(20);
		IO.println(isPrime);
	}
}
