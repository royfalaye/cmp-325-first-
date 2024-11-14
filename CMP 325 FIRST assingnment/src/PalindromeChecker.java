public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Convert to lowercase and remove non-alphanumeric characters
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Build the reversed version of the string manually
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character from the end
        }

        // Check if the original string is equal to the reversed string
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal, Panama";

        if (isPalindrome(testString)) {
            System.out.println("\"" + testString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + testString + "\" is not a palindrome.");
        }
    }
}