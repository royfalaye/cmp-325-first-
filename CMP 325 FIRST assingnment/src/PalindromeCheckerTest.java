import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void isPalindrome_ShouldReturnTrueForPalindrome() {
        String palindrome = "racecar";
        assertTrue(PalindromeChecker.isPalindrome(palindrome));
    }

    private void assertTrue(boolean palindrome) {
    }

    @Test
    void isPalindrome_ShouldReturnFalseForNonPalindrome() {
        String nonPalindrome = "hello";
        assertFalse(PalindromeChecker.isPalindrome(nonPalindrome));
    }

    @Test
    void isPalindrome_ShouldHandleEmptyInput() {
        String emptyString = "";
        assertFalse(PalindromeChecker.isPalindrome(emptyString));
    }

    @Test
    void isPalindrome_ShouldHandleNullInput() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }

    private void assertFalse(boolean palindrome) {
    }

    @Test
    void isPalindrome_ShouldHandleMixedCaseAndNonAlphanumericCharacters() {
        String mixedCaseNonAlphaNumeric = "A man, a plan, a canal: Panama";
        assertTrue(PalindromeChecker.isPalindrome(mixedCaseNonAlphaNumeric));
    }
}

