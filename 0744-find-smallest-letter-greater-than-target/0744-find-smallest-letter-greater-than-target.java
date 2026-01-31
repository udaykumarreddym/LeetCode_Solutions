class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = '{'; 

        for (char c : letters) {
            if (c > target && c < ans) {
                ans = c;
            }
        }

        return ans == '{' ? letters[0] : ans;
    }
}