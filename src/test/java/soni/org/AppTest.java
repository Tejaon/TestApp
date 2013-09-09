package org.soni.com;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
       // Test cases from Numerical to Roman
    public void testRomanNumeral1() {
         int num1=20, num2=1975;
         String exp1 ="XX", exp2="MCMLXXV";
         RomanNumeral1 Roman = new RomanNumeral1(num1);
         String act1=String.valueOf(Roman.toString());
         assertEquals("Expected Result", act1, exp1);
        System.out.println("Value=" +num1 + " -> " +act1);
         Roman = new RomanNumeral1(num2);
         String act2=String.valueOf(Roman.toString());
         assertEquals("Expected Result", act2, exp2);
        System.out.println("Value=" +num2 + " -> " +act2);
        }

    public void testRomanNumeral2() {
        // Test cases from Roman to Numerical
        String str1="MCMLXXV", str2="XX";
        String exp1 ="1975", exp2="20";
        RomanNumeral1 Roman = new RomanNumeral1(str1);
        String act1=String.valueOf(Roman.toInt());
        assertEquals("Expected Result", act1, exp1);
        System.out.println("Value=" +str1 + " -> " +act1);
        Roman = new RomanNumeral1(str2);
        String act2=String.valueOf(Roman.toInt());
        assertEquals("Expected Result", act2, exp2);
        System.out.println("Value=" +str2 + " -> " +act2);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        for (int i = 1; i<3000;i++) {
            RomanNumeral1 Roman = new RomanNumeral1(i);
            String actual=String.valueOf(Roman.toString());
            System.out.println("Value=" +i + " -> " +actual);
    }
       return new TestSuite( AppTest.class );
    }
}
