package exercice5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void toRomanWithInZero() {
        assertThrows(IllegalArgumentException.class,() -> RomanNumeral.toRoman(0));
    }
    @Test
    void toRomanWithInSup3999() {
        assertThrows(IllegalArgumentException.class,() -> RomanNumeral.toRoman(4001));
    }
    @Test
    void toRomanWithTrue() {
      assertEquals("I",RomanNumeral.toRoman(1));
    }

}