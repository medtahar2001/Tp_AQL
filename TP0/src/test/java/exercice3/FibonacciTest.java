package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciIsNegative() {
        int n=-3;
        assertThrows(IllegalArgumentException.class,()->Fibonacci.fibonacci(n));
    }
    @Test
    void fibonacciIsZero()
    {
        assertEquals(0,Fibonacci.fibonacci(0));
    }
    @Test
    void fibonacciIsOne()
    {
        assertEquals(1,Fibonacci.fibonacci(1));

    }
     @Test
    void fibonacciIsPositve()
     {
         assertEquals(1,Fibonacci.fibonacci(1));
     }
}