package app.tests;

import junit.extensions.TestSetup;
import junit.framework.TestCase;

import app.src.calculator.*;

public class TRUELOVECalculatorTest extends TestCase{

  TRUELOVECalculator calculator;

  public void setUp(){
    calculator = new TRUELOVECalculator();
  }

  public void testCorrectInput(){
    String name1 = "Tom Thompson";
    String name2 = "Shelly Smith";
    String result = calculator.calculateCompatibility(name1, name2);
    assertEquals("46", result);
  }

  public void testZeroPercentage(){
    String name1 = "max";
    String name2 = "aga";
    String result = calculator.calculateCompatibility(name1, name2);
    assertEquals("0", result);
  }

  public void testOver100Percent(){
    String name1 = "Hoooooodoooooor";
    String name2 = "Bran Stark";
    String result = calculator.calculateCompatibility(name1, name2);
    assertEquals("412", result);
  }

  public void testOver1000Percent(){
    String name1 = "Hoooodoooooorrrrrrrrrrr";
    String name2 = "Hoooold theee dooooooor";
    String result = calculator.calculateCompatibility(name1, name2);
    assertEquals("1625", result);
  }

}