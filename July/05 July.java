// Stock buy and sell II
class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
    int count = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1])
                count += Math.abs(prices[i] - prices[i+1]);
        }
        return count;
    }
}