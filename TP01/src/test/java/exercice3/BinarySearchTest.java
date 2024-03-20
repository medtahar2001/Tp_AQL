package exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearchNull() {
        assertThrows(NullPointerException.class, ()-> {BinarySearch.binarySearch(null,2);});
    }


}