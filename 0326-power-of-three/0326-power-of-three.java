class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 0; i <= 19; i++) {
            if ((int) Math.pow(3, i) == n) {
                return true;
            }
        }
        return false;
    }
}