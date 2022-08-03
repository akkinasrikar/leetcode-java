import java.util.HashMap;
class Solution {
    public int climbStairs(int n)
    {
        HashMap<Integer,Integer> cache = new HashMap<>();
        cache.put(0,0);
        cache.put(1,1);
        cache.put(2,2);
        return dp(n,cache);
    }
    
    private int dp(int n,HashMap<Integer,Integer> cache)
    {
        if (cache.containsKey(n))
        {
            return cache.get(n);
        }
        cache.put(n,dp(n-1,cache)+dp(n-2,cache));
        return cache.get(n);
    }
    
    
    
    
}