class Solution {
    public int maxProfit(int[] prices) {

        int prof = 0;
        int l = 0;
        int r = 1;

        while(r < prices.length) {
            if(prices[r] - prices[l] > 0) {
                prof = Math.max(prof, prices[r] - prices[l]);
            } else {
                l = r;
            }
            r++;
        }

        return prof;
    }
}
