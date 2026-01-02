class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        Arrays.sort(nums);
        int cnt = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                cnt += 1;
            }else{
                cnt = 1;
            }
            if(cnt == n){
                return nums[i];
            }
        }
        return -1;
    }
}