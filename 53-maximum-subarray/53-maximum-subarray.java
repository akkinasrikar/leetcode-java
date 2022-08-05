class Solution {
    public int maxSubArray(int[] nums) {
        Integer a;
        Integer b;
        a=0;
        b=-99999999;
        for(int i=0;i<nums.length;i++)
        {
            a = a + nums[i];
            if (a<nums[i])
            {
                a=nums[i];
            }
            b=Math.max(b,a);
        }
        return b;
    }
}