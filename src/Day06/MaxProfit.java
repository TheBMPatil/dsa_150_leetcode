package Day06;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
//        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit : " + getMaxProfit(prices));


    }
    static int getMaxProfit(int[] days) {
        if (days == null || days.length < 2) {
            return 0; // No profit can be made
        }

        int minPrice = days[0]; // Minimum price so far
        int maxProfit = 0;      // Maximum profit calculated so far

        for (int i = 1; i < days.length; i++) {
            if (days[i] - minPrice > maxProfit) {
                maxProfit = days[i] - minPrice; // Update max profit
            }
            if (days[i] < minPrice) {
                minPrice = days[i]; // Update minimum price
            }
        }

        return maxProfit;
    }

//    static int getMaxProfit(int[] days) {
//        int max = days[0], maxIn = -1;
//        int min = days[0], minIn = -1;
//        for (int i = 1; i < days.length; i++) {
//            if (days[i] > max) {
//                max = days[i];
//                maxIn = i;
//            } else if (days[i] < min) {
//                min = days[i];
//                minIn = i;
//            }
//        }
//        if (minIn < maxIn && (maxIn != -1 && minIn != -1)) {
//            return max - min;
//        } else return 0;
//    }
}
