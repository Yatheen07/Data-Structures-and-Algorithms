import java.util.Arrays;

class Solution{

  public static String sort(char[] input){
    Arrays.sort(input);
    return String.valueOf(input);
  }

  public static boolean isPermutationUsingSort(String str1,String str2){
      return sort(str1.toCharArray()).equals(sort(str2.toCharArray()));
  }

  public static boolean isPermuatation(String str1,String str2){
    int[] freq = new int[26];
    for(char c: str1.toCharArray()){
      int value = (int)(c - 'a');
      freq[value]++;
    }

    for(char c: str2.toCharArray()){
      int value = (int)(c - 'a');
      if(--freq[value] < 0) return false;
    }

    return true;
  }

  public static void main(String ar[]){
    String str1 = "yatheen";
    String str2 = "neethay";
    if(str1.length() != str2.length()){
      System.out.println("false");
    }
    else{
      System.out.println(isPermutationUsingSort(str1,str2));
      System.out.println(isPermuatation(str1,str2));
    }
  }
}
