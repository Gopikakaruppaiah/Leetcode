class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();

        if (n != goal.length()) {
            return false;
        }

        for (int start = 0; start < n; start++) {
            int j = 0;

            while (j < n && s.charAt((start + j) % n) == goal.charAt(j)) {
                j++;
            }

            if (j == n) {
                return true;
            }
        }

        return false;
    }
}