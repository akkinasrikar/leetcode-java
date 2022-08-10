class Solution {
    public int maxProfit(int[] prices)
    {
        int profit=0;
        int best=prices[0];
        for(int i: prices)
        {
            if((i-best)>profit) { profit=i-best; }
            if (i<best) { best=i; }
        }
        return profit;
    }
}