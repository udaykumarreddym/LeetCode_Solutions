class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n+i;j++){
                if(nums[j%n] > nums[i]){
                    ans[i] = nums[j%n];
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }
}