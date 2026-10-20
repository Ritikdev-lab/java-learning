package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;


public class Functional {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> b = (first, second) -> first + second;
		int result = b.apply(120, 240);
		IO.println(result);

		Predicate<Integer> p = n -> n > 0;
		IO.println(p.test(23));
		IO.println(p.test(-12));

		ArrayList<String> arr = new ArrayList<>(Arrays.asList("Java", null, "Python", null, "C++"));
		arr.removeIf(e -> e == null);
		IO.println(arr);

		Supplier<Integer> random = () -> (int) (Math.random() * 6) + 1;
		IO.println(random.get());

		/**
		 * Here the default date is constructed before the method is called, even if day is non-null.
		 * So it waste many resources.
		 */
		LocalDate hireday = Objects.requireNonNullElse(LocalDate.now(), LocalDate.of(2006, 12, 12));
		IO.println(hireday);

		/**
		 * Here The default date is constructed only if day is null and the default is required.
		 * So it save more resources.
		 */
		LocalDate newHireDate = Objects.requireNonNullElseGet(LocalDate.now(), () -> LocalDate.of(2006, 12, 12));
		IO.println(newHireDate);

		Function<Integer, String> f = n -> "Number:" + n;
		IO.println(f.apply(14));

		IntFunction<String> i = n -> "Number:" + n;
		IO.println(i.apply(15));

		ToIntFunction<String> t = s -> s.length();
		IO.println(t.applyAsInt("Java"));

		IntUnaryOperator squre = n -> n * n;
		IO.println(squre.applyAsInt(4));

		int[] value = new int[10];
		Arrays.setAll(value, n -> n * n);
		IO.println(Arrays.toString(value));
	}
}
