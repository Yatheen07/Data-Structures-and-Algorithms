import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class Element{
        char element;
        int currValue;
        Element(char element,int currValue){
            this.element = element;
            this.currValue = currValue;
        }
    }

    static int getMaxCont1(String input){
        Stack<Element> stack = new Stack<Element>();
        for(char c:input.toCharArray()){
            if(stack.isEmpty()){
                if(c=='1'){
                    stack.push(new Element(c,1));
                }
            }
            else{
                char topEle = stack.peek().element;
                int topValue = stack.peek().currValue;
                //System.out.println("Top Element: "+topEle+" Top Value: "+topValue);
                if(topEle == '1' && c=='1'){
                    stack.push(new Element(c,topValue+1));
                }
                else if(c=='1'){
                    stack.push(new Element(c,1));
                }
                else{
                    stack.push(new Element(c,0));
                }
            }
        }
        int max = 0;
        for(Element obj : stack){
            int currValue = obj.currValue;
            //System.out.print(currValue+"-");
            max = Math.max(max,currValue);
        }
        return max;
    }

    static int solve(int n){
        String binary = Integer.toBinaryString(n);
        //System.out.println(binary);
        return getMaxCont1(binary);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(solve(n));
        scanner.close();
    }
}
