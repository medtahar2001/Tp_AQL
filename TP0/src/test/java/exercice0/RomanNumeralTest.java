package exercice0;

import exercice0.RomanNumeral;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class RomanNumeralTest {

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VI");

        Assertions.assertEquals(6, result);
    }
}