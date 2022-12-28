class Solution {
    public int removeElement(int[] nums, int val) {

  //create a pointer stands on the first element
        int index=0;
        for(int i=0;i<nums.length;i++){
        //if the element not equals the value so 
            if(nums[i]!=val){
            //put the value of the i inplace of index and increase index 
                nums[index++]=nums[i];
             // index++;
            }
        }
         return index;
    }
}
