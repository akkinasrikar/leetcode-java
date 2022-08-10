class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> cache = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            if (cache.containsKey(diff))
            {
                res[0] = i;
                res[1] = cache.get(diff);
                break;
            }
            cache.put(nums[i],i);
        }
        return res;
    }
}