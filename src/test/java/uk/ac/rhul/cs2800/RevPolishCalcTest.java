package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RevPolishCalcTest {
  private RevPolishCalc rpc;
  
  @BeforeEach
  void setup() {
    rpc = new RevPolishCalc();
  }
  
  @Test
  void testRevPolishCalc() {
    /*
     * Test 1
     * To pass this test the class RevPolishCalc is created.
     */
    assertNotNull(rpc);
  }
  
  @Test
  void testEvaluate() {
    /*
     * Test 2
     * To pass this test the evaluate method is created.
     * It uses an StrStack and NumStack.
     * The StrStack is for the purpose of holding the characters of the string.
     * NumStack serves the purpose of holding the float values and providing push/pop operations.
     */
    assertEquals(rpc.evaluate("5 2 +"), 7);
  }
  
  @Test
  void testEvaluateDivision() {
    /*
     * Test 3
     * To pass this test the evaluate method is adjusted to work with division. 
     * Before writing this test it erroneously returns 0.5 for 10 5 / for example.
     * The solution was to replace (x / y) with (y / x) in chooseOperation().
     * It previously returned the result for 5 divided by 10 as opposed to 10 divided by 5.
     */
    assertEquals(rpc.evaluate("10 5 /"), 2);
  }
  
  @Test
  void testDivideByZero() {
    /*
     * Test 4
     * To pass this test, code is added to check for division by zero.
     * An if block is added to the method chooseOperation.
     * If the second operand in division is 0, InvalidExpressionException is thrown.
     */
    assertThrows(InvalidExpressionException.class, () -> rpc.evaluate("41 0 /"));
  }

}
