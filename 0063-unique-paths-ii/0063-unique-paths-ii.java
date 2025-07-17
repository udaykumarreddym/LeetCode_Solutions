class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(m-1,n-1,obstacleGrid,dp);
    }
    public int fun(int m,int n,int[][] obstacleGrid,int[][] dp){
        if(m == 0 && n == 0 && obstacleGrid[m][n] == 1) return 0;
        if(m == 0 && n == 0 ) return 1;
        if(m < 0 || n < 0) return 0;
        if(obstacleGrid[m][n] == 1){
            dp[m][n] = 0;
            return 0;
        } 
        if(dp[m][n] != -1) return dp[m][n]; 
        int top = fun(m-1,n,obstacleGrid,dp);
        int right = fun(m,n-1,obstacleGrid,dp);
        return dp[m][n] = top+right;
    }
}