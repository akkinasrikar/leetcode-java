class Solution {
    public int combinationSum4(int[] nums, int target)
    {
        HashMap<Integer,Integer> memo = new HashMap<>();
        return dp(target,nums,memo);
    }
    
    private int dp(int target,int[] nums,HashMap<Integer,Integer> memo)
    {
        if (target==0) { return 1; }
        if (target<0) { return 0; }
        if (memo.containsKey(target))
        {
            return memo.get(target);
        }
        int res;
        res = 0;
        for(int i : nums)
        {
            res = res + dp(target-i,nums,memo);
        }
        memo.put(target,res);
        return memo.get(target);
    }
}