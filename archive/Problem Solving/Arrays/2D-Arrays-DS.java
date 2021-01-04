import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int maxSum = Integer.MIN_VALUE;
    static int width = 2;
    static int[][] arr = new int[6][6];

    static void getSum(int i,int j){
        int currSum = 0;
        for(int x=0;x<=width;x++){
            currSum += arr[i][j+x];
            currSum += arr[i+width][j+x];
        }
        currSum += arr[i+1][j+1];
        //System.out.println("*"+currSum);
        maxSum = Math.max(maxSum,currSum);
    }

    static int hourglassSum() {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                getSum(i,j);
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));



        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum();

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
