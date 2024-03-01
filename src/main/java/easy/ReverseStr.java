package easy;

public class ReverseStr {
    public static void main(String[] args) {
        // Test cases for reverse string function
        System.out.println(revStr("apple")); // elppa
        System.out.println(revStr("John")); // nhoJ
        System.out.println(revStr("phone")); // enohp
        System.out.println(revStr("1234567")); // 7654321
    }

    // Function to reverse a string
    public static String revStr(String str) {
        // Create a StringBuilder object to store the reversed string
        StringBuilder stringBuilder = new StringBuilder();

        // Convert the input string to a character array
        char[] arr = str.toCharArray();

        // Traverse the character array from the end to the beginning
        for (int i = arr.length - 1; i >= 0; i--) {
            // Append each character to the StringBuilder object
            stringBuilder.append(arr[i]);
        }

        // Convert the StringBuilder object to a string and return
        return stringBuilder.toString();
    }
}
