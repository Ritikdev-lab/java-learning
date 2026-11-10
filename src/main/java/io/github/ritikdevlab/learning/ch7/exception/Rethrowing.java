package io.github.ritikdevlab.learning.ch7.exception;

import java.io.Serial;

public class Rethrowing {
	/*
	 * 1. Rethrowing exception- Catching an exception and throwing it again.
	 * 2. Chaining exception- Wrapping an original exception inside another exception while preserving the original 
	 * 							cause.
	 */
	public static void main(String[] args) throws TvException {
		Television tv = new Television();
		
		// When there is no constructor we can use the "initCause" to get the original error
		try {
			tv.validateSignalStrengthString(16);
		} catch (InvalidSignalStrengthException original) {
			TvException e = new TvException("TV error");
			e.initCause(original);
			throw e;
		}
		
		try {
			tv.validateSignalStrengthString(18);
		} catch (InvalidSignalStrengthException e) {
			throw new TvException("TV error", e);
		}
		
		try {
			try {
				tv.validateSignalStrengthString(13);
			} catch (InvalidSignalStrengthException e) {
				throw new TvException("TV error", e);
			}
		} catch (TvException e) {
			IO.println("Current Exception: " + e.getMessage());
			IO.println("Original Exception: " + e.getCause().getMessage());
		}
	}
}

class InvalidSignalStrengthException extends TvException{
	@Serial
	private static final long serialVersionUID = 1L;
	
	public InvalidSignalStrengthException(String message) {
		super(message);
	}
}

class TvException extends Exception {
	@Serial
	private static final long serialVersionUID = 1L;
	
	public TvException(String message) {
		super(message);
	}
	
	public TvException(String message, Throwable cause) {
		super(message, cause);
	}
}

class Television {
	public void validateSignalStrengthString(int signal) throws InvalidSignalStrengthException {
		if (signal < 15) {
			throw new InvalidSignalStrengthException("Signal Strength must be at least 15.");
		}
		IO.println("The Signal is Ok");
	}
}