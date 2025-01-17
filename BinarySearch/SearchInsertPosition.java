package BinarySearch;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        if (target<nums[0]) {

            return 0;
        }
        if(target>nums[nums.length-1])
        {
            return nums.length;
        }

        int start=0;
        int mid=0;
        int end=nums.length-1;
        while (start<=end)
        {
             mid=(end+start)/2;
            if(nums[mid]==target)
            {

                return mid;
            } else if (nums[mid]>target) {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

           return start;

    }

    public static void main(String[] args) {
        int []nums={1,3};
        int target=2;
        System.out.println(searchInsert(nums,target));
    }
}
