package uk.ac.rhul.cs2800;


public class CalcFactory {
  
  /**
   * Retrieve the appropriate implementation of Calculator.
   * 
   * @param infix whether the expression is in infix or not
   */
  public Calculator getCalc(boolean infix) {
    if (infix) {
      return new StandardCalc();
    } 
    return new RevPolishCalc();
  }
}
