class Solution {
    public int uniquePaths(int m, int n) {
        
//         int i=0,j=0;
        
//         if(i == (m-1) && j == (n-1)){
//             return 1;
//         }
//         if(i >= m || j >= n){
//             return 0;
//         }else{
//             return uniquePaths(i+1,j)+uniquePaths(i,j+1);
//         }
        
        int N = m+n-2;
        int r = m-1;
        double res = 1;
        
        for(int i=1;i<=r;i++){
            res = res * (N - r + i)/i;
        }
        return (int)res;
        
    }
}