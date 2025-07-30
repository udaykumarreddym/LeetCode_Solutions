class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int cur = 0, ans = 0;
        for(int num : nums){
            if(num == max){
                cur++;
                ans = Math.max(ans,cur);
            }else{
                cur = 0;
            }
        }
        return ans;
    }
}