package easy;

/**
 * Class to implement the FizzBuzz algorithm.
 * Time complexity: O(n)
 * - n: The upper limit of numbers to print.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
        // Additional test cases
        System.out.println("Additional Test Cases:");
        fizzBuzz(15); // Test case for 15
        fizzBuzz(20); // Test case for 20
    }

    /**
     * Prints numbers from 1 to 100 with the FizzBuzz rules.
     */
    public static void fizzBuzz() {
        fizzBuzz(100); // Call the overloaded method with 100 as the argument
    }

    /**
     * Prints numbers from 1 to n with the FizzBuzz rules.
     *
     * @param n The upper limit of numbers to print.
     */
    public static void fizzBuzz(int n) {
        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Otherwise, print the number
            else {
                System.out.println(i);
            }
        }
    }
}
