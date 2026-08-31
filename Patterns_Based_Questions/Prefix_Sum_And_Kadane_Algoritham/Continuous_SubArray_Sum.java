package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham;

import java.util.HashMap;
import java.util.Map;

public class Continuous_SubArray_Sum {

    /// (pSum[j]-pSum[i-1] ) % k ==0
    /// pSum[j] %k == pSum[i-1] % k
    public static boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;
        int[] pSum = new int[n];

        pSum[0]= nums[0];

        for(int i=1;i<n;i++)
        {
            pSum[i]=pSum[i-1] + nums[i];
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1                        );
        for(int i=0;i<n;i++)
        {
            int key = pSum[i] % k;
            if(map.containsKey(key))
            {
                if( (i - map.get(key) ) >=2)
                {
                    return true;
                }
            }
            else{
                map.put(key,i);
            }
        }


        return false;
    }


    public static void main(String[] args) {
        int[] nums = {23,2,6,4,7};
        int k =6;

        System.out.println(checkSubarraySum(nums,k));

    }
}

/*

1. Brute Force Observation

For any subarray (i...j):

subarraySum=pSum[j]−pSum[i−1]

We need:

(pSum[j]−pSum[i−1])%k=0

This means the subarray sum is a multiple of k.

2. Important Math Observation

If:

(a−b)%k=0

then:

a%k=b%k

In other words:

If two numbers have the same remainder when divided by k, their difference is divisible by k
 */
