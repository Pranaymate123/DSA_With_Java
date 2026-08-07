package Patterns_Based_Questions.Binary_Search;

import java.util.Arrays;

public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {

    public static int[] searchRange(int[] nums, int target) {

        int n = nums.length;
         int idx = binarySearch(nums,0,n-1,target);

         if(idx==-1) return new int[]{-1,-1};

         int firstIdx = findFirstPosition(nums,0,idx,target);

         int lastIdx = findLastPosition(nums,idx, n-1,target);

         return new int[] {firstIdx,lastIdx};
    }

    public static int findFirstPosition(int[] nums, int start, int end , int target)
    {
        //search for the idx where nums[mid] = target and nums[mid] > nums[mid-1]

        while (start<end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid]==target)
            {
                //this can be my answer so i keep this instead of doing end=mid-1 I will do end=mid;
                end=mid;
            }
            else {
                //Otherwise I will have the lower than target ( nums[mid] < target ) and this never
                //be my solution so I do start  = mid+1;

                start=mid+1;
            }
        }
        //At the end my start and end will point to first idx of target

        return start;
    }

    public static int findLastPosition(int[] nums, int start, int end , int target)
    {
        //search for the idx where nums[mid] = target and nums[mid] > nums[mid+1]

        while (start<end)
        {
            int mid = start + (end-start)/2 +1 ;  //TODO Look att bottom for why this +1

            if(nums[mid]==target)
            {
                //this can be my answer so i keep this instead of doing start=mid+1 I will do start=mid;
                start=mid;
            }
            else {
                //Otherwise I will have the greater than target ( nums[mid] > target ) and this never
                //be my solution so I do end  = mid-1;
                end=mid-1;
            }
        }
        //At the end my start and end will point to last idx of target

        return start;

    }

    public static int binarySearch(int[] nums, int start, int end , int target)
    {
        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid]==target) return mid;

            else if(nums[mid] > target)
            {
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}

/*

IF we have not use the +1 to get the upper mid then it was going to infinite loop and not moving forward

* The rule to remember

Whenever your binary search does:

start = mid;

➡️ Use the upper middle:

mid = start + (end - start)/2 + 1;

Whenever it does:

end = mid;

➡️ Use the lower middle:

mid = start + (end - start)/2;

This guarantees that the search interval always shrinks.
* */
