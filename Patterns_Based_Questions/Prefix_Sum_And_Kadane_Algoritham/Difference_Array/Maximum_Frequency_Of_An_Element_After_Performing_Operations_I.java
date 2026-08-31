package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Frequency_Of_An_Element_After_Performing_Operations_I {

    public static int maxFrequency(int[] nums, int k, int numOperations) {
        int n = nums.length;
        int[] diff = new int[getMaxElement(nums)+k+1];

        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<n;i++)
        {
            int l = Math.max(nums[i] - k, 0);
            int r = nums[i]+k;
            int x =1;

            diff[l]+=x;
            if(r+1< diff.length){
                diff[r+1]-=x;
            }
        }
        int maxFreq=0;
        //find cumulative sum
        int cSum=0;
        for(int i=0;i<diff.length;i++)
        {
            cSum+=diff[i];
            diff[i]=cSum;

            //check for max Freq
            int totalCount = diff[i];
            int eleOwnFreq = map.getOrDefault(i,0);
            int needConversion = totalCount - eleOwnFreq;
            int maxPossibleConversion = Math.min(needConversion, numOperations);

            int totalFreq = eleOwnFreq + maxPossibleConversion;

            maxFreq=Math.max(maxFreq,totalFreq);
        }

        return maxFreq;
    }

    public static  int getMaxElement(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for(int n :nums)
        {
            max=Math.max(n,max);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums ={1,4,5};
        int k=1;
        int numOps =2;

        System.out.println(maxFrequency(nums,k,numOps));

    }
}
