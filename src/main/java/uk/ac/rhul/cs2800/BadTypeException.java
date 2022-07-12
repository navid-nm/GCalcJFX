package uk.ac.rhul.cs2800;

@SuppressWarnings("serial")
public class BadTypeException extends RuntimeException {
  public BadTypeException() {
    super("Bad Type.");
  }
}
