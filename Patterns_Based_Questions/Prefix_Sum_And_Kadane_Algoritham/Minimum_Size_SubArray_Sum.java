package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Minimum_Size_SubArray_Sum {


    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int sum=0;
        int size = Integer.MAX_VALUE;
        while (j<n)
        {

            sum+=nums[j];
            //trying to  make the window smaller
            while ( i<n &&  sum>=target)
            {
                    size=Math.min(size,j-i+1);
                    sum=sum-nums[i];

                i++;
            }
            j++;
        }

        return size==Integer.MAX_VALUE?0 :size;

    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        int target = 15;

        System.out.println(minSubArrayLen(target,nums));

    }
}
