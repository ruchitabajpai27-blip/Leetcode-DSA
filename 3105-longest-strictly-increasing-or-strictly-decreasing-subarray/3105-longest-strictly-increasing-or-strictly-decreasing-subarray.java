class Solution 
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        int result=1;
        for(int i=0;i<nums.length;i++)
        {
            int incre=1;
            int j=i+1;
            while(j<nums.length&&nums[j]>nums[j - 1])
            {
                incre++;
                j++;
            }
            result=Math.max(result,incre);
            j=i+1;
            int decre=1;
            while(j<nums.length&&nums[j]<nums[j - 1])
            {
                decre++;
                j++;
            }
        result=Math.max(result,decre);
        }
    return result;
    }
}