import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> socksPair = new HashMap<Integer,Integer>();
        for(int i : ar){
            if(socksPair.containsKey(i)){
                socksPair.put(i,socksPair.get(i) + 1);
            }
            else{
                socksPair.put(i,1);
            }
        }
        int result = 0;
        int value = 0;

        for(Map.Entry<Integer,Integer> item : socksPair.entrySet()){
            value = item.getValue();
            if(value < 2){
                continue;
            }
            result+=(value / 2);
        }

        return result;
    }



    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<array.length;i++){
          array[i] = scan.nextInt();
        }
        System.out.println("Number of available pairs: "+sockMerchant(size,array));
    }
}
