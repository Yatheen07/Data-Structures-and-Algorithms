//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    private static HashMap<String,Integer> map = new HashMap<String,Integer>();

    static void pushElement(String key,int value){
        if(map.containsKey(key)){
            map.put(key,value);
        }
        else{
            map.put(key,value);
        }
    }
    static void solve(String key){
        if(map.containsKey(key)){
            System.out.println(key+"="+map.get(key));
        }
        else{
            System.out.println("Not found");
        }
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            pushElement(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            solve(s);
            // Write code here
        }
        in.close();
    }
}
