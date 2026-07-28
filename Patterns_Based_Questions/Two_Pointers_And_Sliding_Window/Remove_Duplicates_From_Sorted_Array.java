package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.Arrays;

public class Remove_Duplicates_From_Sorted_Array {

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;

        int i=0;
        int j=0;

        while (j<n)
        {
            if(nums[i]==nums[j])
            {
                j++;
            }
            else{
                int temp = nums[i+1];
                nums[i+1]= nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }

//        System.out.println(Arrays.toString(nums));

        return i+1;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }

}
