class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> set1 = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(set1.contains(third)){
                    List<Integer> ls = new ArrayList<>(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(ls);
                    set.add(ls);
                }
                set1.add(nums[j]);
            }
        }
        ans.addAll(set);
        return ans;
    }
}