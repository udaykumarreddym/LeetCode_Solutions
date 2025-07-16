class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n-1];
        Arrays.fill(dp,-1);
        int[] num1 = Arrays.copyOfRange(nums,0,n-1);
        int a = func(num1.length-1,num1,dp);
        Arrays.fill(dp,-1);
        int[] num2 = Arrays.copyOfRange(nums,1,n);
        int b = func(num2.length-1,num2,dp);
        return Math.max(a,b);
    }
    public int func(int n,int[] nums,int[] dp){
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        int left = nums[n] + func(n-2,nums,dp);
        int right = func(n - 1,nums,dp);
        return dp[n] = Math.max(left,right);
    }
}