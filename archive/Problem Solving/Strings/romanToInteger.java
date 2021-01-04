import java.util.*;

class Solution{

  public static int getValue(char c){
    int value = 0;
    switch(c){
      case 'M':
        value = 1000;
        break;
      case 'D':
        value = 500;
        break;
      case 'C':
        value = 100;
        break;
      case 'L':
        value = 50;
        break;
      case 'X':
        value = 10;
        break;
      case 'V':
        value = 5;
        break;
      case 'I':
        value = 1;
        break;
    }
    return value;
  }

  static Stack<Character> stack = new Stack<Character>();

  public static int romanToInteger(String input){
    for(char c : input.toCharArray()){
      stack.push(c);
    }
    System.out.println(stack);
    int previousValue = 0,result = 0;
    for(int i=0;i<input.length();i++){
      int currentValue = getValue(stack.pop());
      if(currentValue >= previousValue){
        result += currentValue;
      }
      else{
        result -= currentValue;
      }
      previousValue = currentValue;
    }
    return result;
  }

  public static void main(String ar[]){
    System.out.println(romanToInteger("MMCDXV"));
  }
}
