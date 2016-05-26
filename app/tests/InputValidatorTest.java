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

  public void testBothBlankNamesInvalid(){
    String name1 = "";
    String name2 = "";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testBlankFirstNameInvalid(){
    String name1 = "";
    String name2 = "Cjay";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testBlankSecondNameInvalid(){
    String name1 = "Alwin";
    String name2 = "";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testNameWithNumberInvalid(){
    String name1 = "Cjay08";
    String name2 = "Alwin";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testNameWithSpecialCharacterInvalid(){
    String name1 = "@lwin";
    String name2 = "!#*&$#^%";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testNameWithJrSuffixValid(){
    String name1 = "Ciprian Billones Jr.";
    String name2 = "Alwin";
    boolean result = validator.validateNames(name1, name2);
    assertTrue(result);
  }

  public void testNameWithSrSuffixValid(){
    String name1 = "Alwin de Leon Sr.";
    String name2 = "Cjay";
    boolean result = validator.validateNames(name1, name2);
    assertTrue(result);
  }

  public void testNameWithMiddleInitialInvalid(){
    String name1 = "Ciprian D. Billones Jr.";
    String name2 = "Alwin Your Heart";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testNameWithPeriodOnImproperSuffixInvalid(){
    String name1 = "Ciprian Billones.";
    String name2 = "Alwin";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testNameWithPrefixInvalid(){
    String name1 = "Dr. Prospero Naval Jr.";
    String name2 = "Artificial Intelligence";
    boolean result = validator.validateNames(name1, name2);
    assertFalse(result);
  }

  public void testNameWithTrailingWhiteSpaceValid(){
    String name1 = "          Alwin de Leon         ";
    String name2 = "Cjay";
    boolean result = validator.validateNames(name1, name2);
    assertTrue(result);
  }

}