class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n < 3){
            return false;
        }
        int i=0;
        boolean vowel = false;
        boolean consonant = false;
        while(i < n){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                i += 1;
            }else{
                return false;
            }
        }
        for(int j=0;j<n;j++){
            char ch = s.charAt(j);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                    vowel = true;
                }else{
                    consonant = true;
                }
            }
        }
        if(!vowel || !consonant){
            return false;
        }
        return true;
    }
}