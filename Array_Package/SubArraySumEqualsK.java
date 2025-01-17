package Array_Package;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static  int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int pSum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            pSum+=nums[i];
            if(map.containsKey(pSum-k))
            {
                count+=map.get(pSum-k);

            }
            //if pSum present in the map it retrives the value else retrive the default value as 0 given in parameter
            map.put(pSum,map.getOrDefault(pSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr={1,-1,0};
        System.out.println(subarraySum(arr,0));
    }
}
