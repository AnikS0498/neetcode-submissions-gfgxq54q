class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            var temp = i;

            for (int coin : coins) {
                if (coin <= temp && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(1 + dp[i - coin], dp[i]);
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[amount];
    }
}
