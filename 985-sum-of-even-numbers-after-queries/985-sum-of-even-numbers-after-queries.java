class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int s=0;
        int i;
        int temp,a,b,x,j;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0) s += nums[i];
        }
        int[] res = new int[nums.length];
        for(x=0;x<queries.length;x++)
        {
            i=queries[x][0];
            j=queries[x][1];
            temp=nums[j]+i;
            a=Math.abs(temp%2);
            b=Math.abs(nums[j]%2);
            if(a==0 && b==1) s = s + temp;
            else if(a==0 && b==0) s = s + i;
            else if(a==1 && b==0) s = s - nums[j];
            nums[j]=temp;
            res[x]=s;
        }
    return res;
    }
}