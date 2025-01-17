package Revision.Array;

public class Move_Zeros {

    public void moveZeroes(int[] nums) {
        int one=0;
        int two=0;
        while (two<nums.length)
        {
            if(nums[two]!=0)
            {
                int temp=nums[two];
                nums[two]=nums[one];
                nums[one]=temp;
                one++;
            }
            two++;
        }
    }
    public static void main(String[] args) {

    }
}
