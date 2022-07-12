package uk.ac.rhul.cs2800;


import java.util.EmptyStackException;


public class NumStack {
  
  private Stack stack = new Stack();
  
  /**
   * Push a new number to the top of the stack.
   * 
   * @param i value to be added to the stack
   */
  public void push(float i) {
    stack.push(new Entry(i));
  }
  
  /**
   * Remove the last added number from the stack.
   * 
   * @return the last added number to the stack
   */
  public float pop() {
    if (this.isEmpty() == true) {
      throw new EmptyStackException();
    } else {
      Entry ent = stack.pop();   
      return ent.getValue();
    }
  }
  
  /**
   * Check whether the stack is empty.
   * 
   * @return boolean value that is true if the stack is empty and false if it is not
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}