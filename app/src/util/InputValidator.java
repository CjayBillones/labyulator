package app.src.util;

public class InputValidator{

  private final String REGEX = "^[A-Za-z ]+((JR|Jr|jR|jr|SR|Sr|sR|sr)\\.?)?$";
  private static InputValidator instance = new InputValidator();

  public static InputValidator getInstance(){
    return instance;
  }

  public boolean validateOption(int option){
    return (option >= 1 && option <=3);
  }

  public boolean validateNames(String name1, String name2){
    return (name1.matches(REGEX) && name2.matches(REGEX));
  }
}