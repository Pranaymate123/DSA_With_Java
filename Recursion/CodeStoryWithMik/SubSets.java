package Recursion.CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        solve(result,nums,0,new ArrayList<>());
        return result;
    }

    public static void solve(List<List<Integer>> result,int [] nums,int idx,List<Integer> temp)
    {
        if(idx>=nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }

//        Take
        temp.add(nums[idx]);

        // explore
        solve(result,nums,idx+1,temp);

        //Not Take
        temp.remove(temp.size()-1);

        solve(result,nums,idx+1,temp);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
