package Patterns_Based_Questions.Binary_Search;

public class Find_Minimum_In_Rotated_Sorted_Array {

    public static int findMin(int[] nums) {
        int n = nums.length;

        int l =0;
        int h = n-1;

        if(nums[l]<=nums[h])
        {
            return nums[l];
        }
        while (l<h)
        {
            int mid = l + (h-l)/2;


             if(nums[mid]> nums[h])
            {
                l=mid+1;
            }
            else{
                h=mid;
            }
        }

        return nums[l];
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2};

        System.out.println(findMin(nums));

    }
}
