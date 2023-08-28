int solution(int n) {

var area = 1;
 for (var i = 1; i< n; i++){
area += 4 * i;
}
return area;
}
