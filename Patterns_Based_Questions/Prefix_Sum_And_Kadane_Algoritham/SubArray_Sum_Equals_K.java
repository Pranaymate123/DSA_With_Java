package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

import java.util.HashMap;
import java.util.Map;

public class SubArray_Sum_Equals_K {

    public static int subarraySum(int[] nums, int k) {

        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum=0;
        map.put(0,1);
        int total=0;
        for(int i=0;i<n;i++)
        {
            prefixSum = prefixSum + nums[i];
            if(map.containsKey(prefixSum-k))
            {
                total = total + map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return total;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,2,1,-4,2,2};
        int k =  6;
        System.out.println(subarraySum(nums , k));

    }
}
