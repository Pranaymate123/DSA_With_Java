package BinarySearch;

import java.util.Arrays;

public class Find_Smallest_Divisor {

    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int l=1;
        int h=nums[nums.length-1];
        int opt=0;
        while (l<=h)
        {
            int mid=l+(h-l)/2;
            if(getSumDivisor(nums,mid)<=threshold)
            {
                opt=mid;
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return opt;
    }
    public static int getSumDivisor(int[] nums,int mid)
    {
        int divisor=0;
        for(int i=0;i<nums.length;i++)
        {
            float div=(float) nums[i]/(float) mid;

            divisor=  divisor +(int) Math.ceil(div);

        }
//        System.out.println("ans is " + divisor);
        return divisor;
    }

    public static void main(String[] args) {

        int[] nums={12,50,11,75,57,12,73,4,69,78};
        int threshold=649;

        System.out.println(smallestDivisor(nums,threshold));

    }
}
