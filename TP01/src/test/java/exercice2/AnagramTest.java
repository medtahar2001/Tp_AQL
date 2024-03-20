package exercice2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagramNull() {
        assertThrows(NullPointerException.class,() ->{Anagram.isAnagram(null,null);});

    }
}