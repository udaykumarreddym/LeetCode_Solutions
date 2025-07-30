class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = 0;
        int lmax = 0;
        for(int i = 1;i<height.length;i++){
            left[i] = Math.max(lmax,height[i-1]);
            lmax = left[i];
        }
        right[height.length-1] = 0;
        int rmax = 0;
        for(int i=height.length-2;i>=0;i--){
            right[i] = Math.max(rmax,height[i+1]);
            rmax = right[i];
        }
        int sum = 0;
        for(int i=0;i<height.length;i++){
            int val = Math.min(left[i],right[i]) - height[i];
            if(val > 0){
                sum += val;
            }
        }
        return sum;
    }
}