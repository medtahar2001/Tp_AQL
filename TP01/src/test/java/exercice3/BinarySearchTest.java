package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearchNull() {
        assertThrows(NullPointerException.class, ()-> {BinarySearch.binarySearch(null,2);});
    }
@Test
    void binarySearchElementExiste(){
        int [] A = {1,5,8,18,23};
        assertEquals(4,BinarySearch.binarySearch(A,23));
    }
@Test
    void binarySearchElementNotExiste(){
        int [] A = {1,5,8,18,23};
        assertEquals(-1,BinarySearch.binarySearch(A,7));
    }

}