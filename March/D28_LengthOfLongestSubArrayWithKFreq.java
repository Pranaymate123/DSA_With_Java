package March;

import java.util.HashMap;
import java.util.Map;

public class D28_LengthOfLongestSubArrayWithKFreq {

    public static int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        if (nums.length == 0) return 0;
        if (nums.length == 1 && k == 1) return 1;
        int maxSize = 0;
        int i = 0;
        int j = 0;
        int flag = 0;
        while (j < nums.length) {
           if(!map.containsKey(nums[j])) {
                map.put(nums[j],1);
           }
           else {
               map.put(nums[j],map.get(nums[j])+1);
               while (i<j && map.get(nums[j])>k) {
                   map.put(nums[i],map.get(nums[i])-1);
                   i++;
               }
               maxSize=Math.max(maxSize,j-i+1);
               j++;
           }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3,1,2};
        System.out.println(maxSubarrayLength(nums,2));
    }
}
