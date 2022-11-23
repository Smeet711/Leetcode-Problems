class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        int[][] paths = new int[n][m];
        
        for(int i=0;i<n;i++){
            if(obstacleGrid[i][0] == 1){
                paths[i][0] = 0;
                break;
            }else{
                paths[i][0] = 1;
            }
        }
        
        for(int j=0;j<m;j++){
            if(obstacleGrid[0][j] == 1){
                paths[0][j] = 0;
                break;
            }else{
                paths[0][j] = 1;
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(obstacleGrid[i][j] == 1){
                    paths[i][j] = 0;
                }else{
                    paths[i][j] = paths[i-1][j]+paths[i][j-1];
                }
            }
        }
        
        
        
        return paths[n-1][m-1];
        
        
        
    }
}