class Solution {
    public int[] plusOne(int[] digits) {
      
      int n=digits.length;
      //make the pointer start the loop from the end of the array
      for(int i=n-1;i>=0;i--){
          //check if the last number less than 9
          if(digits[i]<9){
          //so this the default way, increase the one    
              digits[i]++;
              return digits;

          }
          digits[i]=0;
      }
       //this array mean if the array have thousands or have 4 elements
       int [] newNumber=new int[n+1];
       //1000
       newNumber[0]=1;
       return newNumber;
        
    }
}



class Solution {
    public int[] plusOne(int[] digits) {
        

for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
        
    }
}
