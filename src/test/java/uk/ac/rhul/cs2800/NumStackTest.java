package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumStackTest {
  private NumStack ns;
  
  @BeforeEach
  public void setup() {
    ns = new NumStack();
  }
  
  @Test
  void testNumStack() {
    /*
     * Test 1
     * To pass this test, the NumStack class is created.
     */
    assertNotNull(ns, "Test if NumStack object can be created.");
  }
  
  @Test
  void testIsEmpty() {
    /*
     * Test 2
     * To pass this test, the method isEmpty() is written. 
     * It checks the size of the stack holding the numbers, if it is 0, isEmpty returns true.
     */
    assertEquals(true, ns.isEmpty(), "Test if isEmpty() returns the correct value.");  
  }
  
  @Test
  void testPush() {
    /*
     * Test 3
     * To pass this test, the push() method is added to NumStack.
     * isEmpty() should return false after pushing the item onto it.
     */
    ns.push(10);
    ns.push(14);
    assertEquals(false, ns.isEmpty(), "Test if push() has pushed to the stack successfully.");
  }
  
  @Test
  void testPop() {
    /*
     * Test 4
     * To pass this test, the pop() method is added.
     * It returns the value that was popped from the stack.
     */
    ns.push(12);
    assertEquals((float) 12, ns.pop(), "Test if pop() has removed from the stack successfully.");
  }
}
