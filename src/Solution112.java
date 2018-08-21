/**
 * 买卖股票的最佳时机 II
 * Created by nanca on 8/21/2018.
 */
public class Solution112 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit = 0;
        for (int j = 1; j < prices.length; j++) {
            if (prices[j] > prices[j-1]) {
                profit += prices[j] - prices[j-1];
            }
        }
        return profit;
    }
}
