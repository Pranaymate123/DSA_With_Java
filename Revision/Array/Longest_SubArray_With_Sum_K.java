package Revision.Array;

import java.util.HashMap;
import java.util.Map;

public class Longest_SubArray_With_Sum_K {

    public static int getLongestSubarrayLength(int[] nums,int k)
    {
        int pSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxSize=0;
        for(int i=0;i<nums.length;i++)
        {
            pSum=pSum+nums[i];
            if(map.containsKey(pSum-k))
            {
                maxSize=Math.max(maxSize,i-map.get(pSum-k));
            }
            if (!map.containsKey(pSum)) {
                 map.put(pSum,i);
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 2, 3};
        System.out.println(getLongestSubarrayLength(nums,5));
    }
}
