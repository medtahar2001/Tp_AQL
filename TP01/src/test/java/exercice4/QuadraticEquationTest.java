package exercice4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void solveAEgaleZero() {
        assertThrows(IllegalArgumentException.class , () -> {
            QuadraticEquation.solve(0,3,5);
        });
    }
    @Test
    void solveNoSolution(){
        assertNull(QuadraticEquation.solve(1,2,3));
    }

    @Test
    void solveOneSolution(){
        assertArrayEquals(new double[] {-1.0},QuadraticEquation.solve(1,2,1));
    }
    @Test
    void solveTwoSolution(){
        assertArrayEquals(new double[] {-1.0,-2.0},QuadraticEquation.solve(1,3,2));
    }
}