class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int numberOfOnes=0;
        int max=0;
    
    for (int i=0;i<nums.length;i++){

        if(nums[i]==1){

            numberOfOnes+=1;
           max= Math.max(numberOfOnes,max);
        }else{

            numberOfOnes=0;
        }
    }
     
        return max;
    }
}
