class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0,r=0,maxLen=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r < n){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r)) + 1);
            }
            map.put(s.charAt(r),r);
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}