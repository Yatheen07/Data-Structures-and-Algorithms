import java.util.*;

class Solution{
  private static HashMap<Character,Integer> freq;

  static Set<Integer> getCharsFreq(String in){
      freq = new HashMap<Character,Integer>();
      for(int i=0;i<in.length();i++){
        char c = in.charAt(i);
        if(freq.containsKey(c)){
          freq.put(c,freq.get(c) + 1);
        }
        else
          freq.put(c,1);
      }
      System.out.println("Frequencies: "+freq.toString());

      Set<Integer> diffFreq = new HashSet<>();
      for(int i : freq.values()){
          diffFreq.add(i);
      }
      return diffFreq;
  }

  static String getResult(Set<Integer> sets){
      int size = sets.size();
      if(size > 2 || size < 1)
          return "NO";
      else if(size == 1)
          return "YES";
      else{
          Iterator iter = sets.iterator();
          int f1 = (int) iter.next();
          int f2 = (int) iter.next();
          System.out.println(f1+"->"+f2);
          int f1_count = 0;
          int f2_count = 0;
          for(int i : freq.values()){
            if(i==f1) f1_count++;
            if(i==f2) f2_count++;
          }
          if( (f1 == 1 && f1_count==1) ||
              (f2 == 1 && f2_count==1) ){
                return "YES";
          }
          else if(Math.abs(f1-f2) == 1 &&
                  (f1_count == 1 || f2_count == 1)){
                    return "Yes";
          }
          else return "NO";
      }
  }

  static String isValid(String s) {
      Set<Integer> differentFreq = getCharsFreq(s);
      String result = getResult(differentFreq);
      return result;
  }

  public static void main(String ar[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      String in = scan.next();
      if(in.equals("break")){
        break;
      }
      System.out.println(isValid(in));
    }
  }

}
