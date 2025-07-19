class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = calculate(slow);
            fast = calculate(calculate(fast));
            if(slow == 1 || fast == 1) return true;
        }while(slow != fast);
        return false;
    }
    public int calculate(int n){
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += (rem * rem);
            n /= 10;
        }
        return sum;
    }
}