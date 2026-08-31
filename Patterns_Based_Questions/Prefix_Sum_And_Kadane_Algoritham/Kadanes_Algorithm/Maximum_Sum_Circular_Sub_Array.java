package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Kadanes_Algorithm;

public class Maximum_Sum_Circular_Sub_Array {

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum=0;
        for(int n:nums)
        {
            totalSum+=n;
        }

        int maxSum = getMaximumSubArraySum(nums);
        int minSum = getMinimumSubArraySum(nums);

        if(maxSum>0)
            return  Math.max(maxSum,totalSum-minSum);
        else
            return maxSum;
    }

    public static int getMaximumSubArraySum(int[] nums)
    {
        int n = nums.length;
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++)
        {
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0)
            {
                currSum=0;
            }
        }

        return maxSum;
    }

    public static int getMinimumSubArraySum(int[] nums)
    {
        int n = nums.length;
        int minSum = Integer.MAX_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++)
        {
            currSum+=nums[i];
            minSum=Math.min(minSum,currSum);

            if(currSum>0)
            {
                currSum=0;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = {-3,-2,-3};

        System.out.println(maxSubarraySumCircular(nums));
    }
}
