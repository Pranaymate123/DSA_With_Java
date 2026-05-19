package Patterns_Based_Questions.Arrays_And_Basic_Patterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {

    public static int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        int lastSmaller = Integer.MAX_VALUE;
//        int n = nums.length;
//        int count=1;
//        int longest=-1;
//        for(int i=0;i<n;i++)
//        {
//            if(nums[i]-1 ==  lastSmaller)
//            {
//                count++;
//                lastSmaller=nums[i];
//            }
//            else if(nums[i]!=lastSmaller)
//            {
//                count=1;
//                lastSmaller=nums[i];
//            }
//            longest=Math.max(longest,count);
//
//        }
//
//        return longest;

       int n = nums.length;
       if(n==0) return 0;

       int longest = 0;
       Set<Integer> set = new HashSet<>();
       for(int num: nums)
       {
           set.add(num);
       }


       for(int num:set)
       {
           if(!set.contains(num-1))
           {
               int start= num;
               int count=1;
               while(set.contains(start+1))
               {
                   count++;
                   start++;
               }

               longest=Math.max(longest,count);
           }
       }
       return longest;
    }
    public static void main(String[] args) {
        int[] nums ={0,3,7,2,5,8,4,6,0,1};
//        int[] nums ={1,0,1,2};

        System.out.println(longestConsecutive(nums));
    }
}
