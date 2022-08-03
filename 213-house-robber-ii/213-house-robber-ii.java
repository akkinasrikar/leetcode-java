class Solution {
    public int rob(int[] nums)
    {   if (nums.length==1) { return nums[0]; }
        if (nums.length==2) { return Math.max(nums[0],nums[1]); }
        HashMap<Integer,Integer> cache1 = new HashMap<>();
        HashMap<Integer,Integer> cache2 = new HashMap<>();
        int[] a = Arrays.copyOfRange(nums,1,nums.length);
        int[] b = Arrays.copyOfRange(nums,0,nums.length-1);
        return Math.max(dp(0,a,cache1),dp(0,b,cache2));
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