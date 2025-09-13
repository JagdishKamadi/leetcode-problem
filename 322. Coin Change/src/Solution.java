class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }

        int[] minsDp = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            minsDp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && minsDp[i - coin] != Integer.MAX_VALUE) {
                    minsDp[i] = Math.min(minsDp[i], 1 + minsDp[i - coin]);
                }
            }
        }

        return minsDp[amount] == Integer.MAX_VALUE ? -1 : minsDp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 6, 9};
        int amount = 19;
        System.out.println(new Solution().coinChange(coins, amount));
    }
}