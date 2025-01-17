package Recursion.CodeStoryWithMik;

import java.util.Arrays;

public class Regular_Expression_Matching {

    public static boolean isMatch(String s, String p) {

        int[][] dp=new int[s.length()+1][p.length()+1];
        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        return solve(s,p,0,0,dp);
    }

    public static boolean solve(String s,String p,int i,int j,int[][] dp) {
        if(j==p.length())
        {
            return i== s.length();
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j]==1;
        }

        boolean firstCharMatched =false;
        if(  i<s.length() && ( p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'))
        {
            firstCharMatched=true;
        }

        if((j+1) < p.length() && p.charAt(j+1)=='*')
        {
            boolean notTake=solve(s,p,i,j+2,dp);
            boolean take=firstCharMatched && solve(s,p,i+1,j,dp);

            boolean ans=(notTake||take);
            dp[i][j]=ans?1:0;
            return ans;
        }
        boolean ans=(firstCharMatched && solve(s,p,i+1,j+1,dp));
        dp[i][j]=ans?1:0;
        return ans;

    }
    public static void main(String[] args) {
        String s="aaab";
        String p="a*b";

        System.out.println(isMatch(s,p));
    }
}
