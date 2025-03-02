package Array_Package;

import java.util.Arrays;

public class Chocolate_Factory {

    public static int[] moveZeroToEnd(int[] nums)
    {
        int i=0;
        int j=0;

        while (j<nums.length)
        {
            if(nums[i]!=0)
            {
                i++;
            } else if (nums[i]==0) {
                j=i;
                while (j<nums.length && nums[j]==0)
                {
                    j++;
                }
                if(j<nums.length)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

                i=j;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={4,5,0,1,9,0,5,0};

        System.out.println(Arrays.toString(moveZeroToEnd(nums)));
    }
}
