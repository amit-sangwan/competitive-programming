package easy;

/**
 * Class to check if a number is prime.
 * Time complexity: O(sqrt(n))
 *   - n: The number to check for primality.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(35)); // false
        System.out.println(isPrime(20)); // false
        System.out.println(isPrime(27)); // false
        System.out.println(isPrime(7)); // true
    }

    /**
     * Checks whether a given number is prime.
     * @param num The number to check.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Iterate from 2 to sqrt(num) to check for divisibility
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisor found, it's prime
    }
}
