class Solution {
    public boolean isValid(String s) {
    
    //If the number of elements in the string equal odd number(3,5.7...)

   if(s.length()%2 != 0)    
    {
        return false;
    }
    
    //create stack
    Stack<Character> stack = new Stack<>();
    
    for(char c : s.toCharArray())
    {    
          //fill the stack with the left part of the parentheses
        if(c=='(' || c=='{' || c=='[')
        {
            stack.push(c);
        }
        else
        {
        
        //check if the stack is empty, so return false
            if(stack.isEmpty())
            {
                return false;
            }
            //check if the top(peek that i pushed previously) equals the ( and the c or the current element i stand on == ), if true so remove the first parenses on the top
            if(c==')' && stack.peek()=='(' || c=='}' && stack.peek()=='{' || c==']' && stack.peek()=='[')
            {
                stack.pop();
            }
            else
            {
                return false;
            }
        }
    }
    
    //if the stack return empty, so each part of the parenthes found the other part
    return stack.isEmpty();
}

}
