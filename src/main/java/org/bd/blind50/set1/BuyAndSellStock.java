package org.bd.blind50.set1;

public class BuyAndSellStock {

    public static int solve(int[] prices) {
        int profit= 0;
        int min = prices[0];
        for(int i=1; i<prices.length; i++) {
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min, prices[i]);
        }
        return profit;
    }

    //TC: 0(n);
    //SC: 0(1);

}
