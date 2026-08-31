package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;

import Recursion.Array;

import java.util.Arrays;

public class Maximum_Sum_Obtained_Of_Any_Permutation {
    public static int maxSumRangeQuery(int[] nums, int[][] requests) {

        //Will look for which inndex occurs the most in the request and try to do (maxIdx * max ele) + (secondMaxIdx * secondMaxEle) +.....and so on
        int MOD = 1_000_000_007;

        int n = nums.length;
        //this is the Diff array techniue which is subset of line sweep
        int[] diff = new int[n];
        for(int[] request:requests)
        {
            int l = request[0];
            int r = request[1];

            diff[l]+=1;
            if(r+1<n)
            {
                diff[r+1]-=1;
            }
        }
        //Find C-sum
        for(int i=1;i<n;i++)
        {
            diff[i] = diff[i] + diff[i-1];
        }

        Arrays.sort(diff);
        Arrays.sort(nums);
        //sorted in increasing order so start from last and try to multiply the most occured index with max element from nums
        long totalSum=0;
        for(int i=n-1;i>=0;i--)
        {
            long contrib = (long) nums[i] * diff[i];
            totalSum=(totalSum + contrib )  % MOD;
        }
        return (int)totalSum;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};

        int[][] requests = {{1,3},{0,1}};

        System.out.println(maxSumRangeQuery(nums,requests));

    }
}
