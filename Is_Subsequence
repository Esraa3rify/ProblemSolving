class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0) return true;
    
    //intialize the pointers that i will use to check the two strings
        
        int i=0; int j=0;
        
        //make sure that the pointers not on the bound of the charactrs of the two string
        
        while(i<s.length() && j<t.length()){
            
            //if the char that the pointer in s refers to == the char that the pointer in t refers to 
            
            if(s.charAt(i)==t.charAt(j)){
            
            //increase the two pointers or shift 
                i++;
                j++;
                
            }else{
                
                 //if the item in s not equal to the item in t, so increase the pointer in t only and skip the previous character
                 
            j++;
            
            }
            
            //that means the pointer reach the end of the string s, and that means the two strings are subsequence
            
            if(i==s.length()){
                
                return true;
            }
         
        }
        
          return false;
        
    }
}
        
          return false;
        
    }
}
