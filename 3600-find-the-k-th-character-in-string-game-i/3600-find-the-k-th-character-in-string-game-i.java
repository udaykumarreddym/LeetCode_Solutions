class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while (word.length() < k) {
            StringBuilder newString = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                char next = (char) (((ch - 'a' + 1) % 26) + 'a'); // Fix here
                newString.append(next);
            }
            word += newString.toString();
        }
        return word.charAt(k - 1);
    }
}