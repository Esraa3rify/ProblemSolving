class Solution {
    public int maxSubArray(int[] nums) {
        
          int n = nums.length;
          int maximumSubArraySum = Integer.MIN_VALUE;
        
         for (int left = 0; left < n; left++) {
      for (int right = left; right < n; right++) {
        // Let's investigate this window
        int windowSum = 0;

        // Add all items in the window
        for (int k = left; k <= right; k++) {
          windowSum += nums[k];
        }

        maximumSubArraySum = Math.max(maximumSubArraySum, windowSum);
      }
    }

    return maximumSubArraySum;
        
        
        
    }
}
