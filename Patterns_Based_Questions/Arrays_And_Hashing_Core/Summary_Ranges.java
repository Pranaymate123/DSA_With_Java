package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {

    public static List<String> summaryRanges(int[] nums) {
        int i=0;
        List<String> result = new ArrayList<>();
        while (i<nums.length)
        {
            StringBuilder str = new StringBuilder();
            int first = nums[i];
            str.append(nums[i]);
            while ( i<nums.length-1 &&  (nums[i] + 1)==nums[i+1])
            {
                i++;
            }
            if(nums[i]!=first)
            {

                str.append("->");
                str.append(nums[i]);
            }
            i++;
            result.add(str.toString());
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums ={0,2,3,4,6,8,9};

        System.out.println(summaryRanges(nums));
    }
}
