
package sportsfinderapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author up782738
 */
public class controllerTest {
    
    public controllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of controller method, of class controller.
     */
    @Test
    public void testController() {
        System.out.println("controller");
        controller.controller();
    }

    /**
     * Test of isAlpha method, of class controller.
     */
    @Test
    public void testIsAlpha() {
        System.out.println("isAlpha");
        String word = "Alpha";
        boolean expResult = true;
        boolean result = controller.isAlpha(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAlpha2() {
        System.out.println("isAlpha");
        String word = "12345";
        boolean expResult = false;
        boolean result = controller.isAlpha(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAlpha3() {
        System.out.println("isAlpha");
        String word = "letters12345";
        boolean expResult = false;
        boolean result = controller.isAlpha(word);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkLength method, of class controller.
     */
    @Test
    public void testCheckLength() {
        System.out.println("checkLength");
        String word = "test";
        boolean expResult = true;
        boolean result = controller.checkLength(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckLength2() {
        System.out.println("checkLength");
        String word = "";
        boolean expResult = false;
        boolean result = controller.checkLength(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckLength3() {
        System.out.println("checkLength");
        String word = "stringlongerthan20chars";
        boolean expResult = false;
        boolean result = controller.checkLength(word);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNumeric method, of class controller.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "12345";
        boolean expResult = true;
        boolean result = controller.isNumeric(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsNumeric2() {
        System.out.println("isNumeric");
        String str = "abcde";
        boolean expResult = false;
        boolean result = controller.isNumeric(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsNumeric3() {
        System.out.println("isNumeric");
        String str = "";
        boolean expResult = true;
        boolean result = controller.isNumeric(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of inputsValid method, of class controller.
     */
    @Test
    public void testInputsValid() {
        System.out.println("inputsValid");
        String userid = "username1";
        String fname = "alan";
        String lname = "smith";
        String password = "password";
        String age = "22";
        boolean expResult = true;
        boolean result = controller.inputsValid(userid, fname, lname, password, age);
        assertEquals(expResult, result);
    }
    
}
