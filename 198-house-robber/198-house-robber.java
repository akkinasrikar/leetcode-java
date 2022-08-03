class Solution {
    public int rob(int[] nums)
    {
        HashMap<Integer,Integer> cache = new HashMap<>();
        return dp(0,nums,cache);
    }
    
    private int dp(int pos,int[] money,HashMap<Integer,Integer> cache)
    {
        if (pos>=money.length)
        {
            return 0;
        }
        if (cache.containsKey(pos))
        {
            return cache.get(pos);
        }
        cache.put(pos,Math.max(money[pos]+dp(pos+2,money,cache),
                        dp(pos+1,money,cache)));
        return cache.get(pos);
    }
}