class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        if(x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        if(y > x){
            while(y > 0){
                int xrem = x % 2;
                int yrem = y % 2;
                if(xrem != yrem){
                    ans++;
                }
                y /= 2;
                x /= 2;
            }
        }
        return ans;
    }
}