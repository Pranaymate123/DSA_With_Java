package Array_Package;

import java.util.Arrays;

public class Find_Pivot_Index {

    public static int pivotIndex(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        leftSum[0]=nums[0];
        rightSum[nums.length-1]=nums[nums.length-1];

        int i=1;int j=nums.length-2;
        while (i<nums.length && j>=0)
        {
            leftSum[i]=leftSum[i-1]+nums[i];
            rightSum[j]=rightSum[j+1]+nums[j];
            i++;
            j--;
        }


        for(int k=0;k<nums.length;k++)
        {
            if(leftSum[k]==rightSum[k])
            {
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println( pivotIndex(nums));
    }
}
