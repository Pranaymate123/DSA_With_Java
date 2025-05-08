package Array_Package;

import java.util.HashMap;
import java.util.Map;

public class Count_The_Number_Of_Good_SubArrays {

    public static long countGood(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        long result=0;
        while (j<nums.length)
        {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            int countPairs=0;
            for (Integer key:map.keySet())
            {
                countPairs+=getnumberOfPairs(map.get(key));
            }
            if(countPairs>=k)
            {
                result++;
            }
            j++;
        }
        while (i< nums.length)
        {
            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==0)
            {
                map.remove(nums[i]);
            }

            int countPairs=0;
            for (Integer key:map.keySet())
            {
                countPairs+=getnumberOfPairs(map.get(key));
            }
            if(countPairs>=k)
            {
                result++;
            }
            i++;
        }

        return result;
    }
    public static int getnumberOfPairs(int n)
    {
        return (n*(n-1))/ 2;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int k=2;

        System.out.println(countGood(nums,k));
        System.out.println(getnumberOfPairs(2));
    }
}
