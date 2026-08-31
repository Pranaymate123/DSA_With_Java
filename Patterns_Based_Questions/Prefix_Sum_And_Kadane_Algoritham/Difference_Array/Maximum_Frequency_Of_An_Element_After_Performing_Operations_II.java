package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maximum_Frequency_Of_An_Element_After_Performing_Operations_II {

    public static int maxFrequency(int[] nums, int k, int numOperations) {
        int n = nums.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int num:nums)
        {
            map.put(num,0);
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }

        for(int i=0;i<n;i++)
        {
            int l = Math.max(nums[i]-k,0);
            int r = nums[i]+k;
            int x=1;
            map.put(l,map.getOrDefault(l,0)+1);
            map.put(r+1,map.getOrDefault(r+1,0)-1);
        }

        //cumulative sum
        int cSum=0;
        int maxFreq =0;
        for(Integer key:map.keySet())
        {
            cSum+=map.get(key);
            map.put(key,cSum);

            int totalCount = cSum;
            int eleOwnFreq = hashMap.getOrDefault(key,0);
            int needConversion = totalCount - eleOwnFreq;
            int maxPossibleConversion = Math.min(needConversion,numOperations);

            int totalFreq = eleOwnFreq + maxPossibleConversion;

            maxFreq = Math.max(maxFreq, totalFreq);
        }


        return maxFreq;
    }
    public static void main(String[] args) {
        int[] nums ={5,11,20,20};
        int k=5;
        int numPos = 1;

        System.out.println(maxFrequency(nums,k,numPos));

    }
}
