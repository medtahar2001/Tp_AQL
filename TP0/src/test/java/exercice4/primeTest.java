package exercice4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class primeTest {

    @Test
    void isPrime() {
        assertEquals(true , prime.isPrime(13));
    }

    @Test
    void isNotPrime() {
        assertEquals(false , prime.isPrime(26));
    }


    @Test
    void isNotPrimeInférieurA2() {
        assertEquals(false , prime.isPrime(1));
    }


    @Test
    void numberTwoAndThreeTest() {
        assertEquals(true , prime.isPrime(2));
        assertEquals(true , prime.isPrime(3));
    }
}