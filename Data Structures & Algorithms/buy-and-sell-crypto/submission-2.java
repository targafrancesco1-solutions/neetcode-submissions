class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy + 1;
        int max = 0;
        int min = prices[0];
        while (sell < prices.length) {
            int currentProfit = prices[sell] - prices[buy];
            if (currentProfit > max) {
                max = currentProfit;
                sell++;
            } else if(prices[sell] < min){
                min = prices[sell];
                buy = sell;
                sell = buy+1;
            }else{
                sell++;
            }
            
        }

        return max;
    }
}
