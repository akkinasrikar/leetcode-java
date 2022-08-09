class Solution {
    public int maxScoreSightseeingPair(int[] values)
    {
        int prev = values[0];
        int res = -9999999;
        for(int i=1;i<values.length;i++)
        {
            res=Math.max(res,prev+values[i]-i);
            prev=Math.max(prev,values[i]+i);
        }
        return res;
    }
}