import java.util.*;

class Solution{

    public static class Element{
      char ch;
      String currString;

      Element(char ch,String str){
        this.ch = ch;
        this.currString = str;
      }
    }

    static Stack<Element> stack = new Stack<Element>();

    static String decode(String str){
      for(char c: str.toCharArray()){
        if(stack.isEmpty()){
          if(Character.isDigit(c)) return "null";
          else{
            stack.push(new Element(c,String.valueOf(c)));
          }
        }
        else{
          if(!Character.isDigit(c)){
            String prevString = stack.peek().currString;
            String temp = prevString.concat(String.valueOf(c));
            stack.push(new Element(c,temp));
          }
          else{
            int count = Character.getNumericValue(c);
            String prevString = stack.peek().currString;
            String temp = "";
            while(count-- > 0){
              temp = temp.concat(prevString);
            }
            System.out.println(c+" "+temp);
            stack.push(new Element(c,temp));
          }
        }
      }
      return stack.peek().currString;
    }

    public static void main(String ar[]){

      String input = new String("ab2c3");
      String output = decode(input);
      int k = 5;
      System.out.println(output.charAt(k-1));

    }
}
