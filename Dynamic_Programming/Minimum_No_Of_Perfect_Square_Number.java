package Dynamic_Programming;

import java.util.Arrays;

public class Minimum_No_Of_Perfect_Square_Number {

//    public static int solve(int num,int[] squares,int idx,int[] dp)
//    {
//        if(num==0) return 0;
//        if(idx>=squares.length) return Integer.MAX_VALUE-1;
//
//        if(dp[num]!=-1) return dp[num];
//
//        int pick=Integer.MAX_VALUE-1;
//        int notpick=Integer.MAX_VALUE-1;
//        if(num>=squares[idx])
//        {
//            // pick
//            pick=1+solve(num-squares[idx],squares,idx,dp);
//        }
//        //not pick
//        notpick=solve(num,squares,idx+1,dp);
//
//        return dp[num]= Math.min(pick,notpick);
//    }
//    public static int getMinimumNoOfPerfectSquareNumber(int num)
//    {
//        int val=(int)Math.sqrt(num);
//        int [] squares=new int[val];
//        int[] dp=new int[num+1];
//        Arrays.fill(dp,-1);
//        for(int i=0;i<val;i++)
//        {
//            squares[i]=(i+1)*(i+1);
//        }
//
//        return solve(num,squares,0,dp);
//    }


    ///Without Recursion
        public static int getMinimumNoOfPerfectSquareNumber(int num)
    {
        int val=(int)Math.sqrt(num);
        int [] squares=new int[val];
        for(int i=0;i<val;i++)
        {
            squares[i]=(i+1)*(i+1);
        }

        int []dp=new int[num+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int pick=0;
        for(int i=1;i<dp.length;i++)
        {
            pick=Integer.MAX_VALUE;
            for(int sq:squares)
            {
                if(sq<=i && dp[i-sq] !=Integer.MAX_VALUE)
                {
                    pick=Math.min(pick,1+dp[i-sq]);
                }
            }
            dp[i]=pick;
        }
        System.out.println( Arrays.toString(dp));
        return pick;
    }
    public static void main(String[] args) {
        System.out.println(getMinimumNoOfPerfectSquareNumber(12));
    }
}
