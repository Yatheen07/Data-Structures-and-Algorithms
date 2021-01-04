import java.util.*;

class Solution{

  static String reduceString(String in){
    Stack<Character> stack = new Stack<Character>();
    stack.push(in.charAt(0));
    for(int i=1;i<in.length();i++){
      char c = in.charAt(i);
      if(!stack.isEmpty()){
        if(stack.peek() == c){
          stack.pop();
        }
        else{
          stack.push(c);
        }
      }
      else{
        stack.push(c);
      }
    }
    if(stack.isEmpty()) return "Empty String";
    else{
      char[] result = new char[stack.size()];
      int i=0;
      for(char c:stack){
        result[i++] = c;
      }
      return String.valueOf(result);
    }
  }
  public static void main(String ar[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      String in = scan.next();
      if(in.equals("break")){
        break;
      }
      System.out.println("Reduced String: "+reduceString(in));
    }
  }
}
