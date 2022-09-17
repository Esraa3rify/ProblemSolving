class Solution {
    
    //use binarySearch as mentioned in the description O(log n)
    
    public int[] searchRange(int[] nums, int target) {
        
        //identify the size of the array.
        int[] result=new int [2];
        //create two nethods to find the elements of the previous array
        result[0]=findStartingIndex(nums,target);
        result[1]=findEndingIndex(nums,target);
     return result;   
    }
        
        public int findStartingIndex(int []nums,int target){
            int index=-1;
            int start=0;
            int ending=nums.length-1;
            
            while(start<=ending){
                
                //using this statement to find midPoint to avoid overFlow
                int midPoint=start+(ending-start)/2;
              
                if(nums[midPoint]>=target){
                    ending=midPoint-1;
                }
                
                else{
                    
                    start=midPoint+1;
                }
                if(nums[midPoint]==target) index=midPoint;
            }
            
            return index;
        }
    
    
    
        public int findEndingIndex(int []nums,int target){
            int index=-1;
            int start=0;
            int ending=nums.length-1;
            
            while(start<=ending){
                
                int midPoint=start+(ending-start)/2;
                
                if(nums[midPoint]<=target){
                      start=midPoint+1;
                }
                
                else{
                    
                        ending=midPoint-1;
                }
                if(nums[midPoint]==target) index=midPoint;
            }
            
            return index;
        }

    }
