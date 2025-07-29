class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0]+nums[1];
        int b = nums[1]+nums[2];
        int c = nums[0]+nums[2];
        if(a <= nums[2] || b <= nums[0] || c <= nums[1]){
            return "none";
        }
        if((a == b) && (b == c) && (a == c)){
            return "equilateral";
        }else if((a == b) || (b == c) || (a == c)){
            return "isosceles";
        }
        else if((a != b) && (a != c) && (b != c)){
            return "scalene";
        }
        return "none";
    }
}