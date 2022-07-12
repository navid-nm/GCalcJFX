package uk.ac.rhul.cs2800;


/** 
 * Represents an object that can be pushed onto a stack.
 * 
 * @author NavidM
 */

public class Entry {
  float number;
  Symbol symbol;
  Type type;
  String str;
  
  /**
   * Entry constructor with a float parameter.
   * 
   * @param val the float value of the element
   */
  Entry(float val) {
    number = val;
    type = Type.NUMBER;
  }
  
  /**
   * Entry constructor with a Symbol parameter.
   * 
   * @param val the symbol value of the element
   */
  Entry(Symbol sym) {
    symbol = sym;
    type = Type.SYMBOL;
  }
  
  /**
   * Entry constructor with a String parameter.
   * 
   * @param st the string value of the element
   */
  Entry(String st) {
    str = st;
    type = Type.STRING;
  }
  
  /**
   * Get value of the string in the entry if the entry contains a string.
   * 
   * @return the string in the entry
   */
  public String getString() {
    if (type == Type.NUMBER || type == Type.SYMBOL) {
      throw new BadTypeException();
    } else {
      return str;
    }
  }
  
  /**
   * Get value of the symbol in the entry if that entry contains a symbol.
   * 
   * @return the symbol in the entry
   */
  public Symbol getSymbol() {
    if (type == Type.NUMBER || type == Type.STRING) {
      throw new BadTypeException();
    } else {
      return symbol;
    }
  }
  
  /**
   * Get value of the float in the entry if that entry contains a float.
   * 
   * @return the float in the entry
   */
  public float getValue() {
    if (type == Type.SYMBOL || type == Type.STRING) {
      throw new BadTypeException();
    } else {
      return number;
    }
  }
  
  /**
   * Get the type of value in the entry.
   * 
   * @return the type of value
   */
  public Type getType() {
    return type;
  }
  
  /**
   * Make the entry printable as a string.
   * 
   * @return a string that describes the type and value of the entry
   */
  public String toString() {
    String entstr = "Type: " + type.toString() + "\nValue: ";
    if (type == Type.NUMBER) {
      entstr += String.valueOf(number);
    } else {
      entstr += which.toString();
    }
    return entstr;
  }
  
  /**
   * Generate a hashcode for the entry object.
   * 
   * @return a hashcode
   */
  public int hashCode() {
    return this.type.hashCode() + this.hashCode();
  }
  
  /**
   * Determine whether the current entry object and another object are equal.
   * 
   * @return a boolean value that is true if this object and that object are equal
   */
  public boolean equals(Object obj) {
    if (obj instanceof Entry) {
      Entry entobj = (Entry) obj;
      if (this.toString() == entobj.toString()) {
        return true;
      }
    } 
    return false;
  }
}