package io.github.ritikdevlab.learning.ch7.logger;

import java.util.ListResourceBundle;

public class Messages extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {

        return new Object[][] {

            { "welcome", "Welcome, {0}!" },

            { "fileError", "File operation failed" }

        };
    }
}

