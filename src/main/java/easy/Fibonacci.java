package easy;

import java.util.ArrayList;

/**
 * Class to generate and print Fibonacci sequence up to a given number.
 * Count the number of numbers of length 2
 * Time complexity: O(n)
 * - n: the given number
 */
public class Fibonacci {
    public static void main(String[] args) {
        // Test cases
        fib(3);   // 0 1 1
        fib(5);   // 0 1 1 2 3
        fib(6);   // 0 1 1 2 3 5
        fib(10);  // 0 1 1 2 3 5 8 13 21 34
        fib(100); // Will generate up to 100 Fibonacci numbers
    }

    /**
     * Generates and prints the Fibonacci sequence up to a given number.
     *
     * @param n The number of Fibonacci numbers to generate.
     */
    public static void fib(int n) {
        ArrayList<Integer> fibSequence = new ArrayList<>();

        fibSequence.add(0);
        fibSequence.add(1);

        // Generate Fibonacci numbers up to n
        for (int i = 2; i < n; i++) {
            fibSequence.add(fibSequence.get(i - 1) + fibSequence.get(i - 2));
        }

        // Count the number of Fibonacci numbers with length more than 1
        int count = 0;
        for (int num : fibSequence) {
            if (String.valueOf(num).length() == 2) {
                count++;
            }
        }

        // Print the Fibonacci sequence and the count of numbers with length equals to 2
        System.out.println("Fibonacci sequence up to " + n + ": " + fibSequence);
        System.out.println("Count of Fibonacci numbers with length equals to 2: " + count);
    }
}
