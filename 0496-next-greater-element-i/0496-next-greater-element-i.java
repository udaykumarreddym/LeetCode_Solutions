class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> nextgreater = new HashMap<>();

        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){
                nextgreater.put(stack.pop(),num);
            }
            stack.push(num);
        }
        while(!stack.isEmpty()){
            nextgreater.put(stack.pop(),-1);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = nextgreater.get(nums1[i]);
        }
        return res;
    }
}