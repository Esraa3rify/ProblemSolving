class Solution {
    public void reverseString(char[] s) {
        
        char temp;
      for(int i=0,y=s.length-1;i<s.length/2;i++,y--){
          
                  temp=s[i];
                s[i]=s[y];
            
                s[y]=temp;
                
            
            
            
            
            
        }
      
    }
}
