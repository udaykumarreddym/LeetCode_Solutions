class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k == 0) return 0;
        int ans = 0;
        while(k > 0){
            if(numOnes > 0){
                ans += 1;
                numOnes -= 1;
            }else if(numZeros > 0){
                ans += 0;
                numZeros -= 1;
            }
            else{
                ans += (-1);
                numNegOnes -= 1;
            }
            k--;
        }
        return ans;
    }
}