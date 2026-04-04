package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

import java.util.Arrays;

public class Find_Pivot_Index {

    public static int pivotIndex(int[] nums) {
//        int n = nums.length;
//        int[] leftSum = new int[n] ;
//        int[] rightSum = new int[n] ;
//
//        leftSum[0] = 0;
//        rightSum[n-1] = 0;
//
//        for(int i=0;i<nums.length-1;i++)
//        {
//            leftSum[i+1] = leftSum[i] + nums[i];
//        }
//
//        for(int i= n-1;i>0;i--)
//        {
//            rightSum[i-1] = rightSum[i] + nums[i];
//        }
//        for(int i=0;i<n;i++)
//        {
//            if(leftSum[i] == rightSum[i])
//            {
//                return  i;
//            }
//        }
//
//        return  -1;
        int totalSum=Arrays.stream(nums).sum();

        int n = nums.length;
        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            //calculate the right sum
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum==rightSum)
            {
                return  i;
            }
            leftSum= leftSum+nums[i];
        }
        return  -1;

    }

    public static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));

    }
}
