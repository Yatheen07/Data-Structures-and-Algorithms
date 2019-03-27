import java.util.*;

class Solution{



  public static int solveKnapsack(int[] weights,int[] values,int totalWeight){
    int[][] table = new int[weights.length + 1][totalWeight + 1];

    for(int i = 0 ; i <= weights.length;i++){
      for(int j=0;j<=totalWeight;j++){
        if(i==0||j==0){
          table[i][j] = 0;
        }
        else{
          int availableWeight = j - weights[i-1];
          if(availableWeight < 0){
            table[i][j] = table[i-1][j];
          }
          else{
            table[i][j] = Math.max(values[i-1] + table[i-1][availableWeight], table[i-1][j]);
          }
        }
      }
    }

    printMatrix(table,weights.length+1,totalWeight+1);
    return table[weights.length][totalWeight];

  }

  public static void printMatrix(int[][] arr,int row,int col){
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  public static void main(String ar[]){
    int[] weights = new int[]{1,3,4,5};
    int[] values = new int[]{1,4,5,7};
    int totalWeight = 7;
    int maxValue = solveKnapsack(weights,values,totalWeight);
    System.out.println("Max value is: "+maxValue);

  }
}
