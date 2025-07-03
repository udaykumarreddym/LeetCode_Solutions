class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int num:nums2){
            while(!st.isEmpty() && num > st.peek()){
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        int[] res = new int[nums1.length];
        int idx = 0;
        for(int num:nums1){
            if(map.containsKey(num)){
                res[idx++] = map.get(num);
            }else{
                res[idx++] = -1;
            }
        }
        return res;
    }
}


