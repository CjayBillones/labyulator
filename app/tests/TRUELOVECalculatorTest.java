package app.tests;

import junit.extensions.TestSetup;
import junit.framework.TestCase;

import app.src.calculator.*;

public class TRUELOVECalculatorTest extends TestCase{

  TRUELOVECalculator calculator;

  public void setUp(){
    calculator = new TRUELOVECalculator();
  }

  public void testOption1(){
    boolean result = calculator.calculateCompatibility("Tom Thompson","Shelly Smith").equals("46");
    assertTrue(result);
  }

  public void testOption2(){
    boolean result = calculator.calculateCompatibility("MATT","DENISE").equals("42");
    assertTrue(result);
  }

  public void testOption3(){
    boolean result = calculator.calculateCompatibility("SHILPA","AMIR").equals("11");
    assertTrue(result);
  }
}