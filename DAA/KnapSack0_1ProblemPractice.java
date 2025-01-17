package DAA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnapSack0_1ProblemPractice {

    public static int getMaximumProfit(int capacity, List<Item> itemList , int idx,int[][] dp)
    {
        //base
        if(idx>=itemList.size() || capacity==0)
        {
            return 0;
        }
        if(dp[idx][capacity]!=-1)
        {
            return dp[idx][capacity];
        }
        //if capacity kam hai toh skip karo
        if( itemList.get(idx).weight >capacity)
        {
            return dp[idx][capacity]= getMaximumProfit(capacity,itemList,idx+1,dp);
        }
        else
        {
            int takeProfit=itemList.get(idx).profit + getMaximumProfit(capacity-itemList.get(idx).weight,itemList,idx+1,dp);
            int notTakeProfit=getMaximumProfit(capacity,itemList,idx+1,dp);
            return  dp[idx][capacity]=  Math.max(takeProfit,notTakeProfit);
        }
    }

    public static void main(String[] args) {
        List<Item> itemList=new ArrayList<>();
        itemList.add(new Item(60,10));
        itemList.add(new Item(100,20));
        itemList.add(new Item(120,30));

        int n=itemList.size();
        int capacity=50;
        int[][] dp=new int[n+1][capacity+1];

        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }

        System.out.println(getMaximumProfit(capacity,itemList,0,dp));
    }
}
