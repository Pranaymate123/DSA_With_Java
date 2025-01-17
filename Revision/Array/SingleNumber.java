package Revision.Array;

public class SingleNumber {

    public static int getSingleNumber(int [] nums)
    {
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            result=result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={2,1,2,1,3,4,5,5,3,6,7,7,6,8,8};
        System.out.println(getSingleNumber(nums));
    }
}
