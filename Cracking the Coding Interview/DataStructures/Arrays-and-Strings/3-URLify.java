import java.util.*;

class Solution{

  //Implementation without String replace
  public static String Urlify(String in){
    int counter = 0;
    for(char c: in.toCharArray()){
      if(Character.isWhitespace(c))  counter++;
    }
    int newLength = in.length() + counter*2;
    char[] result = new char[newLength];
    int index=0;
    for(char c: in.toCharArray()){
      if(Character.isWhitespace(c)){
        result[index++] = '%';
        result[index++] = '2';
        result[index++] = '0';
      }
      else{
        result[index++] = c;
      }
    }
    return String.valueOf(result);
  }

  public static String urlify(String in){
    return in.trim().replaceAll("\\s","%20");
  }

  public static void main(String ar[]){
    String input = "Mr John Smith    ";

    //Implementation without replaceAll function
    long startTime = System.currentTimeMillis();
    System.out.println(Urlify(input.trim()));
    long endTime1 = System.currentTimeMillis();
    System.out.println("Method executed in: "+ (endTime1 - startTime)+ "ms\n");

    //Implementation using replaceAll function
    long startTime2 = System.currentTimeMillis();
    System.out.println(urlify(input));
    long endTime2 = System.currentTimeMillis();
    System.out.println("Method executed in: "+ (endTime2 - startTime2)+ "ms\n");

  }

}
