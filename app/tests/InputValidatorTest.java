package app.tests;

import junit.extensions.TestSetup;
import junit.framework.TestCase;

import app.src.util.*;

public class InputValidatorTest extends TestCase{

  InputValidator validator;

  public void setUp(){
    validator = InputValidator.getInstance();
  }

  public void testOption1IsValid(){
    int option = 1;
    boolean result = validator.validateOption(1);
    assertTrue(result);
  }

  public void testOption2IsValid(){
    int option = 2;
    boolean result = validator.validateOption(2);
    assertTrue(result);
  }

  public void testOption3IsValid(){
    int option = 3;
    boolean result = validator.validateOption(option);
    assertTrue(result);
  }

  public void testOptionLessThan1IsInvalid(){
    int option = -1;
    boolean result = validator.validateOption(option);
    assertFalse(result);
  }

  public void testOptionGreaterThan3IsInvalid(){
    int option = 4;
    boolean result = validator.validateOption(option);
    assertFalse(result);
  }  

}