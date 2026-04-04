package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

public class Maximum_SubArray_Sun {

    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            //Start with fresh new Array if the sum of curr + prev is less than the curr element
            sum= Math.max(nums[i] , sum + nums[i]);
            maxSum= Math.max(maxSum,sum);
        }
        return  maxSum;
    }
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}
