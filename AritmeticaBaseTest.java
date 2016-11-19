import static org.junit.Assert.*;

import org.junit.Test;

public class AritmeticaBaseTest {

	 @Test
	    
     public void testSuma1(){
    
    int number1 = 6;
    int number2 = 2;
    AritmeticaBase arit = new AritmeticaBase();
    double expResult = 3;
    double result = arit.divisionEnteros(number1, number2);
    assertEquals(expResult, result, 0.0);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
     }
      @Test

     public void testSuma2(){
    
    int number1 = 6;
    int number2 = 1;
    AritmeticaBase arit = new AritmeticaBase();
    double expResult = number1;
    double result = arit.divisionEnteros(number1, number2);
    assertEquals(expResult, result, 0.0);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
     }
      @Test

     public void testSuma3(){
    
    int number1 = -6;
    int number2 = 2;
    AritmeticaBase arit = new AritmeticaBase();
    double expResult = -3;
    double result = arit.divisionEnteros(number1, number2);
    assertEquals(expResult, result, 0.0);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
     }
     public void testSuma4(){
    
    int number1 = 6;
    int number2 = -2;
    AritmeticaBase arit = new AritmeticaBase();
    double expResult = -3;
    double result = arit.divisionEnteros(number1, number2);
    assertEquals(expResult, result, 0.0);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
     }
     public void testSuma5(){
    
    int number1 = -6;
    int number2 = -2;
    AritmeticaBase arit = new AritmeticaBase();
    double expResult = 3;
    double result = arit.divisionEnteros(number1, number2);
    assertEquals(expResult, result, 0.0);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
     }
public void testSuma6(){
    
    int number1 = 6;
    int number2 = 0;
    AritmeticaBase arit = new AritmeticaBase();
    double expResult = number1/number2;
    double result = arit.divisionEnteros(number1, number2);
    fail("se esperaba excepcion ArithmeticException");
    assertEquals(expResult, result, 0.0);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype."); 
     }

}
