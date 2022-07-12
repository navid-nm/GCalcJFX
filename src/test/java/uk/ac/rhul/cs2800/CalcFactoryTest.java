package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcFactoryTest {
  private CalcFactory cf;
  
  @BeforeEach
  void setup() {
    cf = new CalcFactory();
  }
  
  @Test
  void testCalcFactory() {
    /*
     * Test 1
     * To pass this test, the class CalcFactory is created.
     */
    assertNotNull(cf, "Ensure CalcFactory can be instantiated.");
  }
  
  @Test
  void testEvaluate() {
    /*
     * Test 2
     * To pass this test, the evaluate method is written.
     * An if block is added to retrieve the relevant implementation of the Calculator interface.
     */
    assertEquals(new RevPolishCalc(), cf.getCalc(false));
  }

}
