class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> temp = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            temp.add(nums1[i]);
        }
        Set<Integer> temp1 = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(temp.contains(nums2[i])){
                temp1.add(nums2[i]);
            }
        }
        int[] result = new int[temp1.size()];
        int i = 0;
        for(int num:temp1){
            result[i++] = num; 
        }
        return result;
    }
}