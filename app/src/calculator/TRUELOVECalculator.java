package app.src.calculator;

public class TRUELOVECalculator implements LoveCalculator{

  public String calculateCompatibility(String name1, String name2){
    char[] trueArr ={'t', 'r', 'u', 'e' };
    char[] loveArr ={'l', 'o', 'v', 'e' };
    int trueSum = TRUELOVECalculator.getRepetitions(trueArr, name1, name2);
    int loveSum = TRUELOVECalculator.getRepetitions(loveArr, name1, name2);
    String result = Integer.toString(trueSum) + Integer.toString(loveSum);

    return result;
  }

  public static int getRepetitions( char[] arr, String name1, String name2){
    name1 = name1.toLowerCase();
    name2 = name2.toLowerCase();
    int sum = 0;
    int i ,j;
    for( i = 0; i < name1.length(); i++){
        for( j = 0 ; j < arr.length ; j++){
            if(name1.charAt(i) == arr[j]){
                sum++;
                break;
            }
        }
    }
    for( i = 0; i < name1.length(); i++){
        for( j = 0 ; j < arr.length ; j++){
            if(name2.charAt(i) == arr[j]){
                sum++;
                break;
            }
        }
    }
    return sum;
   }
}