package exercice6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzWithException() {
        assertThrows(IllegalArgumentException.class , ()->FizzBuzz.fizzBuzz(0));
    }
    @Test
    void fizzBuzzWithFizzBuzz() {
       assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }
    @Test
    void fizzBuzzWithFizz() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(12));
    }
    @Test
    void fizzBuzzWithBuzz() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }
    @Test
    void fizzBuzzWithNumber(){
        assertEquals("4",FizzBuzz.fizzBuzz(4));
    }
}