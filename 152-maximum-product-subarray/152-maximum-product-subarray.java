class Solution {
    public int maxProduct(int[] nums)
    {
        int[] MAX = new int[nums.length];
        int[] MIN = new int[nums.length];
        MAX[0] = nums[0];
        MIN[0] = nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int temp=nums[i];
            MIN[i] = Math.min(Math.min(temp,temp*MIN[i-1]),temp*MAX[i-1]);
            MAX[i] = Math.max(Math.max(temp,temp*MIN[i-1]),temp*MAX[i-1]);
            res = Math.max(res,MAX[i]);
        }
        return res;
    }
}