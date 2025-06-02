class Solution {
    public boolean isPalindrome(int x) {
        int temp,rem,rev=0;
        temp = x;
        while(x>0){
            rem = x%10;
            rev = rev * 10 +rem;
            x = x/10;
        }
        if(rev == temp){
            return true;
        }
        else{
            return false;
        }
    }
}