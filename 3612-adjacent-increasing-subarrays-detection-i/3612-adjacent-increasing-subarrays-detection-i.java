class Solution {
    private boolean isStrictlyIncreasing(List<Integer> nums, int start, int k) {
        for (int i = start; i < start + k - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for (int a = 0; a <= n - 2 * k; a++) {
            if (isStrictlyIncreasing(nums, a, k) && isStrictlyIncreasing(nums, a + k, k)) {
                return true;
            }
        }

        return false;
    }
}
