class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0,right = 0,maxLen = 0,cnt = 0;
        int[] freq = new int[26];
        while(right < n){
            freq[s.charAt(right) - 'A']++;
            cnt = Math.max(cnt,freq[s.charAt(right) - 'A']);
            if((right-left+1) - cnt > k){
                freq[s.charAt(left)-'A']--;
                left++;
            } 
            maxLen = Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}