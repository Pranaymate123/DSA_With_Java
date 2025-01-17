package Recursion.CodeStoryWithMik;

import java.util.*;

public class Permutations_II {
    //Approach 1 bY USING Map
//    public static List<List<Integer>> permuteUnique(int[] nums) {
//        Map<Integer,Integer> map=new HashMap<>();
//        List<List<Integer>> result=new ArrayList<>();
//        for(int key:nums)
//        {
//            map.put(key,map.getOrDefault(key,0)+1);
//        }
//        solve(result,map,new ArrayList<>(),nums.length);
//
//        return result;
//    }
//
//    public static void solve(List<List<Integer>> result,Map<Integer,Integer> map,List<Integer> temp,int n)
//    {
//        if(temp.size()>=n)
//        {
//            result.add(new ArrayList<>(temp));
//        }
//
//        for(Integer key:map.keySet())
//        {
//            if(map.get(key)>0)
//            {
//                temp.add(key);
//                map.put(key,map.getOrDefault(key,0)-1);
//
//                solve(result,map,temp,n);
//
//                //backtrack
//
//                temp.remove(temp.size()-1);
//                map.put(key,map.getOrDefault(key,0)+1);
//
//            }
//        }
//    }

    //Approach 2 By Making Swap and Using the Set
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        solve(result,nums,nums.length,0);
        return result;
    }
    public static void solve(List<List<Integer>> result,int[] nums,int n,int i)
    {
        if(i>=n)
        {
            List<Integer> temp=new ArrayList<>();
            for(int num:nums)
            {
                temp.add(num);
            }

            result.add(temp);
            return;
        }
        Set<Integer> set=new HashSet<>();
        // swap
        for(int idx=i;idx<n;idx++)
        {
            if(!set.contains(nums[idx]))
            {
                set.add(nums[idx]);
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;

                solve(result,nums,n,i+1);

                temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;


            }


        }
    }

    public static void main(String[] args) {
        int[] nums ={1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
