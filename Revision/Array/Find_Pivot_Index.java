package Revision.Array;

public class Find_Pivot_Index {

    public static int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        for(int num:nums)
        {
            totalSum+=num;
        }
        for (int i=0;i<nums.length;i++)
        {

            if(leftSum*2==totalSum-nums[i])
            {
                return i;
            }
            leftSum=leftSum+nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
