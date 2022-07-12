package uk.ac.rhul.cs2800;


import java.util.Scanner;


public class RevPolishCalc implements Calculator {

  /**
   * Evaluate an expression in Reverse Polish Notation.
   * 
   * @param str the expression as a string
   */
  public float evaluate(String str) throws InvalidExpressionException {
    Scanner exp = new Scanner(str);
    StrStack st = new StrStack();
    NumStack ns = new NumStack();
    String ops = "+-*/"; 
    
    while (exp.hasNext()) {                
      st.push(exp.next());            
    }
    exp.close();
    
    while (!st.isEmpty()) {
      String current = st.pop();
      if (!ops.contains(current)) {
        ns.push(Float.parseFloat(current));
      } else {  
        float x = Float.parseFloat(st.pop());
        float y = Float.parseFloat(st.pop());
        int pstn = ops.indexOf(current);
        ns.push(chooseOperation(pstn, x, y));  
      }
    }
    return ns.pop();
  }
  
  /**
   * Choose operation result to push to stack, shorten evaluate method.
   * 
   * @param pstn position
   * @param x first number
   * @param y second number
   */
  private float chooseOperation(int pstn, float x, float y) {
    switch (pstn) {
      case 0:
        return (x + y); 
      case 1:
        return (x - y); 
      case 2:
        return (x * y); 
      case 3:
        if (x != 0) {
          return (y / x); 
        }
      default:
        throw new InvalidExpressionException();
    }
  }
}


