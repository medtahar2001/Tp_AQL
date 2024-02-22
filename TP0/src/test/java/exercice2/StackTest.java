package exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
  private Stack s;

    @BeforeEach
    void SetUP(){
       s=new Stack();
    }
    @Test
    void pushshouldaddElementToTheTopOfStack() {
        s.push(1);
       assertEquals(1,s.size());
       assertEquals(1,s.peek());
    }
   @Test
   void pushshoulshouldExpandArrayIfStackIsFull() {
        for(int i=0;i<10;i++){
            s.push(i);
        }
        assertEquals(10,s.size());
        s.push(17);
        assertEquals(11,s.size());
        assertEquals(17,s.peek());

    }

    @Test
    void popRetrurnTheElement() {
        s.push(2);
        s.push(3);
        assertEquals(2,s.size());
        assertEquals(3,s.pop());
    }
    @Test
    void popAndThestackisempty()
    {
        assertThrows(IllegalStateException.class,() ->s.pop());
    }

    @Test
    void peekshouldreturnElementofthetopofStack() {
        s.push(2);
       int r= s.peek();
        assertEquals(1,s.size());
        assertEquals(2,r);
    }

   @Test
   void peekAndThestackisempty()
    {
        assertThrows(IllegalStateException.class,() ->s.peek());
    }

    @Test
    void isEmptyshouldReturnTrue() {
        boolean r=s.isEmpty();
        assertTrue(r);
    }
   @Test
   void isnotEmptyAndshouldReturnFalse() {
        s.push(25);
        boolean r=s.isEmpty();
        assertFalse(r);
    }

    @Test
    void size() {
        for(int i=0;i<5;i++){
            s.push(i);
        }
        assertEquals(5,s.size());
    }
}