package io.github.ritikdevlab.learning.ch7.assertion;

import java.lang.reflect.InvocationTargetException;

public class AssertIntro {
	public static void main(String[] args) throws Exception {
		ClassLoader loader = AssertIntro.class.getClassLoader();
		
		// 1. Enable assertion by default
		loader.setDefaultAssertionStatus(true);
		
		// 2. Disable assertions for the demo package
		loader.setPackageAssertionStatus("assertion", false);
		
		// 3. Enable assertions specifically for Checker
		loader.setClassAssertionStatus("assertion.Checker", true);
		
		// Load Checker after configuring assertion status
		Class<?> clazz = Class.forName(
				"assertion.Checker", true, loader
		);
		
		try {
			clazz.getMethod("check", int.class).invoke(null, -5);
		} catch (InvocationTargetException e) {
			IO.println(e.getCause());
		}
		
		// 4. Clear all explicit assertion settings
		loader.clearAssertionStatus();
		
		// Load another class after clearing assertion settings
		Class<?> clazz2 = Class.forName(
				"assertion.CheckerAfterClear", true, loader
		);
		clazz2.getMethod("check",int.class).invoke(null, -5);
	}
}
class Checker {
	public static void check(int number) {
		assert number >= 0: "Number cannot be negative";
		IO.println("Valid number: " + number);
	}
}

class CheckerAfterClear {
	public static void check(int number) {
		assert number >= 0 : "Number can not be negative";
		IO.println("After clearing: " + number);
	}
}