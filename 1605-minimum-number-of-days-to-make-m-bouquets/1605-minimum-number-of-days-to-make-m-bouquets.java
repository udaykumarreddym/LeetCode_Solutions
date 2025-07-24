class Solution {
    public int getBoqcnt(int[] a,int bd,int k){
        int boq = 0;
        int cnt = 0;
        for(int ls : a){
            if(ls <= bd) cnt++;
            else{
                boq += cnt/k;
                cnt = 0;
            }
        }
        boq += (cnt/k);
        return boq;
    }
    public int minDays(int[] a, int m, int k) {
        long flowers = (long)(m * k);
        if(flowers > a.length) return -1;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int fl : a){
            min = Math.min(min,fl);
            max = Math.max(max,fl);
        }
        int low = min;
        int high = max;
        int ans = -1;
        while(low <= high){
            int mid = low + ((high - low)/2);
            int boq = getBoqcnt(a,mid,k);
            if(boq >= m){
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