class Solution {
    public int minimumDeleteSum(String s1, String s2)
    {
        int[][] memo = new int[s1.length()][s2.length()];
        return dp(s1,s2,0,0,memo);
        
    }
    
    public int dp(String A,String B,int a,int b,int[][] memo)
    {
        if (a==A.length() || b==B.length())
        {
            if (a==A.length() & b==B.length()) { return 0; }
            if (a==A.length())
            {
                int s=0;
                for(int i=b;i<B.length();i++)
                {
                    s = s + (int) B.charAt(i);
                }
                return s;
            }
            if (b==B.length())
            {
                int s=0;
                for(int i=a;i<A.length();i++)
                {
                    s = s + (int) A.charAt(i);
                }
                return s;
            }
        }
        if (memo[a][b]!=0) { return memo[a][b]; }
        if (A.charAt(a)==B.charAt(b)) { return dp(A,B,a+1,b+1,memo); }
        memo[a][b]=Math.min((int) A.charAt(a)+dp(A,B,a+1,b,memo),
                       (int) B.charAt(b)+dp(A,B,a,b+1,memo));
        return memo[a][b];
            
    }
}