package Revision.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_Consecutive_Sequenece {

    public static int longestConsecutive(int[] nums) {
         Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count=1;
        int max=0;
        for(int key:map.keySet())
        {

            if(map.containsKey(key+1))
            {
                count++;
            }
            else
            {
                max=Math.max(max,count);
                count=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.println(longestConsecutive(nums));
    }
}
