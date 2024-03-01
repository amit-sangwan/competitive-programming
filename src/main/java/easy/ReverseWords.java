package easy;

public class ReverseWords {
    public static void main(String[] args) {
        // Test cases for reverse words function
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }

    // Function to reverse the words in a string
    public static String revWords(String str) {
        // Split the input string into an array of words
        String[] strArr = str.split(" ");

        // Create a StringBuilder object to store the reversed words
        StringBuilder sb = new StringBuilder();

        // Traverse the array of words from the end to the beginning
        for (int i = strArr.length - 1; i >= 0; i--) {
            // Append each word to the StringBuilder object followed by a space
            sb.append(strArr[i]).append(" ");
        }

        // Convert the StringBuilder object to a string and return
        return sb.toString().trim(); // Trim any extra spaces at the end
    }
}
