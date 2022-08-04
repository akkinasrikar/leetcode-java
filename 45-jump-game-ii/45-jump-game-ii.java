class Solution {
    public int jump(int[] nums)
    {
        int l=0;
        int r=0;
        int steps=0;
        int L=nums.length;
        while (r<L-1)
        {
            int lg=0;
            for(int j=l;j<=r;j++)
            {
                lg=Math.max(lg,j+nums[j]);
            }
            l=r+1;
            r=lg;
            steps=steps+1;
        }
        return steps;
    }
}