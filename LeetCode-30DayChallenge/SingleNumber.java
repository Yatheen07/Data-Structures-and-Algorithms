class Solution {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int i : nums)
            unique ^= i;
        return unique;
    }

    public static void main(String ar[]) {
        System.out.println(singleNumber(new int[] { 4, 1, 2, 1, 2 }));
    }
}