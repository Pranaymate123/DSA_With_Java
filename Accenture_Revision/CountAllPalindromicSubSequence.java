package Accenture_Revision;

import java.util.Arrays;

public class CountAllPalindromicSubSequence {

    public static int solve(String str,int i,int j,int[][] dp)
    {
        if(i==j) return 1;

        if(i>j) return 0;

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(str.charAt(i)==str.charAt(j))
        {
            return 1+ solve(str,i+1,j,dp) + solve(str,i,j-1,dp);
        }
        else
        {
            return solve(str,i+1,j,dp) + solve(str,i,j-1,dp) - solve(str,i+1,j-1,dp);
        }
    }

    public static void main(String[] args) {
        String str="abcd";
        int[][] dp=new int[str.length()+1][str.length()+1];

        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        System.out.println(solve(str,0,str.length()-1,dp));
    }
}
