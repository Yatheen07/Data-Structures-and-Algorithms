class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        HashMap<Character, Boolean> j = new HashMap<Character, Boolean>();
        for (char c : J.toCharArray()) {
            j.put(c, true);
        }
        for (char c : S.toCharArray()) {
            if (j.containsKey(c))
                result++;
        }
        return result;
    }
}