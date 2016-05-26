package app.src.calculator;

public class Context{

  private LoveCalculator loveCalculator;

  public Context(LoveCalculator loveCalculator){
    this.loveCalculator = loveCalculator;
  }

  public String executeLoveCalculator(String name1, String name2){
    return loveCalculator.calculateCompatibility(name1, name2);
  }

}