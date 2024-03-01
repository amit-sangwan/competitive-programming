package easy;

/**
 * Class to find the maximum number in an array.
 * Time complexity: O(n)
 *   - n: The number of elements in the array.
 */
public class MaxNumber {
    public static void main(String[] args) {
        // Test cases
        System.out.println(max(new int[]{4, 781, 8, 99, 103})); // 781
        System.out.println(max(new int[]{1, 2, 3, 4, 5}));      // 5
        System.out.println(max(new int[]{3, 4}));               // 4
        System.out.println(max(new int[]{100}));                // 100
    }

    /**
     * Finds the maximum number in the given array.
     * @param arr The input array.
     * @return The maximum number in the array.
     */
    public static int max(int[] arr) {
        // Initialize maxInt to the first element of the array
        int maxInt = arr[0];

        // Iterate through the array
        for (int element : arr) {
            // Update maxInt if a greater element is found
            if (maxInt < element) {
                maxInt = element;
            }
        }
        // Return the maximum number
        return maxInt;
    }
}
