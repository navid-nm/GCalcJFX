package uk.ac.rhul.cs2800;


public interface Calculator {
  
  public float evaluate(String exp) throws InvalidExpressionException;

}