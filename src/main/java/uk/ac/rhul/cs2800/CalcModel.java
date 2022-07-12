package uk.ac.rhul.cs2800;


public final class CalcModel {
  
  public final CalcFactory cf = new CalcFactory();
  
  /**
   * Evaluate an expression in either Reverse Polish or Infix notation.
   * 
   * @param exp the expression
   * @param infix whether the expression is in infix or not
   */
  public float evaluate(String exp, boolean infix) {
    Calculator calc = cf.getCalc(infix);
    return calc.evaluate(exp);
  } 

}
