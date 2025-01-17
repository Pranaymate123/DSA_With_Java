package Accenture_Revision;

import java.util.Arrays;

public class House_Robber_DP {

    // Using DP + Recursion
    public static int helper(int[] arr,int idx,int[] dp)
    {
        if(idx>=arr.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take=arr[idx]+helper(arr,idx+2,dp);
        int notTake=helper(arr,idx+1,dp);

        return dp[idx]= Math.max(take,notTake);
    }
    public static int getMaximumAmount(int [] arr)
    {
        int[] dp=new int[arr.length+1];
        Arrays.fill(dp,-1);
        return helper(arr,0,dp);

    }


    //By Bottom up Approach

    public static int rob(int[] arr)
    {
        int take=arr[0];
        int notTake=0;
        int newTake=0;
        int newNotTake=0;

        for(int i=0;i<arr.length;i++)
        {
            newTake=arr[i]+notTake;
            newNotTake=Math.max(take,notTake);

            take=newTake;
            notTake=newNotTake;
        }
        return Math.max(take,notTake);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(getMaximumAmount(arr));

        System.out.println(rob(arr));
    }
}
