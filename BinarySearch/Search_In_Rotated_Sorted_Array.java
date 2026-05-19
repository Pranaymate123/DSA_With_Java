package BinarySearch;

import java.util.Arrays;

public class Search_In_Rotated_Sorted_Array {

   /* public static int search(int[] nums, int target) {

        int n=nums.length;
        int l=0;
        int h=nums.length-1;

        while (l<=h)
        {
            int mid=l+(h-l)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[l]<=nums[mid])
            {
                //left half is sorted
                if(target>=nums[l] && target<nums[mid])
                {
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                //right half is sorted
                if(target>=nums[mid] && target<=nums[h])
                {
                    l=mid;
                }
                else{
                    h=mid;
                }

            }
        }

        return -1;
    }

    */

    public static int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h= n-1;

        while (l<h)
        {
            int mid = l+(h-l)/2;
            if(nums[h]>nums[mid])
            {
                h=mid;
            }
            else{
                l=mid+1;
            }
        }

        int ans1=binarySearch(nums,0,l-1,target);
        if(ans1!=-1) return ans1;

        System.out.println(l);
        return binarySearch(nums,l,n-1,target);

    }

    public static int binarySearch(int[] nums,int l , int h , int target)
    {
        while (l<=h)
        {
            int mid = l+(h-l)/2;
           if(nums[mid]==target) {
               return mid;
           }
           else if(nums[mid] > target) {
               h = mid - 1;
           }
           else {
               l = mid + 1;
           }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};

        System.out.println(search(nums,0));
    }
}
