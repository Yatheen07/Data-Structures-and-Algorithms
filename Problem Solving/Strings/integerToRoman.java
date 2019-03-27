import java.util.*;

class Solution{
  public static String[] romans = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
  public static int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};

  public static String integerToRoman(int value){
    if(value < 1 || value > 3999) return "Input a number between 1 and 3999";
    StringBuilder result = new StringBuilder();
    int index = 0;
    while(value > 0){
      if(value - values[index] >= 0){
        result.append(romans[index]);
        value-=values[index];
      }
      else{
        index++;
      }
    }
    return result.toString();
  }

  public static void main(String  ar[]){
      //Scanner scan = new Scanner(System.in);
      System.out.println(integerToRoman(2415));
  }
}
