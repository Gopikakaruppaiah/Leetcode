class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            String res = "";
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (j < s.length() - 1 && s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    res = res + count + s.charAt(j);
                    count = 1;
                }
            }
            s = res;
        }
        return s;
    }
}