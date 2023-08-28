int solution(int[] inputArray) {
  
int max_product=Integer.MIN_VALUE;

for (int i=0;i<inputArray.length-1;i++){
  
 int  product= inputArray[i]*inputArray[i+1];
  max_product=Math.max(product,max_product);
}

return max_product;

}
