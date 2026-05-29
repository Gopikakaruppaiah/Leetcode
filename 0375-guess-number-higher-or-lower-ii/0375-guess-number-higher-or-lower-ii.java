class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for(int len = 2; len <= n; len++) {
            for(int start = 1; start <= n - len + 1; start++) {
                int end = start + len - 1;
                dp[start][end] = Integer.MAX_VALUE;
                for(int piv = start; piv < end; piv++) {
                    int cost = piv + Math.max(dp[start][piv - 1],
                                              dp[piv + 1][end]);
                    dp[start][end] = Math.min(dp[start][end], cost);
                }
            }
        }

        return dp[1][n];
    }
}