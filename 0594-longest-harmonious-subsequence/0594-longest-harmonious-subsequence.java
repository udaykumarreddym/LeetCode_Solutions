class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        int n  = nums.length;
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxLen = 0;
        for(int key : freq.keySet()){
            if(freq.containsKey(key + 1)){
                int len = freq.get(key) + freq.get(key + 1);
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}