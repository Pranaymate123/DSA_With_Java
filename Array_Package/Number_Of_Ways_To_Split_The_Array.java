package Array_Package;

import java.util.Arrays;

public class Number_Of_Ways_To_Split_The_Array {

    public static int waysToSplitArray(int[] nums) {
        long leftSum=0;
        long rightSum=0;
        int leftPtr=0;
        int rightPtr=nums.length-1;
        int result=0;
        int totalSum=0;
        for(int i:nums)
        {
            totalSum+=i;
        }
        while (leftPtr<nums.length-1 && rightPtr>0)
        {
            leftSum+=nums[leftPtr];
            rightSum=totalSum-leftSum;

            if(leftSum>=rightSum)
            {
                result++;
            }
            leftPtr++;
            rightPtr--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums={10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
    }
}
