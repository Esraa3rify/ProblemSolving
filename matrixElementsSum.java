int solution(int[][] matrix) {
    int cost=0;
    
    for (int rows=0; rows<matrix[0].length;rows++){
        for(int columns=0;columns<matrix.length;columns++){
            
            if(matrix[columns][rows]==0){
                break;  //skip
                
            }
            cost+=matrix[columns][rows];
            
        }
        
    }
    
    return cost;

}
