import java.util.*;

class Solution{
  static boolean isValidValue(String temp){

    //length > 3 is false and if leading zeros false.
    if(temp.length() > 3 || (temp.indexOf("0") == 0) ){
      return false;
    }

    int value = Integer.parseInt(temp);
    // each value should be in range [0 - 255]
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

    for(String value: values){

      try{
        if(!isValidValue(value)){
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

    String[] inputs = new String[]{"128.0.0.01",
                                   "125.16.100.1",
                                   "5555.123.123.123.123.555",
                                   "125.512.100.abc",
                                   "abc.123.223.225",
                                   "0000.0000.0000.0000"
                                 };
    for(String input: inputs){
      System.out.println(input+"->"+isValidIp(input));
    }
  }
}
