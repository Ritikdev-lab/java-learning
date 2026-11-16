package io.github.ritikdevlab.learning.ch7.logger;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Handler;

public class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {

        return String.format(
                "[%s] [%s] [%s] %s%n",
                record.getInstant(),
                record.getLevel(),
                record.getLoggerName(),
                formatMessage(record)
        );
    }

    @Override
    public String getHead(Handler handler) {

        return "===== APPLICATION LOG START =====\n";
    }

    @Override
    public String getTail(Handler handler) {

        return "===== APPLICATION LOG END =====\n";
    }
}