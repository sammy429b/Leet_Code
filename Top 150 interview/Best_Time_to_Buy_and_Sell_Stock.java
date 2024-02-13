public class Best_Time_to_Buy_and_Sell_Stock {
    class Solution {
        public int maxProfit(int[] prices) {
            // Check if prices array is null or has fewer than 2 elements
            if (prices == null || prices.length < 2)
                return 0; // If so, return 0 as there can't be any profit
    
            // Initialize variables to track minimum price and maximum profit
            int minPrice = prices[0];
            int maxProfit = 0;
    
            // Iterate through the prices array starting from the second element
            for (int i = 1; i < prices.length; i++) {
                // Check if the current price is less than the minimum price seen so far
                if (prices[i] < minPrice) {
                    minPrice = prices[i]; // Update the minimum price
                } else {
                    // Calculate the profit that could be obtained by selling at the current price
                    int currentProfit = prices[i] - minPrice;
                    // Update the maximum profit seen so far
                    maxProfit = Math.max(maxProfit, currentProfit);
                }
            }
    
            // Return the maximum profit
            return maxProfit;
        }
    }
    
}
