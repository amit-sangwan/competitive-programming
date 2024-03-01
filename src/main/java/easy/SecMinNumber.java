package easy;

import java.util.Arrays;

/**
 * A class to find the second minimum number in an array.
 */
public class SecMinNumber {

    /**
     * Main method to test the secMin function with sample inputs.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(secMin(new int[]{4, 781, 8, 99, 103})); // 8
        System.out.println(secMin(new int[]{1, 2, 3, 4, 5})); // 2
        System.out.println(secMin(new int[]{3, 4})); // 4
    }

    /**
     * Finds the second minimum number in an integer array.
     * @param numArr The input integer array.
     * @return The second minimum number in the array.
     */
    public static int secMin(int[] numArr) {
        int min = getMinNum(numArr); // Get the minimum value
        int secondMin = Integer.MAX_VALUE;

        // Iterate through the array to find the second minimum number
        for (int a = 0; a < numArr.length; a++) {
            if (secondMin > numArr[a] && numArr[a] != min) { // Bitwise AND operator
                secondMin = numArr[a];
            }
        }

        return secondMin;
    }

    /**
     * Finds the minimum number in an integer array.
     * @param arr The input integer array.
     * @return The minimum number in the array.
     */
    public static int getMinNum(int[] arr) {
        int min = arr[0];

        // Iterate through the array to find the minimum number
        for (int a = 0; a < arr.length; a++) {
            if (min > arr[a]) {
                min = arr[a];
            }
        }
        return min;
    }
}
