import java.util.*;

class Solution{

  public static String urlify(String in){
    return in.trim().replaceAll("\\s","%20");
  }
  public static void main(String ar[]){
    String input = "Mr John Smith    ";
    System.out.println(urlify(input));
  }
}
