package uk.ac.rhul.cs2800;


import java.util.EmptyStackException;


public class StrStack {
  
  private Stack stack = new Stack();
  
  /**
   * Push a new string to the top of the stack.
   * 
   * @param str string to be added to the stack
   */
  public void push(String str) {
    stack.push(new Entry(str));
  }
  
  /**
   * Remove the last added string from the stack.
   * 
   * @return the last string that was added to the stack
   */
  public String pop() {
    if (this.isEmpty() == true) {
      throw new EmptyStackException();
    } else {
      Entry ent = stack.pop();   
      return ent.getString();
    }
  }
  
  /**
   * Check whether the stack of strings is empty.
   * 
   * @return a boolean value that is true if the stack is empty and false if it is not
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}