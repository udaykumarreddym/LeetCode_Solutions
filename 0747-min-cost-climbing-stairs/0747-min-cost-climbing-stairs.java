class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(rec(cost,dp, n - 1), rec(cost,dp, n - 2));
    }
    static int rec(int[] cost,int[] dp, int n){
        if(n == 0 || n == 1) return cost[n];
        if(dp[n] != -1) return dp[n];
        int a = cost[n]+rec(cost,dp,n-1);
        int b = cost[n]+rec(cost,dp,n-2);
        return dp[n] = Math.min(a,b); 
    }
}