package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
             if(map.containsKey(target-nums[i]))
             {
                 return new int[] {map.get(target-nums[i]) , i};
             }
             else {
                 map.put(nums[i] , i);
             }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={3,4,2};

        System.out.println(Arrays.toString(twoSum(nums , 6)));
    }
}
