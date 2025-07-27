class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> fil = new ArrayList<>();
        fil.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
                fil.add(nums[i]);
            }
        }
        int cnt = 0;
        for(int i=1;i<fil.size()-1;i++){
            int left = fil.get(i-1);
            int curr = fil.get(i);
            int right = fil.get(i+1);
            if((curr > left && curr > right) || (curr < left && curr < right)){
                cnt++;
            }
        }
        return cnt;
    }
}