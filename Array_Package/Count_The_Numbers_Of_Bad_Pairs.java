package Array_Package;

import java.util.HashMap;
import java.util.Map;

public class Count_The_Numbers_Of_Bad_Pairs {

    public static long countBadPairs(int[] nums) {
        long count=0;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<n;i++)
        {
           int totalPairs=i;
           int key=nums[i]-i;
           int goodPairs=map.getOrDefault(key,0);

           int badPairs=totalPairs-goodPairs;
           count+=badPairs;
           map.put(key,map.getOrDefault(key,0)+1);

        }

         return count;

    }
    public static void main(String[] args) {
        int[] nums={4,1,3,3};
        System.out.println(countBadPairs(nums));
    }
}
