package app.tests;

import junit.extensions.TestSetup;
import junit.framework.TestCase;

import app.src.calculator.*;

public class FLAMESCalculatorTest extends TestCase{

  FLAMESCalculator calculator;

  public void setUp(){
    calculator = new FLAMESCalculator();
  }

  public void testOption1IsFRIENDSHIP(){
    boolean result =  calculator.calculateCompatibility("asd","abcd").equals("FRIENDSHIP");
    assertTrue(result);
  }
  
  public void testOption2IsLOVE(){
    boolean result =  calculator.calculateCompatibility("MATT","DENISE").equals("LOVE");
    assertTrue(result);
  }

  public void testOption3IsAFFECTION(){
    boolean result =  calculator.calculateCompatibility("gwen","cjay").equals("AFFECTION");
    assertTrue(result);
  }

  public void testOption4IsMARRIAGE(){
    boolean result =  calculator.calculateCompatibility("SHILPA","AMIR").equals("MARRIAGE");
    assertTrue(result);
  }

  public void testOption5IsENEMY(){
    boolean result =  calculator.calculateCompatibility("Cjay Billones","Alwin de Leon").equals("ENEMY");
    assertTrue(result);
  }

  public void testOption6IsSIBLING(){
    boolean result =  calculator.calculateCompatibility("putangina walang sibling","yehey").equals("SIBLING");
    assertTrue(result);
  }
  
}