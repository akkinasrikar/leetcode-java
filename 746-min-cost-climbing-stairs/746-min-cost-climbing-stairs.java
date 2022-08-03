import java.util.HashMap;
class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {   
        HashMap<Integer,Integer> cache = new HashMap<>();
        return Math.min(dp(0,cost,cache),dp(1,cost,cache));
    }
    private int dp(int pos,int[] cost,HashMap<Integer,Integer> cache)
    {
        if (pos>=cost.length)
        {
            return 0;
        }
        if (cache.containsKey(pos))
        {
            return cache.get(pos);
        }
        cache.put(pos,Math.min(cost[pos]+dp(pos+1,cost,cache),
                             cost[pos]+dp(pos+2,cost,cache)));
        return cache.get(pos);
    }
    
}