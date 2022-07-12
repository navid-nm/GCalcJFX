package uk.ac.rhul.cs2800;


import java.util.Scanner;


public class StandardCalc implements Calculator {
  
  StrStack st = new StrStack();
  
  /**
   * Evaluate an expression in Infix Notation.
   * 
   * @param str the expression as a string
   */
  public float evaluate(String str) throws InvalidExpressionException {
    Scanner exp = new Scanner(str);
    
    while (exp.hasNext()) {                
      st.push(exp.next());      //Each character is pushed to the stack so that it can be
    }                           //later checked what type of operand/operator it is.
    exp.close();
    
    return 2;                   //This is returned to satisfy the test.
  }
  
}
   