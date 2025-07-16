class Solution {
    public int maximumLength(int[] nums) {
        int evenCount = 0, oddCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        int maxAltLen = 1;
        int lastParity = nums[0] % 2;
        int altLen = 1;
        for (int i = 1; i < nums.length; i++) {
            int currParity = nums[i] % 2;
            if (currParity != lastParity) {
                altLen++;
                lastParity = currParity;
            }
        }
        return Math.max(altLen, Math.max(evenCount, oddCount));
    }
}