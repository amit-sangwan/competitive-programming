package easy;

import java.util.Stack;

/**
 * Class to check if a string contains balanced parentheses, braces, and brackets.
 * Time complexity: O(n)
 * - n: length of the input string
 */
public class BalancedStr {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isBalanced("[{()}]"));      // true
        System.out.println(isBalanced("[({(})]"));     // false
        System.out.println(isBalanced("{[}"));         // false
        System.out.println(isBalanced("({}{}([{}]))"));// true
        System.out.println(isBalanced("({"));          // false
    }

    /**
     * Checks if the given string contains balanced parentheses, braces, and brackets.
     *
     * @param str The string to check.
     * @return True if the string is balanced, false otherwise.
     */
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // If the character is an opening parenthesis, brace, or bracket, push it onto the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                // If the stack is empty, there is no matching opening parenthesis, brace, or bracket
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top character from the stack and check if it matches the current closing character
                char close = stack.pop();

                // If there is no matching opening character for the current closing character, return false
                if (ch == '}' && close != '{') {
                    return false;
                } else if (ch == ']' && close != '[') {
                    return false;
                } else if (ch == ')' && close != '(') {
                    return false;
                }
            }
        }

        // If the stack is empty, all opening characters have been matched with closing characters
        // Otherwise, there are unmatched opening characters
        return stack.isEmpty();
    }
}
