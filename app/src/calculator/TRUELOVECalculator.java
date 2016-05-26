package app.src.calculator;

public class TRUELOVECalculator implements LoveCalculator{

  public String calculateCompatibility(String name1, String name2){
    int trueSum = count(name1.toLowerCase(), "true") + count(name2.toLowerCase(), "true");
    int loveSum = count(name1.toLowerCase(), "love") + count(name2.toLowerCase(), "love");
    String result = (trueSum == 0 && loveSum == 0) ? "0" : Integer.toString(trueSum) + Integer.toString(loveSum);

    return result + "%";
  }

  private int count(String name, String word){
    int count = 0;
    for(int i = 0; i < name.length(); i++){
      for(int j = 0; j < word.length(); j++){
        if(name.charAt(i) == word.charAt(j)){
          count++;
          break;
        }
      }
    }
    return count;
  }
}