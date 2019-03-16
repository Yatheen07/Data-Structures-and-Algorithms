import java.util.*;
import java.io.*;

class Solution{

  private static Stack<Character> stack;
  private static boolean isBalanced(String input){
     stack = new Stack<Character>();
     char headChar = ' ';

     for(char ch : input.toCharArray()){
       if(ch == '{' || ch == '(' || ch == '[' ) stack.push(ch);

       if( (ch == '}' || ch == ')' || ch == ']') ){

         if(stack.isEmpty()) return false;
         else{
           headChar = (char) stack.peek();
           if(
             (headChar == '{' && ch == '}') ||
             (headChar == '(' && ch == ')') ||
             (headChar == '[' && ch == ']')) {

               stack.pop();
             }
           else{
             return false;
           }
         }
       }

     }
     if(!stack.isEmpty()) return false;
     return true;
  }

  public static void main(String ar[]) throws Exception{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String input = reader.readLine();

    if(isBalanced(input)) System.out.println("YES");
    else System.out.println("NO");
  }
}
