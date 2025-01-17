package Dynamic_Programming;

import java.util.Arrays;

public class Count_All_Paindromic_SubSequenece {

    public static int solve(int i,int j,char [] arr,int[][] dp)
    {
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(arr[i]==arr[j])
        {
          int val= 1+solve(i+1,j,arr,dp) + solve(i,j-1,arr,dp);
          dp[i][j]=val;
          return val;
        }
        int val2= solve(i+1,j,arr,dp) + solve(i,j-1,arr,dp) -solve(i+1,j-1,arr,dp);
        dp[i][j]=val2;
        return val2;
    }
    public static int getCountOfAllPalindromicSubsequnce(String str)
    {
        int n=str.length();
        char [] arr=str.toCharArray();
        int[][] dp=new int[n][n];
        for(int[] subDp:dp)
        {
            Arrays.fill(subDp,-1);
        }
        return solve(0,arr.length-1,arr,dp);
    }

    public static void main(String[] args) {
        String str="aba";
        System.out.println(getCountOfAllPalindromicSubsequnce(str));
    }
}
