class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a1 = (int)coordinate1.charAt(0) - 'a'+1;
        int a2 = (int)coordinate1.charAt(1) - '1'+1;
        int b1 = (int)coordinate2.charAt(0) - 'a'+1;
        int b2 = (int)coordinate2.charAt(1) - '1'+1;
        if((a1 + a2 + b1 + b2) % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}