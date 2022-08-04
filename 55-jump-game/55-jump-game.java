class Solution {
    public boolean canJump(int[] nums)
    {
        Integer Goal = nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if (i+nums[i]>=Goal)
            {
                Goal = i;
            }
        }
        if (Goal==0) { return true; }
        else { return false; }
    
    }
}