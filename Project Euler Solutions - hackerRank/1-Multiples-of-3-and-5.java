import java.util.*;
class Solution{
  public static void main(String ar[]){
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for(long a0 = 0; a0 < t; a0++){
          long n = in.nextInt() -1;
          long result = (n - (n%3)) * (n/3+1)/2 + (n - (n%5)) * (n/5+1)/2 - (n - (n%15)) * (n/15+1)/2;
          System.out.println(result);
      }
  }
  }
}
