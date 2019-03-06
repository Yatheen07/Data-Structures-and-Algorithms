import java.util.*;

class Solution{
  static int[] getOrdinal(String str){
        int[] values = new int[str.length()];
        for(int i=0;i<str.length();i++){
            values[i] = (int) str.charAt(i);
        }
        return values;
    }

    static String getDiffrence(int[] arr1,int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]) return "Not Funny";
        }
        return "Funny";
    }

    static int[] getAbsDiffrence(int[] arr){
        int[] result = new int[arr.length - 1];
        for(int i=0;i<arr.length - 1;i++){
            result[i] = Math.abs(arr[i+1] - arr[i]);
        }
        return result;
    }

    // Complete the funnyString function below.
    static String isFunnyString(String s) {
        int[] ordinalValues1 = getOrdinal(s);
        int[] ordinalValues2 = getOrdinal(new StringBuffer(s).reverse().toString());
        int[] abs1 = getAbsDiffrence(ordinalValues1);
        int[] abs2 = getAbsDiffrence(ordinalValues2);
        return getDiffrence(abs1,abs2);
    }

    public static void main(String ar[]){
      Scanner scan = new Scanner(System.in);
      while(true){
        String in = scan.next();
        if(in.equals("break"))  break;
        System.out.println("Result: "+isFunnyString(in));        
      }
    }

}
