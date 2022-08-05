class Solution {
    public int maxSubarraySumCircular(int[] nums)
    {
        int ncs = kadane(nums);
        int s = 0;
        for(int i=0;i<nums.length;i++)
        {
            s = s + nums[i];
            nums[i] = -nums[i];
        }
        int cs = s + kadane(nums);
        if (cs==0) { return ncs; }
        return Math.max(cs,ncs);
        
    }
    
    private int kadane(int[] nums)
    {
        int a=0;
        int b=-999999;
        for(int i : nums)
        {
            a = a + i;
            if (a<i) { a = i; }
            b = Math.max(b,a);
        }
        return b;
    }
}