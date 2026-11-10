package io.github.ritikdevlab.learning.ch7.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceElementDemo {
	public static void main(String[] args) {
		placeOrder();
	}

	static void placeOrder() {
		IO.println("Placing order...");
		processPayment();
	}

	static void processPayment() {
		IO.println("Processsing payment...");
		generateReceipt();
	}

	static void generateReceipt() {
		IO.println("Generating receipt...\n");
		
		// 1. Capture stack trace using Throwable
		Throwable t = new Throwable();

		StringWriter out = new StringWriter();
		t.printStackTrace(new PrintWriter(out));

		String description = out.toString();

		IO.println("1. Throwable Stack Trace:");
		IO.println(description);

		// 2. Inspect stack using StackWalker
		IO.println("2. StackWalker:");

		StackWalker walker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

		walker.forEach(frame -> {
			IO.println(frame.getClassName() + " -> " + frame.getMethodName() + " -> Line: " + frame.getLineNumber());
		});

		// 3. Inspect individual stack frames
		IO.println("\n3. Indivisual Stack Frame: ");

		walker.walk(stream -> stream.limit(3).toList())
	      .forEach(frame -> {
	          IO.println("Class: " + frame.getDeclaringClass().getSimpleName());
	          IO.println("Method: " + frame.getMethodName());
	          IO.println("File: " + frame.getFileName());
	          IO.println("Line: " + frame.getLineNumber());
	          IO.println("----------------");
	      });
		
		// 4. Using getStackTrace()
		IO.println("4. getStackTrace():");
		
		StackTraceElement[] elements = t.getStackTrace();
		for (StackTraceElement element : elements) {
			IO.println(element.getClassName() + " -> " + element.getMethodName());
		}
	}
}
