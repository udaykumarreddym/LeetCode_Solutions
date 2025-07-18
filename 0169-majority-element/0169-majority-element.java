class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnd = nums[0];
        int cnt = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == cnd){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt == 0){
                cnd = nums[i];
                cnt = 1;
            }
        }
        return cnd;
    }
}