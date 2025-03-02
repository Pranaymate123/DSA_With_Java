package Array_Package;

import java.util.Arrays;

public class Apply_Operations_To_Array {



    public static int[] applyOperations(int[] nums) {

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }

        System.out.println(Arrays.toString(nums));
        return moveZerosToEnd(nums);
    }

    public static int[] moveZerosToEnd(int[] nums)
    {
        int i=0;
        int j=0;

        while (i<nums.length && j<nums.length)
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

                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={2,1};

        System.out.println(Arrays.toString(applyOperations(nums)));
    }
}
