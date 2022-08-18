class Solution {
    public int numTrees(int n)
    {
        int[] memo = new int[n+1];
        return dp(memo,n);
    }
    
    public int dp(int[] memo,int n)
    {
        if (n==0) { return 1; }
        if (memo[n]!=0) { return memo[n]; }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res += dp(memo,i)*dp(memo,n-i-1);
        }
        memo[n] = res;
        return memo[n];
    }
}