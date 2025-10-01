class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int cn = numBottles / numExchange;
            int rem = numBottles % numExchange;
            ans += cn;
            numBottles = cn + rem;
        }
        return ans;
    }
}