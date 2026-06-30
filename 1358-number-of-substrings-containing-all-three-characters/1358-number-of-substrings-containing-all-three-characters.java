class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int n = s.length();
        int result = 0;
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            count[s.charAt(j) - 'a']++;
            
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += n - j;
                count[s.charAt(i) - 'a']--;
                i++;
            }
        }
        
        return result;
    }
}