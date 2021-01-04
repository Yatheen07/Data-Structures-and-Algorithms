import java.util.*;

class Solution{
  public static void main(String a[]){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println("Output: "+""+input.replaceAll("\\p{Punct}",""));
  }
}
