package app.tests;

import junit.extensions.TestSetup;
import junit.framework.TestCase;

import app.src.calculator.*;

public class FLAMESCalculatorTest extends TestCase{

  FLAMESCalculator calculator;

  public void setUp(){
    calculator = new FLAMESCalculator();
  }

  public void testOutputFRIENDSHIPIsValid(){
    String name1 = "asd";
    String name2 = "abcd";    
    String result =  calculator.calculateCompatibility(name1, name2);
    assertEquals("FRIENDSHIP", result);
  }
  
  public void testComputeLOVEIsValid(){
    String name1 = "MATT";
    String name2 = "DENISE";    
    String result =  calculator.calculateCompatibility(name1, name2);
    assertEquals("LOVE", result);
  }

  public void testComputeAFFECTIONIsValid(){
    String name1 = "gwen";
    String name2 = "cjay";    
    String result =  calculator.calculateCompatibility(name1, name2);
    assertEquals("AFFECTION", result);
  }

  public void testComputeMARRIAGEIsValid(){
    String name1 = "SHILPA";
    String name2 = "AMIR";
    String result =  calculator.calculateCompatibility(name1, name2);
    assertEquals("MARRIAGE", result);
  }

  public void testComputeENEMYIsValid(){
    String name1 = "Cjay Billones";
    String name2 = "Alwin de Leon";
    String result =  calculator.calculateCompatibility(name1,name2);
    assertEquals("ENEMY", result);
  }

  public void testComputeSIBLINGIsValid(){
    String name1 = "oomagulaa walang sibling";
    String name2 = "yehey";
    String result =  calculator.calculateCompatibility(name1, name2);
    assertEquals("SIBLING", result);
  }

  public void testNameWithProperSuffixIsValid(){
    String name1 = "Ciprian Jr.";
    String name2 = "Cjay";
    String result =  calculator.calculateCompatibility(name1, name2);
    assertEquals("ENEMY", result);
  }  

  public void testComputeSameNameIsFRIENDSHIP(){
    String name1 = "Cjay";
    String name2 = "Cjay";
    String result = calculator.calculateCompatibility(name1, name2);
    assertEquals("FRIENDSHIP", result);
  }

}