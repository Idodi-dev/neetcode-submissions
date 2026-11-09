class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int buyPrice = Integer.MAX_VALUE;
        int currSell = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++) {
            int todayPrice = prices[i];
            if(todayPrice < buyPrice) {
                buyPrice = todayPrice;
                currSell = todayPrice;
            } else if (todayPrice > currSell) {
                currSell = todayPrice;

                if(currSell - buyPrice > maxProfit) {
                    maxProfit = currSell - buyPrice;
                }
            }
        }

        return maxProfit;
    }
}
