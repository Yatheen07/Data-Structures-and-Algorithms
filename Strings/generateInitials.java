import java.util.*;
class Solution{
  static String generateInitials(String input){
    if(input.length() == 0){
      return "Empty String";
    }
    String[] values = input.split("\\s");
    char[] result = new char[values.length];
    int i = 0;
    for(String value : values){
      result[i++] = value.charAt(0);
    }
    return new String(result).toUpperCase();
  }
  public static void main(String ar[]){
    String[] inputs = new String[]{"Yatheendra Pravan kidambi murali",
                                   "Sucharita Yanamandra",
                                   "Sundar Pichai"};
    for(String input: inputs){
      System.out.println(input+" -> "+ generateInitials(input));
    }
  }
}
