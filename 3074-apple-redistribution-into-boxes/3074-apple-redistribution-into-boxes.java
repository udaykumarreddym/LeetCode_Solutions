class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int appl : apple){
            sum += appl;
        }
        int cnt = 1;
        int m = capacity.length;
        Arrays.sort(capacity);
        for(int i=m-1;i>=0;i--){
            if(capacity[i] >= sum){
                break;
            }else{
                sum -= capacity[i];
                cnt++;
            }
        }
        return cnt;
    }
}