class Solution {
    public int trap(int[] height)
    {
        int l = height.length;
        int[] ml = new int[l];
        int[] mr = new int[l];
        int max = 0;
        for(int i=1;i<l;i++)
        {
            max = Math.max(height[i-1],max);
            ml[i] = max;
        }
        max = 0;
        for(int i=l-2;i>=0;i--)
        {
            max = Math.max(height[i+1],max);
            mr[i] = max;
        }
        int res = 0;
        for(int i=0;i<l;i++)
        {
            int temp = Math.min(ml[i],mr[i])-height[i];
            if (temp>0) { res += temp; }
        }
        return res;
    }
}