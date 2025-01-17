package Array_Package;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int i=0,j=1;
        while (j<nums.length)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            } else if (nums[i]==0 && nums[j]==0) {
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }

//        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int [] arr={3,4,5,0,7,8,0,0,9};
        moveZeroes(arr);

    }

}
