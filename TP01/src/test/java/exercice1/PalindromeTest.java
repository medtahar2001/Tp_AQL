package exercice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("tahat"));
    }
    @Test
    void isNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("taher"));
    }
    @Test
    void StringNull(){
        assertThrows(NullPointerException.class , () -> {Palindrome.isPalindrome(null);});


    }
}