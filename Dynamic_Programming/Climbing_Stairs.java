package Dynamic_Programming;

import java.util.Arrays;

public class Climbing_Stairs {

    public static int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }

    public static int solve(int n,int[] dp)
    {
        if(n==1 || n==0) return 1;

        if(dp[n]!=-1) return dp[n];

      int ways =solve(n-1,dp)+solve(n-2,dp);

      dp[n]=ways;
      return ways;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
