import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void getIntValue(String input){
        try{
            int value = Integer.parseInt(input);
            System.out.println(value);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        getIntValue(S);
    }
}
