class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean heavy = false;
        boolean bulky = false;
        if(mass >= 100){
            heavy = true;
        }
        double vol = (double)length * width * height;
        if(length >= 10000 || width >= 10000 || height == 10000 || vol >= 1000000000){
            bulky = true;
        }
        if(heavy == true && bulky == true){
            return "Both";
        }else if(heavy == true && bulky == false){
            return "Heavy";
        }else if(heavy == false && bulky == true){
            return "Bulky";
        }else{
            return "Neither";
        }
    }
}