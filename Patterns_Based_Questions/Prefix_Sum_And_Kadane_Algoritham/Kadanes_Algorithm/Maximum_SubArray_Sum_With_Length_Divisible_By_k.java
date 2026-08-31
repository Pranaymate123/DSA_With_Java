package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Kadanes_Algorithm;

import java.util.Arrays;

public class Maximum_SubArray_Sum_With_Length_Divisible_By_k {

    public static long maxSubarraySum(int[] nums, int k) {
       int n=nums.length;
       long[] pSum = new long[n];
       pSum[0]=nums[0];
       for(int i=1;i<n;i++)
       {
           pSum[i]=pSum[i-1]+nums[i];
       }

        long result = Long.MIN_VALUE;
       for(int start=0;start<k;start++)
       {
           long currSum=0;
           int i=start;

           while (i<n && i+k-1<n)
           {
               int j=i+k-1;

               long subSum = pSum[j] - ((i==0)?0:pSum[i-1]);
               currSum = Math.max(subSum, subSum + currSum);
               result=Math.max(result,currSum);
               i=i+k;
           }
       }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(maxSubarraySum(nums,4));

    }
}
