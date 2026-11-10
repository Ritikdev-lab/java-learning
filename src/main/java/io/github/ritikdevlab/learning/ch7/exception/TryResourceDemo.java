package io.github.ritikdevlab.learning.ch7.exception;

import java.io.IOException;

public class TryResourceDemo {
	public static void main(String[] args) {
		/*
		 * IMPORTANT:
		 * 
		 * (1) A resource must implement AutoCloseable. 
		 * (2) Resources are closed automatically in reverse order.
		 * (3) Existing resources variable must be final or effectively final.
		 * (4) Exception from close() are suppressed if try block has already thrown an exception.
		 */
		try(
				MyResources resources1 = new MyResources("Resource 1", false);
				MyResources resources2 = new MyResources("Resource 2", true);
		) {
			resources1.doWork();
			resources2.doWork();
		} catch (IOException e) {
			IO.println("Exception caught: " + e.getMessage());
		}
		IO.println("Program finished.");
	}
}

class MyResources implements AutoCloseable {
	private final String name;
	private final boolean failOnWork;
	
	public MyResources(String name, boolean failOnWork) {
		this.name = name;
		this.failOnWork = failOnWork;
	}
	
	public void doWork() throws IOException {
		IO.println(name + ": Performing some work...");
		if (failOnWork) {
			throw new IOException("Something went wrong!");
		}
	}
	@Override
	public void close() {
		IO.println("Resource is closed.");
	}
}