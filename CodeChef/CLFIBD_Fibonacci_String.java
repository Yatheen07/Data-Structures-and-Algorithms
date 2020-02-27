import java.util.*;
class Solution{
    private static String solve(String input){
        HashMap<Character,Integer> freq = new HashMap<Character,Integer>();

        for(char c: input.toCharArray()){
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c) + 1);
            }
            else{
                freq.put(c,1);
            }
        }

        ArrayList<Integer> frequencies = new ArrayList<Integer>();
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            frequencies.add(entry.getValue());
        }
        Collections.sort(frequencies);
        boolean isFiboString = true;
        for(int i = frequencies.size() - 1;i>1;i--){
            if(frequencies.get(i - 1) + frequencies.get(i - 2) != frequencies.get(i))
                isFiboString = false;
        }
        return (isFiboString) ? "DYNAMIC" : "NOT";
    }
    public static void main(String ar[]){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-- > 0){
            String input = scan.next();
            if(input.length() < 3)
                System.out.println("DYNAMIC");
            else
                System.out.println(solve(input));
        }
        scan.close();
    }
}