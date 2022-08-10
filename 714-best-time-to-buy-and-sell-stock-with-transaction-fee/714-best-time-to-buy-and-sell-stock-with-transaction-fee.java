class Solution {
    public int maxProfit(int[] prices, int fee)
    {
        int[][] memo = new int[prices.length][2];
        return dp(prices,0,1,memo,fee);    
    }
    
    public int dp(int[] prices,int day,int buy,int[][] memo,int fee)
    {
        if (day>=prices.length) { return 0; }
        if (memo[day][buy]!=0) { return memo[day][buy]; }
        if (buy==1)
        {
            memo[day][buy]=Math.max(-prices[day]+dp(prices,day+1,0,memo,fee),
                                    dp(prices,day+1,buy,memo,fee));
            return memo[day][buy];
        }
        else
        {
            memo[day][buy]=Math.max(prices[day]-fee+dp(prices,day+1,1,memo,fee),
                           dp(prices,day+1,buy,memo,fee));
            return memo[day][buy];
        }
    }
}