package io.github.ritikdevlab.learning.ch7.exception;

import java.io.Serial;

public class MultipleException {
	public static void main(String[] args) {
		Student student = new Student();
		/*
		 * We can catch multiple Exception in single catch clause when those are not parent and child. Also the
		 * variable must be effectively final
		 */
		try {
			student.register("Rohan", 23);
		} catch (InvalidUserArgumentException | RegistrationFailedException e) {
			IO.println(e.getMessage());
		} catch (DuplicateStudentException e) {
			e.printStackTrace();
		}
	}
}

/**
 * Exception thrown when the user provides invalid arguments
 * while performing an operation.
 *
 * <p>This exception can be used to indicate invalid or missing
 * user input, such as a null or blank name or an invalid age.</p>
 * 
 * @since 1.0
 */
class InvalidUserArgumentException extends Exception {
	@Serial
	private static final long serialVersionUID = 1L;
	
	/**
     * Constructs a new exception without a detail message.
     */

	public InvalidUserArgumentException() {}
	
	/**
     * Constructs a new exception with the specified detail message.
     *
     * @param message the detail message explaining the invalid argument
     */
	public InvalidUserArgumentException(String message) {
		super(message);
	}
}

/**
 * Exception thrown when a student registration operation fails.
 *
 * <p>This exception indicates that the provided student details
 * do not satisfy the registration requirements.</p>
 * 
 * @since 1.0
 */
class RegistrationFailedException extends Exception {
	@Serial
	private static final long serialVersionUID = 1L;
	
	/**
     * Constructs a new exception without a detail message.
     */
	public RegistrationFailedException() {}
	
	 /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message the detail message explaining the registration failure
     */
	public RegistrationFailedException(String message) {
		super(message);
	}
}

/**
 * Exception thrown when attempting to register a student
 * who is already registered.
 *
 * <p>This exception prevents duplicate student registrations.</p>
 *
 * @since 1.0
 */
class DuplicateStudentException extends Exception {
	@Serial
	private static final long serialVersionUID = 1L;
	
	/**
     * Constructs a new exception without a detail message.
     */
	public DuplicateStudentException() {}
	
	/**
     * Constructs a new exception with the specified detail message.
     *
     * @param message the detail message explaining the duplicate registration
     */
	public DuplicateStudentException(String message) {
		super(message);
	}
}

class Student {
	/**
     * Registers a student after validating the provided details.
     *
     * @param name the name of the student
     * @param age the age of the student
     *
     * @throws InvalidUserArgumentException if the name is null,
     *         blank, or the age is less than or equal to zero
     *
     * @throws RegistrationFailedException if the student's age
     *         is below 18 or above 25
     *
     * @throws DuplicateStudentException if the student is already registered
     */
	public void register (String name, int age) throws InvalidUserArgumentException, RegistrationFailedException, 
														DuplicateStudentException {
		if (name == null || name.isBlank() || age <= 0) {
			throw new InvalidUserArgumentException("Invalid student details.");
		}
		
		if (age < 18 || age > 25) {
			throw new RegistrationFailedException("Student registration is not allowed.");
		}
		
		if (name.equalsIgnoreCase("Rahul")) {
			throw new DuplicateStudentException("Student is already registered");
		}
		IO.println("Student registered successfully");
	}
}