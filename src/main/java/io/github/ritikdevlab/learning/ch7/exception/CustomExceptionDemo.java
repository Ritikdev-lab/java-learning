package io.github.ritikdevlab.learning.ch7.exception;

import java.io.Serial;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		/*
		 * (1) If any code inside the try block throws the exception the program skips the 
		 * try block and only execute the handler code inside the catch block.
		 * 
		 * (2) If none of the block inside the try block throws exception then the program skips
		 * the catch block.
		 * 
		 * Without handling it we have to advertise the fact that the method may throw an InvalidAgeException.
		 * It propagates an Exception.
		 * 
		 * Exception propagation: If a method cannot handle an exception, Java passes that exception to its caller.
		 * 						If the caller cannot handle it either, Java continues searching up the call stack
		 * 						until a suitable catch block is found. If none is found, the thread terminates with
		 * 						an uncaught exception.
		 */
		try {
			ExceptionDemo.validateAge(15);
		} catch (InvalidAgeException e) {
			IO.println(e.getMessage());
		}
	}
}

/**
 * Exception thrown when an invalid age is provided
 * during an operation.
 *
 * <p>This exception indicates that the supplied age does not
 * satisfy the required age validation criteria.</p>
 * 
 * @since 1.0
 */
class InvalidAgeException extends Exception {
	@Serial
    private static final long serialVersionUID = 1L;
	
	/**
	 * Construct an {@code InvalidAgeException} without a detail message.
	 */
	public InvalidAgeException() {}
	/**
	 * Construct an {@code InvalidAgeException} with the specified detail message.
	 * 
	 * @param message the detail message describing the exception
	 */
	public InvalidAgeException(String message) {
		super(message);
	}
}

class ExceptionDemo {
	/**
	 * Checks whether the specified age meets the minimum age requirement of 18 years used by
	 * this example.
	 *
	 * <p>if the age is below 18, and {@link InvalidAgeException}
	 * is thrown. Otherwise, the method prints {@code Eligible}.</p>
	 *
	 * @throws InvalidAgeException if the specified age is below 18
	 */
	static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		
		IO.println("Eligible");
	}
}