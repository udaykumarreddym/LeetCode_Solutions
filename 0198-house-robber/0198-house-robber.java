class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return func(nums.length-1,nums,dp);
    }
    public int func(int n, int[] nums, int[] dp){
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        int left = nums[n] + func(n - 2,nums,dp);
        int right = func(n - 1,nums,dp);
        return dp[n] = Math.max(left,right);
    }
}