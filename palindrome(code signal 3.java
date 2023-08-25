boolean solution(String inputString) {
     StringBuilder sb=new StringBuilder(inputString);  
      
    if( sb.toString().equals(sb.reverse().toString())){
           return true;

    }

    else{
       return false;
    }
}
