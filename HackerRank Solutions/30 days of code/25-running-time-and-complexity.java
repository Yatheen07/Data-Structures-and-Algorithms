import java.io.*;
import java.util.*;

public class Solution {
    static boolean[] primes = new boolean[10001];

    public static void generateSeive(){
        for(int i=2;i<10000;i++){
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;

        for(int i=2;i<10000;i++){
            if(primes[i]){
                for(int j=i*i;j<10000;j+=i){
                    primes[j] = false;
                }
            }
        }

    }

    public static boolean isPrime(int n){
        return primes[n];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int testCases = scan.nextInt();
        generateSeive();

        while(testCases-- > 0){
            int item = scan.nextInt();
            if(String.valueOf(item).length() < 6){
                if(isPrime(item)){
                System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
            }
            else{
                boolean prime = true;
                for(int i = 2;i*i<item;i++){
                    if(item%i==0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                System.out.println("Prime");
                }
                else{
                    System.out.println("Not prime");
                }
            }

        }
    }
}
