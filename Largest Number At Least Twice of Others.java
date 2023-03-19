class Solution {
    public int dominantIndex(int[] nums) {
        
    int maximum=nums[0];
       
        int i=0;
        int maxIndex=0;
        int n=nums.length;
        
        for( i=0;i<n;i++){
            
            if(nums[i]>maximum){
                
                maximum=nums[i];
                maxIndex=i;
            }
        }
            
            for( i=0;i<n;i++){
                
                if(i!=maxIndex&&(nums[i]*2)>maximum){
                    
                    return -1;
                }
                
            }
            
               return maxIndex;
       
        }
        

    }
