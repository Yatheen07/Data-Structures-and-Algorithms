import java.util.*;

class Solution{

  static int getLongestIncreasingSubsequence(int[] array){
    int n = array.length,j,maxLength = Integer.MIN_VALUE;
    int[] result = new int[n];

    for(int i=0;i<n;i++){
      result[i] = 1;
    }
    System.out.println("Initial output: "+ Arrays.toString(result));
    for(int i=0;i<n;i++){
      for(j=0;j<=i;j++){
        if(array[j] < array[i]){
          result[i] = Math.max(result[i],result[j]+1);
          maxLength = Math.max(result[i],maxLength);
        }
      }
      System.out.println("Step "+(i+1)+" "+Arrays.toString(result));
    }
    if(maxLength < 0) return 1;
    else return maxLength;
  }

  public static void main(String ar[]){
    int[] array = new int[]{84, 80, 27 };
    int length = getLongestIncreasingSubsequence(array);
    System.out.println(length);
  }
}
