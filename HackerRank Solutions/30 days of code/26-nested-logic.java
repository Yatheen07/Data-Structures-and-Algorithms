import java.io.*;
import java.util.*;

public class Solution {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int da = scan.nextInt();
        int ma = scan.nextInt();
        int ya = scan.nextInt();
        int de = scan.nextInt();
        int me = scan.nextInt();
        int ye = scan.nextInt();

        int fine = 0;

        if((ya - ye) != 0 ){
            if(ya > ye)
                fine = 10000;
        }
        else{
            if((ma - me) != 0 && (ma > me) ){
                fine = 500 * (ma - me);
            }
            else{
                if(da > de){
                    fine = 15 * (da - de);
                }

            }
        }
        System.out.println(fine);


    }
}
