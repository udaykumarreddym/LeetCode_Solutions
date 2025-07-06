class FindSumPairs {
    private int[] nums1,nums2;
    private Map<Integer,Integer> map ;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();
        for(int num : nums2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldval = nums2[index];
        int newval = oldval + val;
        map.put(oldval,map.get(oldval)-1);
        if (map.get(oldval) == 0) {
            map.remove(oldval);
        }
        nums2[index] = newval;
        map.put(newval,map.getOrDefault(newval,0)+1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int num:nums1){
            int com = tot - num;
            count += map.getOrDefault(com,0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */