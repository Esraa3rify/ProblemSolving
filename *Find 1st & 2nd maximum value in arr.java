// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;

      //sorting the arr from smaller to greater
      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){
      //swaping the j in place of i 
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
    
        
        System.out.println("The result is " + array[size-1]+ " "+ array[size-2]);
    }
}



//to improve my code and make it more efficient-> we should avoid nested loop
//so we will use built in function called sort()


// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;
    
              Arrays.sort(array);

        System.out.println("Hello World!" + array[size-1]+ " "+ array[size-2]);
    }
}


//if you want to find maximum or minimum firstly think about sorting.
