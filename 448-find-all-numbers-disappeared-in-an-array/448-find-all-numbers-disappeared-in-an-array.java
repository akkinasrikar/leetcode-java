class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            idx = Math.abs(nums[i])-1;
            if(nums[idx]>0) nums[idx] = -1*nums[idx];
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]>0)
            {
                res.add(i+1);
            }
        }
        return res;
    }
}