class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int left = 0;
        int maxLen = 1;

        // Increasing window
        for (int right = 1; right < nums.length; right++) {

            if (nums[right] <= nums[right - 1]) {
                left = right;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        left = 0;

        // Decreasing window
        for (int right = 1; right < nums.length; right++) {

            if (nums[right] >= nums[right - 1]) {
                left = right;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}