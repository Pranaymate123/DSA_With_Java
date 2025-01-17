package Revision.Array;

import java.util.Arrays;

public class Rearrange_The_Elements_By_Sign {

    public static int[] rearrangeArray(int[] nums) {
        int p=0;
        int n=1;
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                result[p]=nums[i];
                p=p+2;
            }
            else
            {
                result[n]=nums[i];
                n=n+2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,1,2,3,4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
