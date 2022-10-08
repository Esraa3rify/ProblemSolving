class Solution {
    public int threeSumClosest(int[] nums, int target) {
     
     //create the initial state, base, default of the problem.
     int closestSum=nums[0]+nums[1]+nums[nums.length-1];
     //sort the array
     Arrays.sort(nums);
     int current_sum=0;
     //create the pointers
     for(int i=0;i<nums.length-2;i++){
         int a_pointer=i+1;
         int b_pointer=nums.length-1;
         
         //while the array sorted from the lowest to highest
         while(a_pointer<b_pointer){

          current_sum=nums[i]+nums[a_pointer]+nums[b_pointer];

         if(current_sum>target){
             b_pointer-=1;
         }else{
             a_pointer+=1;
         }

          if(Math.abs(current_sum-target)<Math.abs(closestSum-target)){
             closestSum=current_sum;
         }

         }

        
     }
          return closestSum;
    }
  
}
