//There are some techniques i follow during the solution.
//firstly, put a plan to find the solution -> my plan is to read the problem statement and understand it deepely
//then try to restate the problem or look at it from another view..reduce the problem to subproblems
//then, start to write the code
//seconly, i usually begin by put a constraints to my solution so that is simplify the idea for me
//thirdly,get the oposite of the input and begin to organize the solution according to it



class Solution {
    public boolean isPalindrome(int x) {
       
      //put an constraint to my solution
        if(x<0) return false;
      
       //create an variable to put the value of my input into it
          int number=x;
      //create a variable to put the reversed num into it
          int reversed=0;

          while(x !=0){
             //that is  a mathematical approach that help me separate ech element of the numer individually
              reversed=x%10 + reversed*10;
              x/=10;
          }
          
           //compare the two variables, that will return a boolean to me
          return number == reversed;


          }


        
    }
