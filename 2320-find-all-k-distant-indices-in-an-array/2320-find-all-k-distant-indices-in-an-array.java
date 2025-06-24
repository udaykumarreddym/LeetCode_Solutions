class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Collect indices where nums[i] == key
        List<Integer> keyIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        // Step 2: For each index in keyIndices, add all indices within k distance
        Set<Integer> resultSet = new HashSet<>();
        for (int keyIndex : keyIndices) {
            int start = Math.max(0, keyIndex - k);
            int end = Math.min(nums.length - 1, keyIndex + k);
            for (int i = start; i <= end; i++) {
                resultSet.add(i);
            }
        }

        // Step 3: Convert set to sorted list
        result.addAll(resultSet);
        Collections.sort(result);
        return result;
    }
}
