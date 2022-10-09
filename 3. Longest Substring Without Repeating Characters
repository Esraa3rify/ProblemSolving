class Solution {
    public int lengthOfLongestSubstring(String s) {
      
      //determine a max value to compare the results with
      
        int maxLength=0;
        
    //determine a pointer to stand on the value or the element we consider the max length without duplicate
    
        for(int i=0;i<s.length();i++){
        
     //create a container to put the elements into it  
     
        StringBuilder currentLongestSubstring=new StringBuilder();
        
    //determine a pointer to shrink and expand throuth the string
    
            for(int j=i;j<s.length();j++){

//this line means that checking if the string in the builder is duplicated or repeated or not

if(currentLongestSubstring.indexOf(String.valueOf(s.charAt(j))) !=-1){  

    //if repeated, so break
    
              break;  
              } 

    //else, add the elements to the builder  
    
  currentLongestSubstring.append(s.charAt(j));
  
  //check which variable has the longest length
  
 maxLength=Math.max(maxLength,currentLongestSubstring.length());      
            }
        }

             return maxLength;
    }
}
