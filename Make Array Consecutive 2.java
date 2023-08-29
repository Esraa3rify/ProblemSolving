int solution(int[] statues) {
    

    Arrays.sort(statues);
   int n= statues.length;
    int number_of_added_elements=0;
    
    
    for(int i=0;i<n-1;i++){
        if(statues[i]+1!=statues[i+1]){
          number_of_added_elements += statues[i + 1] - statues[i] - 1;#Unclear

          
        }
    }
    
return number_of_added_elements;
}
