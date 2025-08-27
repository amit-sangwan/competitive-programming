package easy;

/*
Problem Statement:

You are given a string s. You need to split it into the minimum possible number
of increasing substrings.

A substring is increasing if every next character is the next English letter in sequence.

Examples:
- "ABC" is increasing
- "XY" is increasing
- "AC" is NOT increasing (C is not the next of A)

The split must minimize the number of substrings.
Return the substrings as an array.

Example:
Input:  s = "ABCDEFFDEfghCBA"
Output: ["ABCDEF", "F", "DE", "fgh", "C", "B", "A"]
*/

import java.util.*;

public class PayPay2 {

    // Method to implement
    public static List<String> splitIncreasingSubstrings(String s) {
        List<String> res = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1) + 1 ){
                sb.append(s.charAt(i));
                continue;
            }
            res.add(sb.toString());
            sb.setLength(0);
            sb.append(s.charAt(i));
        }
        res.add(sb.toString());
        return res; // placeholder
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "ABCDEFFDEfghCBA";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + splitIncreasingSubstrings(s1));
        System.out.println("Expected: [ABCDEF, F, DE, fgh, C, B, A]");
        System.out.println();

        // Test case 2
        String s2 = "ABC";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + splitIncreasingSubstrings(s2));
        System.out.println("Expected: [ABC]");
        System.out.println();

        // Test case 3
        String s3 = "AC";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + splitIncreasingSubstrings(s3));
        System.out.println("Expected: [A, C]");
        System.out.println();

        // Test case 4
        String s4 = "XYZAB";
        System.out.println("Input: " + s4);
        System.out.println("Output: " + splitIncreasingSubstrings(s4));
        System.out.println("Expected: [XYZ, AB]");
    }
}
