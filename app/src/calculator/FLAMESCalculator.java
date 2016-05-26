package app.src.calculator;

import java.util.Map;
import java.util.HashMap;

public class FLAMESCalculator implements LoveCalculator{

  private static final Map<String , String> FLAMES = new HashMap<String , String>(){{
    put("F", "FRIENDSHIP");
    put("L", "LOVE");
    put("A", "AFFECTION");
    put("M", "MARRIAGE");
    put("E", "ENEMY");
    put("S", "SIBLING");
  }};

  public String calculateCompatibility(String name1, String name2){
    String flames = "FLAMES";
    int position = 0;
    int flamesCount = setFlamesCount(name1, name2);

    if(flamesCount > 0){
      return FLAMES.get(traverseFLAMES(flamesCount));
    }
    else
      return "FRIENDSHIP";
  }

  private String traverseFLAMES(int flamesCount){
    String flames = "FLAMES";
    int position = 0;
      while(flames.length() != 1){
        position += flamesCount - 1;
        position %= flames.length();
        flames = flames.replace(flames.charAt(position)+"", "");
      }
    return flames;
  }

  private String formatName(String name){
    return name.replaceAll("\\s+","").replace(".","").toLowerCase();
  }

  private int setFlamesCount(String name1, String name2){
    int flamesCount = 0;
      if(!name1.equalsIgnoreCase(name2))
        flamesCount = getFlamesCount(formatName(name1), formatName(name2));
    return flamesCount;
  }

  private int getFlamesCount(String name1, String name2){
    char nameArr[] = name1.toCharArray();
    for(char letter:nameArr){
      if(name2.indexOf(letter) >= 0){
        name1 = name1.replace(letter+"", "");
        name2 = name2.replaceAll(letter+"", "");
      }
    }
    return (name1.length() + name2.length());
  }
}