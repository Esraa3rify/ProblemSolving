class Solution {
    public int[] runningSum(int[] nums) {
    
    //the two arrays are the same size as given in the problem descriptian.
    
    int[] ans = new int[nums.length];
    
    //the value of the first index in the both arrays are equal
    
    ans[0] = nums[0];
    
    for (int i = 1; i < nums.length; i++)
    
        ans[i] = ans[i-1] + nums[i];
    return ans;
    }
}
