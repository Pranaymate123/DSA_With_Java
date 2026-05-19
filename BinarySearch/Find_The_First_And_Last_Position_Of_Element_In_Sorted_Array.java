package BinarySearch;

import java.util.Arrays;

public class Find_The_First_And_Last_Position_Of_Element_In_Sorted_Array {


    public static int[] searchRange(int[] nums, int target) {

        int firstIdx=-1;
        int secondIdx=-1;
        int n= nums.length;
        if(n==1 && nums[0]==target) return new int[]{0,0};
        int l=0;
        int h=n-1;
        //FIND firstIdx
        while (l<=h)
        {
            int mid = l+(h-l)/2;
            if(nums[mid]==target)
            {
                firstIdx=mid;
                h=mid-1;
            }
            else if(nums[mid]>target)
            {
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }


        l=0;
        h=n-1;
        while (l<=h)
        {
            int mid = l + (h-l)/2;

            if(nums[mid]==target)
            {
                secondIdx=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
            {

                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
//        secondIdx=l;
//        System.out.println(firstIdx+" , "+secondIdx);

        return new int[]{firstIdx,secondIdx};
    }

    public static void main(String[] args) {

        int[] nums={5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(nums,8)));
    }
}
