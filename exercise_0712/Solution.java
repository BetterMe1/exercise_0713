package exercise.exercise_0712;

public class Solution {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
        int maxp_fbuy = Integer.MIN_VALUE;
        int maxp_fsell = 0;
        int maxp_sbuy = Integer.MIN_VALUE;
        int maxp_ssell = 0;
        for(int i=0; i<prices.length; i++){
            maxp_fbuy = Math.max(maxp_fbuy,-prices[i]);
            maxp_fsell = Math.max(maxp_fsell,maxp_fbuy+prices[i]);
            maxp_sbuy = Math.max(maxp_sbuy,maxp_fsell-prices[i]);
            maxp_ssell = Math.max(maxp_ssell,maxp_sbuy+prices[i]);
        }
        return maxp_ssell;
    }
}
