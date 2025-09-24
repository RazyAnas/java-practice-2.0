package LeetCodeSolutions;

public class MaxStockProfit {

    public int maxProfit(int[] prices) {

        // given:
        // non sorted array of prices
        // we want maximum profit by choosing "single day" to buy one stock
        // and choosing different day in future to sell the stock

        // what to do?:
        // maximum profit you can achieve from transaction
        // if no profit return zero
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
