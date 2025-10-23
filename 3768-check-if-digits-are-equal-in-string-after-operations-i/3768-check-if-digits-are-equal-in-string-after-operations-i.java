class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = s.charAt(i) - '0';
        }
        while (n > 2) {
            int[] newDigits = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                newDigits[i] = (digits[i] + digits[i + 1]) % 10;
            }
            digits = newDigits;
            n--;
        }
        return digits[0] == digits[1];
    }
}