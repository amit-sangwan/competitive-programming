package easy;

import java.util.Arrays;

/**
 * Class to find the nth maximum number in an array.
 */
public class FindNMaxNumber {
    public static void main(String[] args) {
        // Test cases
        System.out.println(nMax(new int[]{4, 3, 2, 8, 9, 5}, 1)); // 9
        System.out.println(nMax(new int[]{4, 3, 2, 8, 9, 5}, 2)); // 8
        System.out.println(nMax(new int[]{4, 3, 2, 8, 9, 5}, 3)); // 5
        System.out.println(nMax(new int[]{4, 3, 2, 8, 9, 5}, 100)); // 0
    }

    /**
     * Finds the nth maximum number in the given array.
     * @param arr The input array.
     * @param n The position of the maximum number to find.
     * @return The nth maximum number, or 0 if n is greater than the length of the array.
     */
    public static int nMax(int[] arr, int n) {
        // Check if the array length is less than n
        if (arr.length < n) {
            return 0;
        }
        // Sort the array
        Arrays.sort(arr);
        // Return the nth maximum number
        return arr[arr.length - n];
    }
}
