class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l=0,r=0,maxLen = 0,zcnt = 0;
        while(r<n){
            if(nums[r] == 0){
                zcnt += 1;
            }
            if(zcnt > k){
                if(nums[l] == 0){
                    zcnt--;
                }
                l++;
            }
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}