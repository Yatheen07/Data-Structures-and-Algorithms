import java.util.*;

class Solution{
    private static int predictNumberInRange(int a,int b){
        if(a == b) return b;
        else return (int)((a+b)/2);
    }
    public static void main(String ar[]){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String currentStatus;
        while(testCases-- > 0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int currentPrediction = predictNumberInRange(a,b);
            System.out.println(currentPrediction);
            outerloop:
            while(n-- > 0){
                currentStatus = scan.next();
                switch(currentStatus){
                    case "TOO_SMALL":
                        a = currentPrediction;
                        currentPrediction = predictNumberInRange(a,b);
                        System.out.println(currentPrediction);
                        break;
                    case "TOO_BIG":
                        b = currentPrediction;
                        currentPrediction = predictNumberInRange(a,b);
                        System.out.println(currentPrediction);
                        break;
                    case "WRONG_ANSWER":
                    case "CORRECT":
                        break outerloop;
                        
                }
            }
        }
    }
}