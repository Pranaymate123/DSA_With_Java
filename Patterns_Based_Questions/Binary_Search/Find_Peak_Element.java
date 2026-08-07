package Patterns_Based_Questions.Binary_Search;

public class Find_Peak_Element {

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int l=0;
        int h=n-1;

        while (l<h)
        {
            int mid = l + (h-l)/2;

            if(mid!=0 && nums[mid] < nums[mid-1])
            {
                h=mid-1;
            }
            else if(mid!= n-1 && nums[mid] < nums[mid+1])
            {
                l=mid+1;
            }
            else{
                return mid;
            }
        }

        return l;
    }

    public static void main(String[] args) {

        int[] nums ={2,1};


        System.out.println(findPeakElement(nums));
    }
}

///other solution

/*
class Solution {
    public int findPeakElement(int[] arr) {


        int start=0;
        int end=arr.length-1;
        while(start!=end)
        {
           int  mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //it is possible that mid can be the peak we kept mid in range by doing end = mid
                end=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                //as ele at  mid < mid+1  start can never be our peak okay so we move start = mid+1
                start=mid+1;
            }
        }

        //in last the start ==end and at that point we are on peak

        return start;


    }
}
 */
