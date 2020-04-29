class Solution {
    public int maxSubArray(int[] nums) {
        int max_current = nums[0], max_global = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max_current = Math.max(nums[i], nums[i] + max_current);
            max_global = Math.max(max_current, max_global);
        }
        return max_global;
    }

    public static void main(String ar[]) {
        Solution sol = new Solution();
        System.out.println(sol.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
}