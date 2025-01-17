package Dynamic_Programming;

import java.util.Arrays;

public class Longest_Increasing_SubSequence {

    public static int solve(int[] nums,int idx,int prevIdx,int[][] dp)
    {
        if(idx>=nums.length) return 0;
        if( prevIdx!=-1 && dp[idx][prevIdx]!=-1) return dp[idx][prevIdx];
        int pick=0;
        int skip=0;
        if(prevIdx==-1 || nums[prevIdx]<nums[idx])
        {

            pick=1+solve(nums,idx+1,idx,dp);
        }
        skip=solve(nums,idx+1,prevIdx,dp);

        if(prevIdx==-1)
        {
            return Math.max(pick,skip);
        }
        return dp[idx][prevIdx]= Math.max(pick,skip);
    }
    public static int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length+1][nums.length+1];
        for(int[] e:dp)
        {
            Arrays.fill(e,-1);
        }
        return solve(nums,0,-1,dp);
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,2,3};
        System.out.println(lengthOfLIS(nums));
    }
}
