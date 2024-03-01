package easy;

/**
 * Class to find the minimum number in an array.
 * Time complexity: O(n)
 * - n: The number of elements in the array.
 */
public class MinNumber {
    public static void main(String[] args) {
        // Test cases
        System.out.println(min(new int[]{4, 781, 8, 99, 103})); // 4
        System.out.println(min(new int[]{1, 2, 3, 4, 5}));      // 1
        System.out.println(min(new int[]{3, 4}));               // 3
        System.out.println(min(new int[]{100}));                // 100
    }

    /**
     * Finds the minimum number in the given array.
     *
     * @param arrNum The input array.
     * @return The minimum number in the array.
     */
    public static int min(int[] arrNum) {
        // Initialize minInt to the maximum possible integer value
        int minInt = Integer.MAX_VALUE;

        // Iterate through the array
        for (int element : arrNum) {
            // Update minInt if a smaller element is found
            if (minInt > element) {
                minInt = element;
            }
        }
        // Return the minimum number
        return minInt;
    }
}
