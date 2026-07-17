package io.github.ritikdevlab.learning.Ch5.Varargs;
public class Varargs {
    /**
     * Find the Highest number from the given numbers
     * 
     * @param number The numbers from which calculate highest
     * @return The Highest numbers from the given numbers
     * @author Ritikdev-lab
     * @since 1.0
     * @version 1.0
     */
    public static int highestNumber(int... numbers) {
        int maxValue = Integer.MIN_VALUE;
        for(int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }
        return maxValue;
    }

    /**
     * Find the index of a given number from the numbers given
     * 
     * @param find The number to find
     * @param numbers From the numbers to find
     * @return The index of the number to find
     * @author Ritikdev-lab
     * @since 1.0
     * @version 1.0
     */
    public static int findNumber(int find, int... numbers) {
        int foundResult = 0;
        for (int i = 0;i < numbers.length;i++) {
            if (numbers[i] == find) {
                foundResult = i;
            }
        }
        return foundResult;
    }
}
