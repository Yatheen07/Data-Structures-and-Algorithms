import java.util.*;

class Solution{
  static boolean isValidValue(int value){
    if(!(value >=0 && value <=255)){
      return false;
    }
    return true;
  }

  static boolean isValidIp(String input){
    boolean isValid = true;
    String[] values = input.split("\\.");
    if(values.length != 4){
      return false;
    }

    for(String a: values){
      try{
        if(!isValidValue(Integer.parseInt(a))){
          return false;
        }
      }
      catch(Exception e){
        return false;
      }
    }
    return isValid;
  }

  public static void main(String a[]){

    String[] inputs = new String[]{"128.0.0.1",
                                   "125.16.100.1",
                                   "5555.123.123.123.123.555",
                                   "125.512.100.abc"};
    for(String input: inputs){
      System.out.println(input+"->"+isValidIp(input));
    }
  }
}
