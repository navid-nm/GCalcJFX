package uk.ac.rhul.cs2800;

@SuppressWarnings("serial")
public class InvalidExpressionException extends IllegalArgumentException {
  public InvalidExpressionException() {
    super("Invalid Expression.");
  }
}
