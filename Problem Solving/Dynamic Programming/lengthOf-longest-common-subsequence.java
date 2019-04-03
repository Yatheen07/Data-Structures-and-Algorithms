import java.util.*;

class Solution{

  public static int getLengthofLongestSubsequence(String input1,String input2){
    int[][] table = new int[input1.length()+1][input2.length()+1];
    int maxLength = Integer.MIN_VALUE;

    for(int i=1;i<input1.length()+1;i++){
      for(int j=1;j<input2.length()+1;j++){
        if(i==0 || j==0){
          table[i][j] = 0;
        }
        else{
          if(input1.charAt(i-1) == input2.charAt(j-1)){
            table[i][j] = table[i-1][j-1] + 1;
          }
          else{
            table[i][j] = Math.max(table[i-1][j],table[i][j-1]);

          }
          maxLength = Math.max(maxLength,table[i][j]);
        }
      }
    }

    return maxLength;
  }

  public static void main(String ar[]){
    String input1 = "abcdaf";
    String input2 = "acbcf";

    System.out.println("Length of Longest Subsequnce: "+getLengthofLongestSubsequence(input1,input2));

  }
  
}
