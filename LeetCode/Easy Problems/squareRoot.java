class Solution {
    public int mySqrt(int x) {
        long left = 0, right = x / 2 + 1, mid = left;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long currentSquare = mid * mid;
            if (currentSquare == x)
                return (int) mid;
            else if (currentSquare < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return (int) right;
    }
}