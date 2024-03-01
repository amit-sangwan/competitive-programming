package medium;

import java.util.Arrays;

/**
 * A class to implement the Binary Search algorithm for searching an integer in a sorted array.
 */
public class BinarySearch {

    /**
     * Main method to demonstrate the Binary Search algorithm with a sorted array.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 1, 9, 10, 0};
        Arrays.sort(arr); // Sorting the array
        System.out.println(Arrays.toString(arr));

        // [0, 1, 2, 5, 6, 9, 10]
        System.out.println("index of 9: " + bSearch(arr, 9)); // index of 9: 5
        System.out.println("index of 1: " + bSearch(arr, 1)); // index of 1: 1
        System.out.println("index of 7: " + bSearch(arr, 13)); // index of 7: -1
    }

    /**
     * Searches for a target integer in a sorted integer array using the Binary Search algorithm.
     * @param arr The sorted integer array to be searched.
     * @param target The target integer to be searched for.
     * @return The index of the target integer in the array if found, or -1 if not found.
     */
    public static int bSearch(int[] arr, int target) {
        int start = 0; // Start index of the search range
        int end = arr.length - 1; // End index of the search range

        // Perform binary search until the target is found or the search range is exhausted
        while (start <= end) {
            int middle = (start + end) / 2; // Middle index of the search range

            if (arr[middle] == target) {
                return middle; // Target found, return its index
            } else if (target < arr[middle]) {
                end = middle - 1; // Adjust the end of the search range
            } else {
                start = middle + 1; // Adjust the start of the search range
            }
        }

        return -1; // Target not found
    }
}
