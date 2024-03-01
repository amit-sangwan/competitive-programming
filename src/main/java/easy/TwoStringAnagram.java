package easy;

import java.util.Arrays;

/**
 * A class to determine whether two strings are anagrams of each other.
 */
public class TwoStringAnagram {

    /**
     * Main method to test the isAnagram function with sample inputs.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("abc", "bca")); // true
        System.out.println(isAnagram("abc", "ccb")); // false
        System.out.println(isAnagram("aaa", "aaab")); // false
    }

    /**
     * Checks if two strings are anagrams of each other.
     * @param str The first input string.
     * @param str1 The second input string.
     * @return true if the strings are anagrams, false otherwise.
     */
    public static boolean isAnagram(String str, String str1) {
        // Convert the strings to character arrays
        char[] strArr = str.toCharArray();
        char[] strArr2 = str1.toCharArray();

        // Sort the character arrays
        Arrays.sort(strArr);
        Arrays.sort(strArr2);

        // Check if the sorted arrays are equal
        return Arrays.equals(strArr2, strArr);
    }
}
