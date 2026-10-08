package io.github.ritikdevlab.learning.ch6.interfacedemo;

public class FirstInterface implements Array, Circle {
	@Override
	public int addNum(int[] arr) {
		int result = 0;
		for (int i : arr) {
			result += i;
		}
		return result;
	}
	
	@Override
	public double getPiValue() {
		return Circle.super.getPiValue();
	}
	
	// But in super class and interface naming conflict super class wins.

	public static void main(String[] args) {
		int[] arr = { 5, 6, 9, 2, 4 };
		boolean find = Array.checkNum(arr, 9);
		IO.println("The result is =" + find);

		FirstInterface f = new FirstInterface();
		int sum = f.addNum(arr);
		IO.println("Result of sum =" + sum);

		double pi = f.getPiValue();
		IO.println("Pi Value =" + pi);

	}
}

interface Array {
	// The fields of interface is always "public static final"
	double PI = 3.14;

	// This is abstract method
	int addNum(int[] arr);

	// This is "public static" method.All method in interface is public.
	static boolean checkNum(int[] arr, int find) {
		return checkNumber(arr, find);
	}

	// This is private static method.
	private static boolean checkNumber(int[] arr, int find) {
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				result = true;
				break;
			}
		}
		return result;
	}

	// This is default method
	default double getPiValue() {
		return PI;
	}
}

interface Circle {
	double PI = 3.141592653589793;

	default double getPiValue() {
		return PI;
	}
}
