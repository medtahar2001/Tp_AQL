package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciIsNegative() {
        int n=-3;
        assertThrows(IllegalArgumentException.class,()->Fibonacci.fibonacci(n));
    }
}