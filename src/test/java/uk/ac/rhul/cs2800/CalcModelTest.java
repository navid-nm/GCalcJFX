package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcModelTest {
  private CalcModel cm;
  
  @BeforeEach
  void setup() {
    cm = new CalcModel();
  }
  
  @Test
  void testCalcModel() {
    /*
     * Test 1
     * To pass this test, the CalcModel class is created.
     */
    assertNotNull(cm, "Ensuring a CalcModel object can be created.");
  }
  
  @Test
  void testEvaluate() {
    /*
     * Test 2
     * To pass this test, the evaluate method is created.
     * It is written to take two arguments indicating the expression and notation.
     */
    assertEquals((float) 2.5, cm.evaluate("5 2 /", true));
  }

}
