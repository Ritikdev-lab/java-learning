package io.github.ritikdevlab.dsa.theory;

/**
 * <h2>Explains the time complexity</h2>
 * 
 * <p>
 * <head>Note:</head>
 * <ul>
 * <li>O(1) < O(log N) < O(N) < O(N log N) < O(n^2) < O(N^3) < O(2^N) <
 * O(!N)</li>
 * <li>Try to make the time complexity as low as possible</li>
 * </ul>
 */

public class BigOExample {
    /**
     * This is the example of the O(1) or Constant Time Complelxity
     * 
     * @param arr the array of numbers
     * @return the first number of the array
     */
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    /**
     * This is the example of the O(log N) or Logarithmic Time Complexity
     * 
     * @param arr the array of numbers
     * @param target the number to search for
     * @return the index of the target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * This is the example of the O(N) or Linear Time Complexity
     * 
     * @param arr the array of numbers
     * @param target the number to search for
     * @return the index of the target if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This is the example of O(NlogN) or Linearithmic Time Complexity
     * 
     * @param arr the array of numbers
     * @param left the left index
     * @param right the right index
     */
    public static void mergeSorts(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSorts(arr, left, mid);
            mergeSorts(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    /**
     * This is the example of O(NlogN) or Linearithmic Time Complexity
     * 
     * @param arr the array of numbers
     * @param left the left index
     * @param mid the middle index
     * @param right the right index
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    /**
     * This is the example of the O(N*N) Quadratic Time complexity
     * 
     * @param arr the array of numbers
     */
    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                IO.println(arr[i] + ", " + arr[j]);
            }
        }
    }

    /**
     * This is the example of the O(N*N*N) Cubic Time Complexity
     * 
     * @param arr the array of numbers
     */
    public static void printTriplets(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    IO.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                }
            }
        }
    }

    /**
     * This is the example of the O(2^N) or Exponential Time Complexity
     * 
     * @param n the number to calculate Fibonacci for
     * @return n if n <= 1 if not return fib(n -1) + fib(n- 2)
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * This is the example of the O(N!) or Factorial Time Complexity.
     * 
     * @param str the string to permute
     * @param ans the accumulated permutation
     */
    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            IO.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permute(rest, (ans + ch));
        }
    }
}
