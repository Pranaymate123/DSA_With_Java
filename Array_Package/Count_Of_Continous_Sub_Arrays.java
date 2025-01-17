package Array_Package;

import java.util.Map;
import java.util.TreeMap;

public class Count_Of_Continous_Sub_Arrays {

    public static long continuousSubarrays(int[] nums) {

        TreeMap<Integer,Integer> map=new TreeMap<>();
        long result=0;
        int i=0;
        int j=0;
       while (j<nums.length)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while (Math.abs(map.lastKey() - map.firstKey()) > 2) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }

            result += j - i + 1;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={5,4,2,4};
        System.out.println(continuousSubarrays(nums));
    }
}
