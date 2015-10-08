package DP;

/**
 * Created by guangshuozang on 10/7/15.
 */
public class BestTimeToBuyStock_121 {
    public int maxProfit(int[] prices) {
        int max=0;
        if(prices.length==0)
            return max;
        int min = prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]-min>max)
                max=prices[i]-min;
            if(prices[i]<min)
                min = prices[i];
        }
        return max;
    }
}
