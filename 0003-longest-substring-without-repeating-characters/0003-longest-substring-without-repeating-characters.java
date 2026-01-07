class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0,r=0,maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                l = Math.max(map.get(s.charAt(r))+1,l);
            }
            maxLen = Math.max(r-l+1,maxLen);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxLen;
    }
}