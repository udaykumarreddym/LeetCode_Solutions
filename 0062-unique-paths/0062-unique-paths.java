class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return fun(m - 1, n - 1, dp);
    }

    public int fun(int m, int n, int[][] dp) {
        if (m == 0 && n == 0)
            return 1;
        if (m < 0 || n < 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        int up = fun(m - 1, n, dp);
        int left = fun(m, n - 1, dp);
        return dp[m][n] = up + left;
    }
}