class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while(word.length() < k){
            String newString = "";
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                char next = (char)((ch-'a' + 1) % 26 + 'a');
                newString += next;
            }
            word += newString;
        }
        return word.charAt(k-1);
    }
}