import java.util.*;

class Solution{

  static String copyString(String a){
    char[] b = new char[a.length()];
    int i = 0;
    for(char c : a.toCharArray()){
      b[i++] = c;
    }
    return new String(b);
  }

  static String copyString(String a,int startIndex,int endIndex){
    char[] b = new char[a.length()];
    int j = 0;
    for(int i=startIndex;i<endIndex;i++){
      b[j++] = a.charAt(i);
    }
    return new String(b);
  }

  public static void main(String ar[]){
    String a = "Yatheen!";
    String b = copyString(a); // copy the whole string
    String c = copyString(a,2,4); // copy the substring
    System.out.println(b);
    System.out.println(c);
  }

}
