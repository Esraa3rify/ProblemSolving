class Solution {
  public int pivotIndex(int[] nums) {
  
  //define the size of the array
  
    int n = nums.length;
    
    //declare the sum variable
    
    int totalSum = 0;
    
    for (int i = 0; i < n; i++) {
    
    //calculate the total sum of the array
    
      totalSum += nums[i];
    }
    
    //declare the left sum
    
    int leftSum = 0;
    
    for (int i = 0; i < n; i++) {
    
    //calculate the right sum
       
    //nums[i]=current item or the value of index 
    
      if (leftSum == totalSum- leftSum - nums[i]) {
        return i;
      }
      
      //else, continue sum the array values
      leftSum += nums[i];
    }
    
   
    //if there is no pivot index, return -1
    return -1;
  }
}
