class Solution {
    public String addBinary(String a, String b) {

//use string builder to allow to deal with strings and reverse and convert to string.
         StringBuilder result = new StringBuilder();
         //cause I want to iterate throught the string 
         int i=a.length()-1;
         int j=b.length()-1;

         //in most of the summation problems we should think about carry
         int carry=0;

         while(i>=0 || j>=0){

            int sum=carry;
            //this way helped me to put the two values in the same value
            if (i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';
            //we will put the sum after think about the edge case(2)
            result.append(sum%2);
           ///if sum =1+1=2 so carry =0
            carry=sum/2;

            i--;
            j--;


         }

         if(carry!=0) result.append(carry);
         return result.reverse().toString();
        
    }
}
