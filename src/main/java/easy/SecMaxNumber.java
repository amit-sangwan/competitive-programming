package easy;

/**
 * A class to find the second maximum number in an array.
 */
public class SecMaxNumber {

    /**
     * Main method to test the secMax function with sample inputs.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(secMax(new int[]{4, 781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[]{781, 8, 99, 103})); // 103
        System.out.println(secMax(new int[]{1, 2, 3, 4, 5})); // 4
        System.out.println(secMax(new int[]{3, 4})); // 3
    }

    /**
     * Finds the second maximum number in an integer array.
     * @param arr The input integer array.
     * @return The second maximum number in the array.
     */
    public static int secMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxInd = getMaxIndex(arr);

        // Iterate through the array to find the second maximum number
        for (int x = 0; x < arr.length; x++) {
            if (max < arr[x] && maxInd != x) {
                max = arr[x];
            }
        }
        return max;
    }

    /**
     * Finds the index of the maximum number in an integer array.
     * @param arr The input integer array.
     * @return The index of the maximum number.
     */
    public static int getMaxIndex(int[] arr) {
        int max = arr[0];
        int maxInd = 0;

        // Iterate through the array to find the index of the maximum number
        for (int x = 1; x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
                maxInd = x;
            }
        }
        return maxInd;
    }
}
