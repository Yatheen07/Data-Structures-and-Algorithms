import java.util.*;

class Solution{

  public static int getMaxSumSubsequence(int[] arr){
    int[] table = new int[arr.length];
    int index = 0;
    for(int i:arr){
      table[index++] = i;
    }
    int maxValue = Integer.MIN_VALUE;

    for(int i=1;i<arr.length;i++){
      for(int j=0;j<i;j++){
        if(arr[j] < arr[i]){
          table[i] = Math.max(table[i],(table[j]+arr[i]));
          maxValue = Math.max(table[i],maxValue);
        }
      }
    }

    return maxValue;
  }

  public static void main(String ar[]){
      int[] input = new int[]{4,6,1,3,8,4,6};
      int result = getMaxSumSubsequence(input);
      System.out.println("Max Sum: "+result);
  }
}
