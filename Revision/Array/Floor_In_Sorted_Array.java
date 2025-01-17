package Revision.Array;

import Recursion.Array;

import java.util.Arrays;

public class Floor_In_Sorted_Array {

    public static int findFloor(long arr[], int n, long x) {
        int low=0;
        int high=n-1;
        int ans=-1;
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=x)
            {
                high=mid-1;
            }
            else
            {
                ans=mid;
                low=mid+1;
            }
        }

        return ans;
    }

    public static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int[] result=new int[2];
        if(arr[0]>x) result[0]=-1;
        if(arr[arr.length-1]<x) result[1]=-1;

        int low=0;
        int high=arr.length-1;
        int floor=-1;
        int ceil=-1;
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                ceil=x;
                floor=x;
                break;
            }
           else if (arr[mid]>x)
            {
                high=mid-1;
                ceil=arr[high+1];
            }
            else
            {
                floor=arr[mid];
                low=mid+1;
            }
        }
        result[0]=floor;
        result[1]=ceil;
        return result;

    }

    public static void main(String[] args) {
        int[] nums={36, 82, 88 ,56, 21 ,17, 73 ,86};
//        System.out.println(findFloor(nums,nums.length,5));
        System.out.println(Arrays.toString(getFloorAndCeil(17,nums)));
    }
}
