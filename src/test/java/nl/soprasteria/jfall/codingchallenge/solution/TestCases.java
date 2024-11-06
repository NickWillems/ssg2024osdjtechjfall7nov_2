package nl.soprasteria.jfall.codingchallenge.solution;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestCases {
    @Test
    @DisplayName("Single character palindrome")
    public void testSingleCharacterIsPalindrome() {
        String output = TestUtil.runTest("a");
        assertEquals("YES", output);
    }

    @Test
    @DisplayName("Two different characters - non-palindrome")
    public void testTwoDifferentCharacters() {
        String output = TestUtil.runTest("ab");
        assertEquals("NO", output);
    }

    @Test
    @DisplayName("Simple palindrome")
    public void testSimplePalindrome() {
        String output = TestUtil.runTest("racecar");
        assertEquals("YES", output);
    }

    @Test
    @DisplayName("Non-palindrome with punctuation")
    public void testNonPalindromeString() {
        String output = TestUtil.runTest("Hello, World!");
        assertEquals("NO", output);
    }

    @Test
    @DisplayName("Only non-alphanumeric characters")
    public void testNonAlphanumericCharactersOnly() {
        String output = TestUtil.runTest("!@#");
        assertEquals("YES", output);
    }

    @Test
    @DisplayName("Palindrome with mixed case and spaces")
    public void testPalindromeWithSpacesAndMixedCase() {
        String output = TestUtil.runTest("No lemon, no melon");
        assertEquals("YES", output);
    }

    @Test
    @DisplayName("Palindrome with mixed case and punctuation")
    public void testPalindromeWithMixedCaseAndPunctuation() {
        String output = TestUtil.runTest("Was it a car or a cat I saw?");
        assertEquals("YES", output);
    }

    @Test
    @DisplayName("Palindrome with punctuation and spaces")
    public void testPalindromeWithPunctuationAndSpaces() {
        String output = TestUtil.runTest("A man, a plan, a canal, Panama");
        assertEquals("YES", output);
    }
}
