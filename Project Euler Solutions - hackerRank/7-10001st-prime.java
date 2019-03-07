import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    static int getNthPrime(int n){
        boolean[] primes = new boolean[105004];
        for(int i=2;i<105003;i++)
            primes[i] = true;
        for(int p = 2; p*p <=105003; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(primes[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= 105003; i += p)
                    primes[i] = false;
            }
        }
        //System.out.println(Arrays.toString(primes));
        int index = 0;
        for(int i=2;i<primes.length;i++){
            if(primes[i]){
                index++;
            }
            if(index == n)  return i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(getNthPrime(n));
        }
    }
}
