package medium;

import java.util.Arrays;

/**
 * A class to implement the Selection Sort algorithm for sorting an integer array.
 */
public class SelectionSort {

    /**
     * Main method to demonstrate the Selection Sort algorithm with a sample array.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]
    }

    /**
     * Sorts an integer array using the Selection Sort algorithm.
     * @param arr The integer array to be sorted.
     */
    public static void sSort(int[] arr) {
        // Iterate through the array
        for (int j = 0; j < arr.length; j++) {
            // Assume the current element as the minimum
            int min = arr[j];
            int minIndex = j;

            // Find the minimum element in the unsorted portion of the array
            for (int i = j + 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }

            // Swap the minimum element with the first element of the unsorted portion
            int temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
