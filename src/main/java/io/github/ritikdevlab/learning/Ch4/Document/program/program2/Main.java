package io.github.ritikdevlab.learning.Ch4.Document.program.program2;

/**
 * Application entry point for practice package.
 */
public class Main {
    /**
     * Default constructor for Main.
     */
    public Main() {
    }

    /**
     * This is a demonstrates
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // @start region = main-example

        int name = 123;
        Anathor j = new Anathor();
        int jb = j.Name(name);
        int cf = j.Speed(name);
        IO.println(jb);
        IO.println(cf);

        // @end
    }
}
