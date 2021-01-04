import java.util.*;

class Solution{
  public static void main(String ar[]){
    int rows = 5,cols = 7;
    String[][] arr = new String[rows+1][cols+1];

    for(int i = 0;i<=rows;i++){
      for(int j=0;j<=cols;j++){
        arr[i][j] = i+""+j;
      }
    }

    for(int i = 0;i<=rows;i++){
      for(int j=0;j<=cols;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

  }
}
