package easy;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class BestTimeToBuyAndSell {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for ( int price : prices) {
            if ( price < min ){
                min = price;
            }
            profit = Math.max( price - min, profit);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println( new BestTimeToBuyAndSell().maxProfit(prices));
    }
}
