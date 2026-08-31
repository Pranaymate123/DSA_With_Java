package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Kadanes_Algorithm;

public class Maximum_SubArray_Sum {

    public static int maxSubArray(int[] nums) {
        int cSum=0;
        int maxSum=Integer.MIN_VALUE;

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
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
