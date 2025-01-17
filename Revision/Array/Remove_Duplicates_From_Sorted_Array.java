package Revision.Array;

public class Remove_Duplicates_From_Sorted_Array {

    public static int removeDuplicates(int[] nums) {
        int idx=0;
        nums[idx]=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[idx]!=nums[i])
            {
                idx++;
                nums[idx]=nums[i];
            }
        }
        return idx + 1;
    }

    public static void main(String[] ags) {
//        int [] nums={0,0,1,1,1,2,2,2,2,3,3,3,4};
        int [] nums={1};
        System.out.println(removeDuplicates(nums));
    }
}
