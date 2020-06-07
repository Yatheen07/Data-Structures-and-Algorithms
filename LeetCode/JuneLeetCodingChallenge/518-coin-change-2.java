class Solution {
    public int change(int amount, int[] coins) {
        if(coins.length == 0 && amount == 0) return 1;
        int[] mat = new int[amount+1];
        mat[0]=1;
        for(int coin : coins){
            for(int j=coin;j<=amount;++j){
                mat[j] += mat[j-coin];
            }
        }
        return mat[amount];
    }
}