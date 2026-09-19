package io.github.ritikdevlab.Example.v1ch05.ObjectAnalyzer;

import module java.base;

/**
 * This program uses reflection to spy on objects.
 */
public class ObjectAnalyzerDemo {
    void main() throws Exception {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            squares.add(i * i);
        }
        IO.println(new ObjectAnalyzer().toString(squares));
        /**
         * Command for run:-
         * 1. cd ~/Desktop/project/target/classes
         * 2. java --add-opens java.base/java.util=ALL-UNNAMED \
         * 		--add-opens java.base/java.lang=ALL-UNNAMED \
         * 		io/github/ritikdevlab/Reflection/ObjectAnalyzer/ObjectAnalyzerDemo
         */
    }
}
