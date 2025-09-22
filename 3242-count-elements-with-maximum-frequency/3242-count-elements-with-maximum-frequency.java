class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0,ans = 0;
        for(int key : map.keySet()){
            int cnt = map.get(key);
            if(cnt>max){
                max = map.get(key);
                ans = max;
            }else if(cnt == max){
                ans += cnt;
            }
        }
        return ans;
    }
}