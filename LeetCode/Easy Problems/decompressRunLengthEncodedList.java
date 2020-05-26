class Solution {
    public int[] decompressRLElist(int[] nums) {
        int freq = 0, value = 0, currentIndex = 0, resultantArraySize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            resultantArraySize += nums[i];
        }
        int[] res = new int[resultantArraySize];
        for (int i = 0; i < nums.length; i += 2) {
            freq = nums[i];
            value = nums[i + 1];
            while (freq-- > 0) {
                res[currentIndex++] = value;
            }
        }
        return res;
    }
}