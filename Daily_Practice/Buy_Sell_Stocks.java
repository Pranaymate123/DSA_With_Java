package Daily_Practice;

import java.util.Arrays;

public class Buy_Sell_Stocks {

    public static int maxProfit(int[] prices) {


        int n = prices.length;

        int min= Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else{
                int profit = prices[i] - min;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
//        int n= prices.length;
//
//        int[] mins=new int[n];
//        int[] maxs = new int[n];
//        int min_ele=prices[0];
//        mins[0]=min_ele;
//        for(int i=1;i<n;i++)
//        {
//            if(prices[i] < min_ele)
//            {
//                mins[i]=prices[i];
//                min_ele=prices[i];
//            }
//            else{
//                mins[i]=min_ele;
//            }
//        }
//
//        int max_ele = prices[n-1];
//        maxs[n-1] = prices[n-1];
//        for(int i=n-1;i>=0;i--)
//        {
//            if(prices[i] > max_ele)
//            {
//                maxs[i]=prices[i];
//                max_ele=prices[i];
//            }
//            else{
//                maxs[i]=max_ele;
//            }
//        }
//
//
//        int maxProfit = 0;
//
//        for(int i=0;i<n;i++)
//        {
//            maxProfit=Math.max(maxs[i] - mins[i]  , maxProfit);
//        }
//
//        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(  maxProfit(prices));


    }
}
