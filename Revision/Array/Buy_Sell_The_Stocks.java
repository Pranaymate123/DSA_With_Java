package Revision.Array;

public class Buy_Sell_The_Stocks {

    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }else
            {
                int profit=prices[i]-min;
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
