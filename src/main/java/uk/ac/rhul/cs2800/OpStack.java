package uk.ac.rhul.cs2800;


import java.util.EmptyStackException;


public class OpStack {
  
  private Stack stack = new Stack();
  
  /**
   * Push a new symbol to the top of the stack.
   * 
   * @param i value to be added to the stack
   */
  public void push(Symbol i) {
    stack.push(new Entry(i));
  }
  
  /**
   * Remove the last added symbol from the stack.
   * 
   * @return the last added symbol to the stack
   */
  public Symbol pop() {
    if (this.isEmpty() == true) {
      throw new EmptyStackException();
    } else {
      Entry ent = stack.pop();   
      return ent.getSymbol();
    }
  }
  
  /**
   * Check whether the stack of symbols is empty.
   * 
   * @return a boolean value that is true if the stack is empty and false if it is not
   */
  public boolean isEmpty() {
    return stack.isEmpty();
  }
  
  /**
   * Retrieve the symbol from the top of the stack.
   * 
   * @return the symbol that was last added to the stack
   */
  public Symbol top() {
    return stack.top().getSymbol();
  }
}