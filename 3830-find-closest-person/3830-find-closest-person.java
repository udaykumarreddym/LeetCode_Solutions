class Solution {
    public int findClosest(int x, int y, int z) {
        int adis = Math.abs(z-x);
        int bdis = Math.abs(z-y);
        return (adis < bdis) ? 1 : (adis == bdis) ? 0 : 2;
    }
}