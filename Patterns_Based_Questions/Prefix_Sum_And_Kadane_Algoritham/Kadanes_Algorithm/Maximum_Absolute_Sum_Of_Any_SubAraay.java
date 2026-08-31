package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Kadanes_Algorithm;

public class Maximum_Absolute_Sum_Of_Any_SubAraay {

    public static int maxAbsoluteSum(int[] nums) {

        int cMaxSum=0;
        int maxSum=0;

        int cMinSum=0;
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cMaxSum+=nums[i];
            maxSum=Math.max(cMaxSum,maxSum);
            if(cMaxSum<0)
            {
                cMaxSum=0;
            }

            cMinSum+=nums[i];
            minSum=Math.min(minSum,cMinSum);
            if(cMinSum>0)
            {
                cMinSum=0;
            }

        }
        return Math.max(maxSum,Math.abs(minSum));
    }

    /*
    public static int maxAbsoluteSum(int[] nums) {

        int maxSum=findMaxSum(nums);
        int minSum = Math.abs(findMinSum(nums));
        return Math.max(maxSum,minSum);
    }

    public static int findMinSum(int[] nuns)
    {
        int cSum=0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<nuns.length;i++)
        {
            cSum+=nuns[i];
            minSum=Math.min(minSum,cSum);
            if(cSum>0)
            {
                cSum=0;
            }
        }
        return minSum;
    }
    public static int findMaxSum(int[] nums)
    {
        int cSum=0;
        int maxSum=0;
        for(int i=0;i<nums.length;i++)
        {
            cSum+=nums[i];
            maxSum=Math.max(cSum,maxSum);
            if(cSum<0)
            {
                cSum=0;
            }
        }
        return maxSum;
    }

     */
    public static void main(String[] args) {
        int[] nums={1,-3,2,3,-4};

        System.out.println(maxAbsoluteSum(nums));
    }
}
