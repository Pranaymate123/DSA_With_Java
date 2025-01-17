package SlidingWindow;

import java.util.Arrays;

public class Increasing_Triplet_SubSequnce {

//    public static boolean increasingTriplet(int[] nums) {
//         int []leftMin=new int[nums.length];
//         int []rightMax=new int[nums.length];
//
//         leftMin[0]=nums[0];
//         for(int i=1;i<nums.length;i++)
//         {
//             leftMin[i]=Math.min(leftMin[i-1],nums[i]);
//         }
//         int n=nums.length-1;
//         rightMax[n]=nums[n];
//         for(int i=n-1;i>=0;i--)
//         {
//             rightMax[i]=Math.max(rightMax[i+1],nums[i]);
//         }
//
//
//         for(int i=0;i<nums.length;i++)
//         {
//             if(leftMin[i]<nums[i] && nums[i]<rightMax[i]) return true;
//         }
//
//         return false;
//    }


    //sOLUTION IN O(1) Time and O(1) Space
    public static boolean increasingTriplet(int[] nums) {
        int num1=Integer.MAX_VALUE;
        int num2=Integer.MAX_VALUE;
        for(int num3:nums)
        {
            if(num3<num1)
            {
                num1=num3;
            } else if (num3<num2) {
                num2=num3;
            }
            else
            {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums={20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }
}
