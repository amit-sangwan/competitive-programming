package easy;

import java.util.Arrays;
/*
Problem Statement

You are given an integer array a of size n.
You need to construct a new array b of the same size where:

b[i]=a[i−1]+a[i]+a[i+1]

If a[i-1] or a[i+1] is out of bounds (does not exist), treat it as 0.

Return the new array b.

Example 1

Input:
a = [1, 2, 3, 4, 5]

Output:
b = [3, 6, 9, 12, 9]
 */
public class PayPay1 {

    // Method to implement
    public static int[] transformArray(int[] a) {
        int length = a.length;
        int[] b = new int[length];
        int left , right ;

        for(int i = 0 ; i < length ; i++){
           left = i-1 < 0 ? 0 : a[i-1];
           right = i+1 == length ? 0 : a[i+1];
           b[i]=left + right + a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] a1 = {1, 2, 3, 4, 5};
        System.out.println("Input:  " + Arrays.toString(a1));
        System.out.println("Output: " + Arrays.toString(transformArray(a1)));
        System.out.println("Expected: [3, 6, 9, 12, 9]");
        System.out.println();

        // Test case 2
        int[] a2 = {5};
        System.out.println("Input:  " + Arrays.toString(a2));
        System.out.println("Output: " + Arrays.toString(transformArray(a2)));
        System.out.println("Expected: [5]");
        System.out.println();

        // Test case 3
        int[] a3 = {2, -1, 4};
        System.out.println("Input:  " + Arrays.toString(a3));
        System.out.println("Output: " + Arrays.toString(transformArray(a3)));
        System.out.println("Expected: [1, 5, 3]");
        System.out.println();

        // Test case 4 (empty array)
        int[] a4 = {};
        System.out.println("Input:  " + Arrays.toString(a4));
        System.out.println("Output: " + Arrays.toString(transformArray(a4)));
        System.out.println("Expected: []");
    }
}