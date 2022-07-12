package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StandardCalcTest {
  private StandardCalc sc;
  
  @BeforeEach
  void setup() {
    sc = new StandardCalc();
  }
  
  @Test
  void testStandardCalc() {
    /*
     * Test 1
     * To pass this test, the StandardCalc class is created.
     */
    assertNotNull(sc, "Ensuring StandardCalc can be instantiated.");
  }
  
  @Test
  void testEvaluate() {
    /*
     * Test 2
     * To pass this test, the evaluate method should return the correct answer
     * for an infix expression.
     */
    assertEquals(sc.evaluate("1 + 1"), 2);
  }
  
}
