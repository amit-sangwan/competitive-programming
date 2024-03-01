package easy;

import java.util.Arrays;

/**
 * A class to find two numbers in an array that sum up to a given target.
 */
public class SumOfTwo {

    /**
     * Main method to test the sumOfTwo function with sample inputs.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] inputArr = new int[]{1, 2, 3, 5};
        System.out.println(Arrays.toString(sumOfTwo(inputArr, 4))); // [1, 3]

        inputArr = new int[]{7, 7, 4, 3, 8};
        System.out.println(Arrays.toString(sumOfTwo(inputArr, 7))); // [4, 3]

        inputArr = new int[]{13, 43, 2, 71};
        System.out.println(Arrays.toString(sumOfTwo(inputArr, 84))); // [13, 71]
    }

    /**
     * Finds two numbers in an integer array that sum up to a given target.
     * @param arr The input integer array.
     * @param target The target sum to achieve.
     * @return An array containing the two numbers that sum up to the target. If no such pair exists, returns an array of two zeros.
     */
    public static int[] sumOfTwo(int[] arr, int target) {
        int[] sumOfTwoArr = new int[2];

        // Iterate through the array to find two numbers that sum up to the target
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sumOfTwoArr[0] = arr[i];
                    sumOfTwoArr[1] = arr[j];
                }
            }
        }

        return sumOfTwoArr;
    }
}
