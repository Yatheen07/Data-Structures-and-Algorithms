import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {


    public static void rotateMatrix(int[] array,int d){
        int start;
        if(d < array.length){
            start = d;
        }
        else start = array.length - (array.length % d);

        StringBuffer result = new StringBuffer();

        for(int i=start;i<array.length;i++){
            result.append(array[i]+" ");
        }

        for(int i=0;i<start;i++){
            result.append(array[i]+" ");
        }
        System.out.println(result.toString().trim());
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        rotateMatrix(a,d);
        scanner.close();
    }
}
