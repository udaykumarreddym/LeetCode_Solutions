class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String color1 = color(coordinate1);
        String color2 = color(coordinate2);
        return color1 == color2;
    }
    public String color(String s){
        int al = (int)s.charAt(0)-'a'+1;
        int di = (int)s.charAt(1)-'1'+1;
        if((al + di) % 2 == 0){
            return "black";
        }else{
            return "white";
        }
    }
}