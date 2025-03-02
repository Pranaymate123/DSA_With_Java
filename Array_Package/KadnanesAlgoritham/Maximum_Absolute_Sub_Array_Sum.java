package Array_Package.KadnanesAlgoritham;

public class Maximum_Absolute_Sub_Array_Sum {
    public static int maxAbsoluteSum(int[] nums) {
        int maxSum=Math.abs(getMaximumSubArraySum(nums));
        int minSum=Math.abs(getMinimumSubArraySum(nums));


        return Math.max(maxSum, minSum);
    }

    public static int getMinimumSubArraySum(int[] nums)
    {
        int minSum=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            sum=Math.min(nums[i],sum+nums[i]);
            minSum=Math.min(minSum,sum);
        }
        return minSum;
    }
    public static int getMaximumSubArraySum(int[] nums)
    {
        int maxSum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           sum=Math.max(nums[i],sum+nums[i]);
           maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={2,-5,1,-4,3,-2};


        System.out.println(maxAbsoluteSum(nums));
    }
}
