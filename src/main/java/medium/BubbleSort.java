package medium;

import java.util.Arrays;

/**
 * A class to implement the Bubble Sort algorithm for sorting an integer array.
 */
public class BubbleSort {

    /**
     * Main method to demonstrate the Bubble Sort algorithm with a sample array.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        bSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]
    }

    /**
     * Sorts an integer array using the Bubble Sort algorithm.
     * @param arr The integer array to be sorted.
     */
    public static void bSort(int[] arr) {
        int swapCounter = -1; // Initialize swap counter
        int unsortedArrayLength = arr.length; // Length of unsorted portion of the array

        // Iterate until no more swaps are needed
        while (swapCounter != 0) {
            swapCounter = 0; // Reset swap counter

            // Iterate through the unsorted portion of the array
            for (int i = 0; i < unsortedArrayLength - 1; i++) {
                // Swap adjacent elements if they are in the wrong order
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapCounter++; // Increment swap counter
                }
            }
        }
    }
}
