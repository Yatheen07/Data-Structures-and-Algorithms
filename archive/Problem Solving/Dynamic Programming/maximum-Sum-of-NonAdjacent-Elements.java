import java.util.*;

class Solution{
  public static void main(String ar[]){
    int[] arr = new  int[]{4,1,1,4,2,1};

    int incl = arr[0];
    int excl = 0;

    for(int i=1;i<arr.length;i++){
      int temp = incl;
      incl = Math.max((arr[i] + excl),incl);
      excl = temp;
    }

    System.out.println(incl);
  }
}
