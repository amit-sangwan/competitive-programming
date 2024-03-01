package easy;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Original array
        int[] inputArr = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(inputArr)); // Print original array [1, 2, 3, 4, 5]

        // Reverse the array
        inputArr = revArr(inputArr);

        // Print reversed array
        System.out.println(Arrays.toString(inputArr)); // Print reversed array [5, 4, 3, 2, 1]
    }

    // Function to reverse the array
    public static int[] revArr(int[] arr) {
        // Initialize start and end pointers
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start and end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Return the reversed array
        return arr;
    }
}
