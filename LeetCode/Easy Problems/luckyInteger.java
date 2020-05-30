class Solution {
    public int findLucky(int[] arr) {
        int lucky = -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        for (int i : arr) {
            if (i == map.get(i)) {
                lucky = (lucky > i) ? lucky : i;
            }
        }
        return lucky;
    }
}