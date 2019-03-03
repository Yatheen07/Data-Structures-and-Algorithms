import java.util.*;

class Solution{
  static boolean checkPangram(String input){
    boolean isPangram = true;
    boolean[] characters = new boolean[26];
    int index = 0;
    for(char c : input.toCharArray()){
      index = c -'a';
      //System.out.println(c+": "+index+" ");
      characters[index] = true;
    }
    for(boolean b:characters){
      if(!b){
        isPangram = false;
      }
    }
    if(!isPangram){
      displayMissingLetters(characters);
    }
    return isPangram;
  }
  static void displayMissingLetters(boolean[] characters){
    System.out.println("Missing Letters: ");
    for(int i=0;i<characters.length;i++){
      if(!characters[i]){
        System.out.print((char)(i+'a')+" ");
      }
    }
    System.out.println();
  }
  public static void main(String ar[]){
    String a = "The yatheen brown fox jumps over the lazy dog";
    System.out.println("Input: "+a);
    System.out.println(checkPangram(a.replaceAll("\\s","").toLowerCase()));
  }
}
