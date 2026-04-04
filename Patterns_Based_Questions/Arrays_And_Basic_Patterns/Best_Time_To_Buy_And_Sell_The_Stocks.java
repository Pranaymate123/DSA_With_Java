package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

public class Best_Time_To_Buy_And_Sell_The_Stocks {

    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for(int i=0;i<prices.length;i++)
//        {
//            for(int j=i+1;j<prices.length;j++)
//            {
//                maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
//            }
//        }
//        return  maxProfit;

        int n= prices.length;

        int maxProfit = 0;
        int profit = 0;
        int min=prices[0];

        for(int i=0;i<n-1;i++)
        {
            if(prices[i+1] > min)
            {
                profit = prices[i+1] - min;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                min= prices[i+1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr= {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));

    }
}
