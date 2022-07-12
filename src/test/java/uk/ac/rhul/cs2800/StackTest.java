package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
  private Stack st;
  
  @BeforeEach
  public void setup() {
    //Added to avoid repeatedly declaring st.
    st = new Stack();
  }
  
  @Test
  void testStack() {
    /*
     * Test 1
     * To pass this test, the Stack class has been created.
     */
    assertNotNull(st, "Test if stack has been created.");
  }
  
  @Test
  void testSize() {
    /*
     * Test 2
     * To pass this test, the size method is written in the Stack class, it returns the size
     * of an ArrayList that is declared as an instance variable at the start of the class.
     * It is empty therefore using the size() method of ArrayList returns 0.
     */
    assertEquals(0, st.size(), "Test if a new instance of Stack has a size of zero.");
  }
  
  @Test
  void testPush() {
    /*
     * Test 3
     * To pass this test, the type of ArrayList declared at the start of the Stack class is changed
     * from ArrayList<Integer> to ArrayList<Entry>. Due to this, the class Entry had to be created.
     * A constructor has been added in the Entry class to accept a float parameter.
     */
    st.push(new Entry(3));
    assertEquals(1, st.size(), "Test whether push increases the size of a previously empty stack.");
  }
  
  @Test
  void testTop() {
    /*
     * Test 4
     * To pass this test, a top method is written in the Stack class that returns the most recently 
     * added element.
     * The getter method getValue has been added to the Entry class to return a float value.
     */
    st.push(new Entry(10)); 
    st.push(new Entry(12));
    assertEquals(12, st.top().getValue(), 
        "Test if top returns the item most recently pushed to the stack.");
  }
  
  @Test
  void testPopEmpty() {
    /*
     * Test 5
     * To pass this test, the method pop() is written in the Stack class, it throws an 
     * EmptyStackException if the stack is empty.
     * (The size of the ArrayList instance variable is tested with size())
     */
    assertThrows(EmptyStackException.class, () -> st.pop(), 
        "Ensure that attempting to pop from an empty stack throws an EmptyStackException.");
  }
 
  @Test
  void testPopOutput() {
    /*
     * Test 6
     * To pass this test an else block is added in pop() that returns the last added Entry.
     * For that to work, the return type of the method has been changed from void to Entry.
     */
    st.push(new Entry(4)); 
    st.push(new Entry(27));
    Entry test = st.pop();
    assertEquals(27, test.getValue(), 
        "Test whether pop returns the most recently removed element.");
  }
  
  @Test
  void testPopRemoval() {
    /*
     * Test 7
     * To pass this test, further code is added to the else block in the pop method to remove the
     * most recently pushed element.
     * A variable called last is created to "save" the last pushed Entry before removing it.
     * After it is removed from the ArrayList, the Entry last is returned.
     */
    st.push(new Entry(110)); 
    st.push(new Entry(95));
    st.pop();
    assertEquals(110, st.top().getValue(), "Test whether pop removes the specified element.");
  }
}
