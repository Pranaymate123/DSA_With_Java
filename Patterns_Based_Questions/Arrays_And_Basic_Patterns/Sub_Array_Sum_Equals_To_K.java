package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

import java.util.HashMap;
import java.util.Map;

public class Sub_Array_Sum_Equals_To_K {

    public static int subarraySum(int[] nums, int k) {

//        //Brute Force Approach O(n^3) Time Complexity
//        int n = nums.length;
//        int ans=0;
//        //find all subarrays
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i;j<n;j++)
//            {
//                int sum=0;
//                for(int m=i;m<=j;m++)
//                {
//                    sum+=nums[m];
//
//                }
//                if(sum==k) ans++;
//            }
//        }
//        return ans;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ansCount=0;
        int cSum=0;
        for(int i=0;i<nums.length;i++)
        {
            cSum=cSum+nums[i];
            if(map.containsKey(cSum-k))
            {

                ansCount=ansCount+map.get(cSum-k);
            }
            map.put(cSum,map.getOrDefault(cSum,0)+1);

        }

        return ansCount;

    }
    public static void main(String[] args) {
        int[] nums={1,-1,0};
        System.out.println(subarraySum(nums,0));
    }
}
