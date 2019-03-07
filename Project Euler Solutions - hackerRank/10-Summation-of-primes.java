import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static long getPrimeSum(long n){
        boolean[] primes = new boolean[1000002];
        for(int i=2;i<1000000;i++)
            primes[i] = true;
        for(int p = 2; p*p <=1000000; p++)
        {
            if(primes[p] == true)
            {
                for(int i = p*p; i <= 1000000; i += p)
                    primes[i] = false;
            }
        }
        long sum = 0;
        int r = 0;
        while(true){
            if(r > n) return sum;
            if(primes[r]){
                sum+=r;
            }
            r++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(getPrimeSum(n));
        }
    }
}
