import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long getCount(String str){
        long count = 0;
        for(char c: str.toCharArray()){
            if(c=='a')  count++;
        }
        return count;
    }
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long len = s.length();
        long q = n / len;
        long r = n % len;
        long initialCount = getCount(s);
        long result = (initialCount * q) + getCount(s.substring(0,(int)r));
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
