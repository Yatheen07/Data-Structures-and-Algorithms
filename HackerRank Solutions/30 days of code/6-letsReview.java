import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while(t-- > 0){
            String input = scan.nextLine();
            for(int i=0;i<input.length();i+=2){
                System.out.print(input.charAt(i));
            }
            System.out.print(" ");
            for(int i=1;i<input.length();i+=2){
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }
}
