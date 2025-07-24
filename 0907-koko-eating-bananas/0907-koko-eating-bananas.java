class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile:piles){
            max = Math.max(max,pile);
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            int hrs = 0;
            for(int j=0;j<piles.length;j++){
                hrs += Math.ceil((double)(piles[j])/mid);
            }
            if(hrs <= h){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}