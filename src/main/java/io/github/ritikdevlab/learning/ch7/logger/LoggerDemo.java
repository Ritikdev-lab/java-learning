package io.github.ritikdevlab.learning.ch7.logger;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.LogRecord;
import java.util.logging.Level;

public class LoggerDemo {

    private static final String LOGGER_NAME =
            "com.demo.application";

    private static final System.Logger logger =
            System.getLogger(LOGGER_NAME);

    public static void main(String[] args) throws IOException {

        // 1. Logger information
        System.out.println("Logger name: " + logger.getName());

        System.out.println(
                "INFO enabled: " +
                logger.isLoggable(System.Logger.Level.INFO)
        );

        // 2. Basic logging
        logger.log(System.Logger.Level.INFO,
                "Application started");

        logger.log(System.Logger.Level.WARNING,
                "This is a warning");

        logger.log(System.Logger.Level.ERROR,
                "An error occurred");

        // 3. Logging an Object
        Object message = new StringBuilder(
                "Logging an object"
        );

        logger.log(System.Logger.Level.INFO, message);

        // 4. Logging with Supplier
        logger.log(System.Logger.Level.DEBUG,
                () -> "This message is created lazily");

        // 5. Logging with Supplier and Throwable
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            logger.log(System.Logger.Level.ERROR,
                    () -> "Calculation failed", ex);
        }

        // 6. Logging with Throwable
        try {
            throw new IOException("File not found");
        } catch (IOException ex) {
            logger.log(System.Logger.Level.WARNING,
                    "Unable to read file", ex);
        }

        // 7. Formatted logging
        logger.log(System.Logger.Level.INFO,
                "User {0} logged in from {1}",
                "Ritik", "India");

        // 8. Logging with ResourceBundle
        ResourceBundle bundle = new Messages();

        logger.log(System.Logger.Level.INFO,
                bundle, "welcome", "Ritik");

        logger.log(System.Logger.Level.WARNING,
                bundle, "fileError",
                new IOException("Missing file"));

        // 9. Demonstrate LogRecord
        inspectLogRecord();

        System.out.println("Demo completed.");
    }

    // Demonstrate LogRecord getters
    private static void inspectLogRecord() {

        LogRecord record = new LogRecord(
                Level.INFO,
                "Testing LogRecord"
        );

        record.setLoggerName(LOGGER_NAME);

        record.setSourceClassName(
                LoggerDemo.class.getName()
        );

        record.setSourceMethodName("inspectLogRecord");

        System.out.println("\n--- LogRecord Information ---");

        System.out.println("Level: " +
                record.getLevel());

        System.out.println("Logger: " +
                record.getLoggerName());

        System.out.println("Message: " +
                record.getMessage());

        System.out.println("Source class: " +
                record.getSourceClassName());

        System.out.println("Source method: " +
                record.getSourceMethodName());

        System.out.println("Millis: " +
                record.getMillis());

        System.out.println("Instant: " +
                record.getInstant());

        System.out.println("Sequence: " +
                record.getSequenceNumber());

        System.out.println("Thread ID: " +
                record.getLongThreadID());

        System.out.println("Thrown: " +
                record.getThrown());

        System.out.println("Parameters: " +
                record.getParameters());

        System.out.println("Resource bundle: " +
                record.getResourceBundle());

        System.out.println("Bundle name: " +
                record.getResourceBundleName());
    }
}
