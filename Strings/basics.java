import java.util.*;

class Solution{
  public static void main(String args[]){
    //Ways to create a String
    String a = "A String";
    String b = new String("Anohter String");
    StringBuffer c = new StringBuffer("Anohter String");
    StringBuilder d = new StringBuilder(b);

    //String methods
    System.out.println(a.length());
    System.out.println(a.charAt(0));
    System.out.println(b.substring(2,3)); // startIndex,endIndex
    System.out.println(a.concat(b));
    System.out.println(a+""+b);
    System.out.println(b.indexOf("t")+""+b.indexOf("t",4));
    System.out.println( a.compareTo(b) +"-"+b.compareTo(c.toString()) );
  }
}
