class Solution {
    private static int findPivotPoint(int[] nums) {
        int left = 0, right = nums.length - 1, mid = left;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right--;
        }
        return left;
    }

    public int search(int[] nums, int target) {

        if (nums == null || nums.length == 0)
            return -1;
        int pivotIndex = findPivotPoint(nums);
        System.out.println(pivotIndex);
        int largestInRightArray = nums[nums.length - 1];
        int left = 0, right = 0;
        if (largestInRightArray >= target) {
            left = pivotIndex;
            right = nums.length - 1;
        } else {
            right = pivotIndex;
        }
        int mid = left;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int c = nums[mid];
            if (c == target)
                return mid;
            else if (c < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}