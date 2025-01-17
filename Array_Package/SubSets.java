package Array_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public static List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> resultSet=new ArrayList<>();
      backtrack(resultSet,new ArrayList<>(),nums,0);
      return resultSet;
    }

    public static void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet,int[] nums,int start)
    {
       resultSets.add(new ArrayList<>(tempSet));
       for(int i=start;i<nums.length;i++)
       {
           //Case for including the nums[i]
           tempSet.add(nums[i]);

           //adding the next tempset to resu;tset
           backtrack(resultSets,tempSet,nums,i+1);

           //Case of not including the nums[i]
           tempSet.remove(tempSet.size()-1);

       }
    }

    public static void main(String[] args) {
        int[] nums={3,2,4,1};
        System.out.println(subsets(nums));
    }
}
