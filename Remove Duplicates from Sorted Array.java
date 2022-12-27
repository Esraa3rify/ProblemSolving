class Solution {
    public int removeDuplicates(int[] nums) {
        
      
       //second pointer stands on 1
        int index=1;

        for(int i=0;i<nums.length-1;i++){
          
       //If I am dealing with sorted+duplicates numbers, I should focus on the numbers which differs not the nums which like each other.
            if(nums[i]!=nums[i+1]){
              //put the value of the furst unique value in olace of the index value(the value before the symmetric values)
                nums[index++]=nums[i+1];
              
            }
        }
     return index;
    }
}
