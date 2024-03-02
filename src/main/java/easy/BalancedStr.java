package easy;

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


        //amittsangwan: Type You Code Here


        return true;
    }
}
