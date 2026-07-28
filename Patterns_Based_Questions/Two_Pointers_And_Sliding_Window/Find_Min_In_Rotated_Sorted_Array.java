package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

public class Find_Min_In_Rotated_Sorted_Array {

    public static int findMin(int[] nums) {
        int n = nums.length;
        int start=0;
        int end=n-1;

        if(nums[start]<nums[end]) return nums[start];
        while(start<end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid] > nums[end])
            {
                //Rotated
                start=mid+1;
            }
            else{
                end=mid;
            }


        }
        return nums[start];
    }

    public static void main(String[] args) {
        int[] nums={6,7,0,1,2,4,5};
//        int[] nums={4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
