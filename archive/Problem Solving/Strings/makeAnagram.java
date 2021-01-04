import java.util.*;

class Solution{
  static int calculateDifference(int[] arr1,int[] arr2){
        /*if(arr1.length != arr2.length){
            return
        }*/
        int difference = 0;
        for(int i=0;i<26;i++){
            difference += Math.abs(arr1[i] - arr2[i]);
        }
        return difference;
    }

    static int[] getCharFreq(String in){
        int[] chars = new int[26];
        int offset = (int) 'a';
        for(int i = 0 ; i < in.length() ; i++){
            int c = in.charAt(i) - offset;
            chars[c]++;
        }
        return chars;
    }
    static int makeAnagram(String a, String b) {
        int[] charFreq1 = getCharFreq(a);
        int[] charFreq2 = getCharFreq(b);
        return calculateDifference(charFreq1,charFreq2);
    }

    public static void main(String ar[]){
      String a = "showman";
      String b= "woman";
      System.out.println("Input 1: "+a+"\n"+"Input 2: "+b);
      System.out.println("The number letters to be removed is: "+ makeAnagram(a,b));
    }
}
