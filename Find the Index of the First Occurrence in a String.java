class Solution {
    public int strStr(String haystack, String needle) {
     
        
        
         for (int i = 0; i <= haystack.length() - needle.length(); i++) {
             
             //i+needle.length() is the ending index that we will stop on it during extract 
             //i here sto prevent out of index
                
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
              
            }
            
        
          return -1;
    }
}
