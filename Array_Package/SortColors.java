package Array_Package;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int zero_count=0;
        int one_count=0;
        int two_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero_count++;
            } else if (nums[i]==1) {
                one_count++;

            }
            else
            {
                two_count++;
            }
        }
        int j=0;
        while (zero_count!=0)
        {
            nums[j]=0;
            zero_count--;
            j++;
        }
        while (one_count!=0)
        {
            nums[j]=1;
            one_count--;
            j++;
        }
        while (two_count!=0)
        {
            nums[j]=2;
            two_count--;
            j++;
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }
}
