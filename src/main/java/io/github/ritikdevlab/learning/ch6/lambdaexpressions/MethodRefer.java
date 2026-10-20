package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

class Time {
	public LocalDateTime currectTime() {
		return LocalDateTime.now();
	}
}

public class MethodRefer extends Time{
	int sum(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	void main() {
		String separator = "/";
		Predicate<String> predict = separator::equals;
		IO.println(predict.test("|"));
		IO.println(predict.test("/"));
		
		Function<String, String> clean = String::strip;
		IO.println(clean.apply(" Java "));
		
		BiFunction<String, String, String> combine = String::concat;
		IO.println(combine.apply("Hello", ",World!"));
		
		ToIntFunction<String> converter = Integer::valueOf;
		IO.println(converter.applyAsInt("43156"));
		
		BiFunction<Integer, Integer, Integer> sum = Integer::sum;
		IO.println(sum.apply(230, 500));
		
		Function<int[], Integer> arraySum = this::sum;
		IO.println(arraySum.apply(new int[] {3, 2, 6, 7}));
		
		Supplier<LocalDateTime> currectTime = super::currectTime;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		IO.println(currectTime.get().format(format));
		
	}
}