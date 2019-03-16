import java.util.*;

class Solution{
  private static Stack<Query> stack;

  public static void main(String ar[]){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    stack = new Stack<Query>();
    while(t-- > 0){
      String query = scan.next();
      String input = scan.next();
      stack.push(new Query(query,input));
    }

    System.out.println(stack.peek().input);
    for(Query obj: stack){
      System.out.println(obj.query+" "+obj.input);
    }

  }

  public static class Query{
    String query;
    String input;
    Query(String query,String input){
      this.query = query;
      this.input = input;
    }
  }
}
