class Solution {
    public boolean containsDuplicate(int[] nums) {
        
      
   if (nums == null || nums.length == 0) return false;
   
   int l = nums.length;
   for (int i=0; i<l; i++) {
      for (int j=i+1; j<l; j++) {
         if (nums[i] == nums[j]) {
            return true;
         }
      }
   }
   return false;
}
        
        
        
    
}


//That Solution will cause -> Time Limit Exceeded, so we will use Sorting insted.


public boolean containsDuplicate(int[] nums) {
   if (nums == null || nums.length == 0) return false;
   
   Arrays.sort(nums);
   int l = nums.length;
   for (int i=1; i<l; i++) {
      if (nums[i-1] == nums[i]) {
         return true;
      }
   }
   return false;
}
