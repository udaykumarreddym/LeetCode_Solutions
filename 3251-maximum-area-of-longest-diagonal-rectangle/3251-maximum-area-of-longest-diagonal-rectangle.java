class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = Integer.MIN_VALUE;
        float dia = 0;
        for(int[] arr : dimensions){
            float a = (float) Math.sqrt( (arr[0]*arr[0]) + (arr[1]*arr[1]) );
            int area = arr[0] * arr[1];
            if(a > dia){
                ans = area;
                dia = a;
            }else if(a == dia){
                ans = Math.max(ans,area);
            }
        }
        return ans;
    }
}