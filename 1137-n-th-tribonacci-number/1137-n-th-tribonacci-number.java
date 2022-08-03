class Solution {
    public int tribonacci(int n) 
    {   
        if (n==0) { return 0; }
        if (n==1 || n==2) { return 1; }
        int[] cache;
        cache = new int[n+1];
        cache[1] = 1;
        cache[2] = 1;
        return func(n,cache);
    }
    public int func(int n,int[] cache)
    {
        if (n==0) { return cache[0]; }
        if (n==1) { return cache[1]; }
        if (n==2) { return cache[2]; }
        if (cache[n]!=0) { return cache[n]; } 
        cache[n] = func(n-3,cache)+func(n-2,cache)+func(n-1,cache);
        return cache[n];
    }
}