class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int l=0,r=0;
        while(r < n){
            if(arr[s.charAt(r)] >= l){
                l = Math.max(arr[s.charAt(r)]+1,l);
            }
            maxLen = Math.max(r-l+1,maxLen);
            arr[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}