class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ind = 0;
        int[][] res = new int[n/3][3];
        for(int i=0;i<n;i+=3){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if(c - a > k){
                return new int[0][0];
            }
            res[ind][0] = a;
            res[ind][1] = b;
            res[ind][2] = c;
            ind++;
        }
        return res;
    }
}