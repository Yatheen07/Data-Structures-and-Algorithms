import java.util.*;
class Solution{

  static int getPairsCount(int[] arr,int len,int sum){
    int count = 0;
    //System.out.println("Here");
    int start = 0,end=len-1,currSum = 0;
    for(int i=0;i<len;i++){
      start = i;
      int k = end;
      currSum = 0;
      while(start != k){
        System.out.println(start+" "+k+" "+arr[start]+" + "+arr[k]);
        currSum = arr[start] + arr[k];
        if(currSum < sum){
          count+=k-start;
          break;
        }
        else{
          k--;

        }
      }
    }
    return count;
  }

  public static void main(String ar[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = scan.nextInt();
    System.out.println("Enter array elements:");
    int[] array = new int[n];
    for(int i=0;i<n;i++){
      array[i] = scan.nextInt();
    }
    System.out.println("Enter sum:");
    int requiredSum = scan.nextInt();
    int result = getPairsCount(array,n,requiredSum);
    System.out.println(result);
  }

}
