class Solution {
    public String longestCommonPrefix(String[] strs) {
        
           if (strs == null || strs.length == 0) return "";

           //pointer iterate on each word separately
        
        for (int i = 0; i < strs[0].length() ; i++){
            
            char c = strs[0].charAt(i);
            
            //iterate on all the array
            for (int j = 1; j < strs.length; j ++) {
                //the second condition for not see the "
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
        
    }




#AnotherSolution





    class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        
        StringBuilder result=new StringBuilder();
        
        
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        
        
    for(int i=0;i<first.length;i++){
        
        if(first[i]!=last[i]){
            
            break;}
            
           result.append(first[i]);        
        
    }
        return result.toString();
    }
}
