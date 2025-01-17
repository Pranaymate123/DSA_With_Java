package Backtracking_CodeStoryWithMik;

import java.util.Arrays;

public class Combinations_Sum_IV {


    public int combinationSum4(int[] nums, int target) {

        int[][] dp=new int[nums.length+1][target+1];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
       return solve(nums,target,0,dp);

    }

    public int solve(int[] nums,int target,int idx,int[][] dp)
    {

        if(target==0) return 1;
        if(idx>=nums.length || target<0)
        {
            return 0;
        }
        if(dp[idx][target]!=-1) return dp[idx][target];

        int take= solve(nums,target-nums[idx],0,dp);
        //not take

        int notTake= solve(nums,target,idx+1,dp);
        return dp[idx][target]=take+notTake;
    }


    public static void main(String[] args) {
        Combinations_Sum_IV obj=new Combinations_Sum_IV();
        int[] nums={2,1,3};
        System.out.println(obj.combinationSum4(nums,35));
    }
}
