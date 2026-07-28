package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

public class Best_Time_To_Buy_And_Sell_Stocks {

    public static int maxProfit(int[] prices) {

        //Keep track of minimum price
        // calculaye the profit current price - min price
        //update the maxProfit
        int maxProfit = 0;
        int n = prices.length;
        int minPrice = prices[0];
        for(int i=0;i<n;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit , prices[i]-minPrice);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
