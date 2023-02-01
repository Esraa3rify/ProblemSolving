class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
       int[] ans = new int[2*n];
       
        System.arraycopy(nums,0,ans,n,n); 
         System.arraycopy(nums,0,ans,0,n); 
        System.out.println(ans.length);
    

          return ans;
        
    }
  
}
------------------------------------------------------------------------------

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int []ans=new int[n+n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        } 
        return ans;       
    }
    
}
