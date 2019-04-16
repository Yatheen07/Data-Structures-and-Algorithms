import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String pattern = "@gmail.com";
        Pattern p = Pattern.compile(pattern);


        ArrayList<String> set = new ArrayList<String>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            Matcher match = p.matcher(emailID);
            if(match.find()){
                set.add(firstName);
            }
        }
        Collections.sort(set);
        for(String a: set){
            System.out.println(a);
        }
        scanner.close();
    }
}
