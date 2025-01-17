package Accenture_Revision;

import java.util.Arrays;

public class CoinsChange {

    public static int helper(int[] coins,int amount,int idx,int[]dp)
    {
        if(idx>=coins.length) return Integer.MAX_VALUE-1;
        if(amount==0) return 0;

        if(dp[amount]!=-1) return dp[amount];

        int take=Integer.MAX_VALUE-1;
        int notTake=Integer.MAX_VALUE-1;
        if(coins[idx]<=amount)
        {
            take=1+helper(coins,amount-coins[idx],idx,dp);
        }
        notTake = helper(coins,amount,idx+1,dp);

        return dp[amount]= Math.min(take,notTake);
    }
    public static int getMinimumNumberOfCoins(int[] coins,int amount)
    {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=helper(coins,amount,0,dp);
        return  ans==Integer.MAX_VALUE-1?-1:ans;
    }

    public static void main(String[] args) {
        int[] coins={5,5,5};
        System.out.println(getMinimumNumberOfCoins(coins,50));
    }
}
