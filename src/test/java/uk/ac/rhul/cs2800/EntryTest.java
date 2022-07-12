package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntryTest {
  private Entry ent;
  private Entry entstr;
  
  @BeforeEach
  public void setup() {
    //Added to avoid repeatedly declaring ent and entstr.
    ent = new Entry(100);       //Added on Test 1
    entstr = new Entry("abc");  //Added on Test 3
  }
  
  @Test
  void testEntry() {
    /*
     * Test 1
     * To pass this test, the Entry class has been created.
     * It consists of a public instance variable of type float, and a constructor that accepts
     * a float.
     */
    assertNotNull(ent, "Test if entry can be created.");
  }
  
  @Test
  void testGetValue() {
    /*
     * Test 2
     * To pass this test, the method getValue() is written. It returns the value of the float
     * that has been stored in the constructor.
     */
    assertEquals(100, ent.getValue(), "Test if getValue method returns the value of entry.");
  }
  
  @Test
  void testGetString() {
    /*
     * Test 3
     * To pass this test, the method getString() is written, a new constructor is added to the 
     * Entry class that accepts a String as a parameter. The method is written to return the 
     * String value of the Entry if its type is String. If it is not, the exception is thrown.
     */
    assertEquals("abc", entstr.getString(), 
        "Test if getString method returns the string value of entry.");
  }
  
  @Test
  void testWrongType() {
    /*
     * Test 4
     * To pass this test, an if-else block is added to getValue() to throw an exception if the 
     * type of Entry is not a float (as getValue can only return a float).
     */
    assertThrows(BadTypeException.class, () -> entstr.getValue(), 
        "Attempting to get the float value of an entry that is not a float causes an exception "
        + "to be thrown.");
  }
  
  @Test
  void testGetType() {
    /*
     * Test 5
     * To pass this test, the method getType() is written, the type instance variable is added
     * and the type values are set appropriately in the constructors of the Entry class.
     */
    assertEquals("String", entstr.getType().toString(), 
        "Test if the getType method of Entry works.");
  }
  
  @Test
  void testEntryPrint() {
    /*
     * Test 6
     * To pass this test, the toString() method is written, it creates a String that describes the 
     * type and value of the entry, and seperates both with a newline character for readability. 
     */
    assertEquals("Type: Float\nValue: 100.0", ent.toString(), 
        "Test whether the toString method of entry returns the correct value.");
  }
}
