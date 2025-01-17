package Sorting;

import java.util.HashMap;
import java.util.Map;

public class Miniimum_Operation_To_Make_X_Zero {

    public static   int minOperations(int[] nums, int x) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            map.put(sum, i);
        }
        int remainingSum = sum - x;
        int longestSubArray = Integer.MIN_VALUE;
        sum=0;
        for (int i = 0; i < nums.length; i++)
        {
            sum=sum+nums[i];
            int findSum=sum-remainingSum;
            if(map.containsKey(findSum))
            {
                int idx=map.get(findSum);
                longestSubArray=Math.max(longestSubArray,i-idx);
            }
        }
        return longestSubArray==Integer.MIN_VALUE?-1:nums.length-longestSubArray;
    }

    public static void main(String[] args) {
        int[] nums={3,2,1,1,1,1,1,3,1};
        System.out.println(minOperations(nums,7));
    }
}
