package exercice5;

import exercice3.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    void factorialIsNegative() {
        int n=-2;
        assertThrows(IllegalArgumentException.class,()-> Factorial.factorial(n));
    }
    @Test
    void factorialtest() {
        int n=3;
        assertEquals( 6,Factorial.factorial(n));
    }
}
