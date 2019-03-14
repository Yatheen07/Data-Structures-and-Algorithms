import java.util.*;

class Solution {

    static long getEvenSum(long n){
        long sum = 2,a = 1,b = 2,c = 0;
        while(true){
            c = a + b;
            if(c >= n) break;
            if((c % 2) == 0)    sum+=c;
            a=b;
            b=c;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(getEvenSum(n));
        }
    }
}
