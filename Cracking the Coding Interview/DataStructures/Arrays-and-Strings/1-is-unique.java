import java.util.*;

class Solution{

  public static boolean isUnique(String in){
    int length = in.length();
    boolean result = (length == 0) ? false : true;
    if(result){
      HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      for(char c: in.toCharArray()){
        if(map.containsKey(c)){
          return !(result);
        }
        else{
          map.put(c,1);
        }
      }
    }
    return result;
  }

  public static boolean isUnique_NoAdditional_DS(char[] in){
    Arrays.sort(in);
    for(int i=1;i<in.length-1;i+=2){
      if(in[i-1] == in[i] || in[i+1] == in[i]){
        return false;
      }
    }
    return true;
  }

  public static void main(String ar[]){
    String input = "Yathen";
    input = input.replaceAll("\\s","");
    System.out.println(isUnique_NoAdditional_DS(input.toCharArray()));
  }
}
