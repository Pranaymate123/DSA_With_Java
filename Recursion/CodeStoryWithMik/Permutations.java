package Recursion.CodeStoryWithMik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {


    public static List<List<Integer>> permute(int[] nums) {

          List<List<Integer>> result=new ArrayList<>();
          Set<Integer> set=new HashSet<>();
        solve(new ArrayList<>(),nums,result,set);
        return result;
    }

    public static void solve(List<Integer> temp,int[] nums,List<List<Integer>> result,Set<Integer> set) {
        if (temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
           if(!set.contains(nums[i]))
           {
               //do
               temp.add(nums[i]);
               set.add(nums[i]);

               //explore
               solve(temp,nums,result,set);

               //undo
               temp.remove(temp.size()-1);
               set.remove(nums[i]);

           }
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(permute(nums));

    }
}
