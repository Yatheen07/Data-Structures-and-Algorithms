import java.util.*;

class Solution {

    public static HashMap<Integer, Integer> squares = new HashMap<Integer, Integer>();

    public static void generateSquares() {
        for (int i = 0; i < 10; i++) {
            squares.put(i, i * i);
        }
    }

    public boolean isHappy(int n) {
        generateSquares();
        HashSet<Integer> seenSum = new HashSet<Integer>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                sum += squares.get(current % 10);
                current /= 10;
            }

            if (seenSum.contains(sum))
                return false;
            else
                seenSum.add(sum);

            n = sum;
        }

        return true;
    }

    public static void main(String ar[]) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(17));
    }
}