class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int minval = nums[0];
        int maxDiff = -1;
        for(int i=1;i<n;i++){
            if(nums[i] > minval){
                maxDiff = Math.max(maxDiff,nums[i]-minval);
            }else{
                minval = nums[i];
            }
        }
        return maxDiff;
    }
}