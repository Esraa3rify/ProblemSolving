class Solution {
    public
     int longestConsecutive(int [] nums) {

        //create the hash set

         Set<Integer>HashSet=new HashSet<Integer>();

        for( int num:nums){
            HashSet.add(num);
        }

      
      int longestConsecutive=0;


      //check if the first starting point doesnot exist 
      for(int num:nums){
          if(!HashSet.contains(num-1)){
              //so the starting point is the element you stand on
              int currentNum=num;
              int currentConsecutive=1;
          

          while(HashSet.contains(currentNum+1)){
              currentNum+=1;
              currentConsecutive+=1;

          }

          longestConsecutive=Math.max(longestConsecutive,currentConsecutive);

      }

      }
        return longestConsecutive;
        
    }
}
