package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OpStackTest {
  private OpStack os;
  
  @BeforeEach
  public void setup() {
    os = new OpStack(); 
  }
  
  @Test
  void testOpStack() {
    /*
     * Test 1
     * To pass this test, the class OpStack is created.
     */
    assertNotNull(os, "Test whether instance of OpStack can be created.");
  }
  
  @Test
  void testIsEmpty() {
    /*
     * Test 2
     * To pass this test, the isEmpty() method is created.
     */
    assertTrue(os.isEmpty(), "Test whether isEmpty() works as intended.");
  }
  
  @Test
  void testPush() {
    /*
     * Test 3
     * To pass this test, the push() method is created.
     * It pushes a symbol to the stack.
     */
    os.push(Symbol.LEFT_BRACKET);
    assertFalse(os.isEmpty(), "Test whether value has been pushed to the stack.");
  }
  
  @Test
  void testPop() {
    /*
     * Test 4
     * To pass this test, the pop() method is created.
     * It removes the last added symbol from the stack.
     */
    os.push(Symbol.TIMES);
    assertEquals(Symbol.TIMES, os.pop(), "Test whether pop() returns the correct value.");
    assertTrue(os.isEmpty(), "Test if the last added element was indeed removed.");
  }

}
