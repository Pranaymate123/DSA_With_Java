package Patterns_Based_Questions.Binary_Search;

public class Search_In_Rotated_Sorted_Array {

    public static int search(int[] nums, int target) {
        int n = nums.length;

        return binarySearch(nums,target,0,n-1);
    }

    public static int binarySearch(int[] nums, int target ,int l ,int h)
    {
        while (l<=h)
        {
            int mid = l+(h-l)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            else if (nums[l]<=nums[mid])
            {
                //Check if first half iis sorted
                if(nums[l]<=target && target<nums[mid])
                {
                    return binarySearch(nums,target,l,mid);
                }
                else{
                    l=mid+1;
                }
            }
            else{
                //if swecond half is sorted
                if(nums[mid]<target && target<=nums[h])
                {
                    return binarySearch(nums,target,mid,h);
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums ={5,1,3};
        int target = 3;

        System.out.println(search(nums,target));

    }
}
