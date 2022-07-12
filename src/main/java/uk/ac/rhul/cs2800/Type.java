package uk.ac.rhul.cs2800;

public enum Type {
  NUMBER("Float"), SYMBOL("Symbol"), STRING("String"), INVALID("An invalid type");

  String description;
  
  Type(String desc) {
    description = desc;
  }
  
  public String toString() {
    return description;
  }
}