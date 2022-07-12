package uk.ac.rhul.cs2800;


import java.util.ArrayList;
import java.util.EmptyStackException;


/** 
 * Represents a stack that holds entries.
 * 
 * @author NavidM
 */

public class Stack {
  
  ArrayList<Entry> vals = new ArrayList<Entry>();

  /**
   * Determine whether or not the stack is empty.
   * 
   * @return a boolean value that is true if the stack is empty and false if it is not
   */
  public boolean isEmpty() {
    return vals.size() == 0;
  }
  
  /**
   * Push a new value to the top of the stack.
   * 
   * @param val the value to add to the stack
   */
  public void push(Entry val) {
    vals.add(val);
  }
  
  /**
   * Remove and return value from the top of the stack.
   *
   * @return the element that was removed from the stack
   */
  public Entry pop() {
    if (vals.isEmpty()) {
      throw new EmptyStackException();
    } else {
      Entry last = vals.get(vals.size() - 1); //Store the last entered entry before removing it   
      vals.remove(vals.size() - 1);           //so it can be returned at the end of the method.
      return last;
    }
  }
  
  /**
   * Get the element that was most recently pushed onto the stack.
   * 
   * @return the element that was last pushed onto the stack
   */
  public Entry top() {
    return vals.get(vals.size() - 1);
  }
  
  /**
   * Find the number of elements that are in the stack.
   * 
   * @return the number of elements in the stack
   */
  public int size() {
    return vals.size();
  } 
}
