package Day07;

public class StocksBuySell2 {

    public static void main(String[] args) {
//        int[] prices = {7, 6, 4, 3, 1};
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit : " + maxProfit(prices));


    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
