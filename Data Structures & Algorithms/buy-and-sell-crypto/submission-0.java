class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0],profit=0,n=prices.length;
        for(int i=0;i<n;i++)
        {
            int cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}