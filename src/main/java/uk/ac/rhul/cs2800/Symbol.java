package uk.ac.rhul.cs2800;

public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("/"), 
  PLUS("+"), MINUS("-"), INVALID("?");
  
  String strval;
  
  Symbol(String str) {
    strval = str;
  }
  
  public String toString() {
    return strval;
  }
}