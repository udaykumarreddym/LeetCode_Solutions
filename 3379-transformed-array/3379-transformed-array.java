class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                res[idx++] = nums[(i+nums[i]) % n];
            }else if(nums[i] < 0){
                res[idx++] = nums[(i - Math.abs(nums[i]) % n + n) % n];
            }else{
                res[idx++] = nums[i];
            }
        }
        return res;
    }
}