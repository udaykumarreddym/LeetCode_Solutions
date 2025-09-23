class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fir = first(nums,target);
        int las = last(nums,target);
        return new int[]{fir,las};

    }
    private static int first(int[] nums,int target){
        int start = 0,end = nums.length-1,ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    private static int last(int[] nums,int target){
        int start = 0,end = nums.length-1,ans = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}