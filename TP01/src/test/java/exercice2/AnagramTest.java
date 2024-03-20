package exercice2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagramNull() {
        assertThrows(NullPointerException.class,() ->{Anagram.isAnagram(null,null);});
    }
    @Test
    void isAnagramTrue(){
        assertTrue(Anagram.isAnagram("tahar","taahr"));
    }
   @Test
    void isAnagramFalseLongeurDiff(){
        assertFalse(Anagram.isAnagram("tahar","ahar"));
   }
   @Test
    void isAnagramFalseNonAnagram(){
        assertFalse(Anagram.isAnagram("tahar","haara"));
   }
}