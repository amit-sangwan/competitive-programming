package easy;

import java.util.Stack;

public class BalancedStr {
    public static void main(String[] args) {
        System.out.println(isBalanced("[{()}]")); // true
        System.out.println(isBalanced("[({(})]")); // false
        System.out.println(isBalanced("{[}")); // false
        System.out.println(isBalanced("({}{}([{}]))")); // true
        System.out.println(isBalanced("({")); // false
    }

    public static boolean isBalanced(String str) {

        return true ;
    }
}
