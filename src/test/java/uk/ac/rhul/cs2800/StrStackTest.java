package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrStackTest {
  private StrStack st;
  
  @BeforeEach
  public void setup() {
    st = new StrStack(); 
  }
  
  @Test
  void testStrStack() {
    /*
     * Test 1
     * To pass this test, the StrStack class is created.
     */
    assertNotNull(st, "Check whether instance of StrStack can be created.");
  }
  
  @Test
  void testPush() {
    /*
     * Test 2
     * To pass this test, the push() method is added.
     * This method pushes a new string to the stack.
     */
    st = new StrStack(); 
    st.push("asd");
    assertEquals(st.isEmpty(), false, "Ensure push() successfully pushes string to stack.");
  }
  
  @Test
  void testPop() {
    /*
     * Test 3
     * To pass this test, the pop() method is added.
     * The method removes the last added string from the stack and returns it.
     */
    st.push("ac");
    st.push("string");
    assertEquals("string", st.pop(), "Test if pop() returns the last added value (value 1)");
    assertEquals("ac", st.pop(), "Test if pop() returns the last added value (value 2)");
    assertTrue(st.isEmpty(), "Check if both values have been removed.");
    
  }

}
