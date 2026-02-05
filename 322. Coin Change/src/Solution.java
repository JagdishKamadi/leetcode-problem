class Solution {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 18;

        System.out.println(new Solution().coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }

        int[] minsCoin = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            minsCoin[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && minsCoin[i - coin] != Integer.MAX_VALUE) {
                    minsCoin[i] = Math.min(minsCoin[i], 1 + minsCoin[i - coin]);
                }
            }
        }

        if (minsCoin[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return minsCoin[amount];
    }
}