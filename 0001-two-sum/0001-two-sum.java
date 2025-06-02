class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int needed = target - num;
            if (mpp.containsKey(needed)) {
                ans[0] = mpp.get(needed);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);
        }
        return ans;
    }
}