package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {

    public static  int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        int maxAns = 1;
        for(Integer n:set)
        {
            int longest =1 ;
            if(set.contains(n-1))
            {
                continue;
            }
            while (set.contains(n+1))
            {
                longest++;
                n=n+1;
            }

            maxAns=Math.max(longest,maxAns);
        }

        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums ={100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}
