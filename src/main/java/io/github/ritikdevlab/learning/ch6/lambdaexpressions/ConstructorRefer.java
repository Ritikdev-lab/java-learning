package io.github.ritikdevlab.learning.ch6.lambdaexpressions;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.*;

class Person {
	String name;

	// Constructor 1: accepts a String
	Person(String name) {
		this.name = name;
	}

	// Constructor 2: no arguments
	Person() {
		this.name = "Unknown";
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class ConstructorRefer {
	public static void main(String[] args) {
		// 1. Constructor reference: Person::new
		ArrayList<String> names = new ArrayList<>(List.of("Rahul", "Priya", "Amit"));
		Stream<Person> stream = names.stream().map(Person::new);
		List<Person> people = stream.toList();
		IO.println("People: " + people);

		// Equivalent lambda: names.stream().map(name -> new Person(name));

		// 2. Array constructor reference: Person[]::new
		Person[] personArray = people.toArray(Person[]::new);
		IO.println("Person array: " + Arrays.toString(personArray));

		// 3. Array constructor reference: int[]::new
		int[] numbers = IntFunctionExample();
		IO.println("Integer array length: " + numbers.length);

		// 4. Overloaded constructor reference: Date::new
		Date[] dates = new Date[3];
		Arrays.setAll(dates, Date::new);
		IO.println("Date milliseconds: " + dates[0].getTime() + ", " + dates[1].getTime() + ", " + dates[2].getTime());

		// 5. String::new
		Function<String, String> stringCreator = String::new;
		String text = stringCreator.apply("Hello");
		IO.println("String: " + text);

		// 6. String[]::new
		IntFunction<String[]> stringArrayCreator = String[]::new;
		String[] words = stringArrayCreator.apply(3);
		IO.println("String array length: " + words.length);

		// 7. Default toArray() returns Object[]
		Object[] peopleObjects = names.stream().map(Person::new).toArray();
		IO.println("Object array: " + Arrays.toString(peopleObjects));

		// 8. Correctly typed Person[] array "Person[]::new" tells toArray how to create the array.
		Person[] typedArray = names.stream().map(Person::new).toArray(Person[]::new);
		IO.println("Typed array class: " + typedArray.getClass().getTypeName());

		// 9. Equivalent lambda for int[]::new
		IntFunction<int[]> intArrayLambda = n -> new int[n];
		int[] anotherNumbers = intArrayLambda.apply(5);
		IO.println("Another integer array length: " + anotherNumbers.length);
	}

	static int[] IntFunctionExample() {
		IntFunction<int[]> creator = int[]::new;
		return creator.apply(3);
	}
}