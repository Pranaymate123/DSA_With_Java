package Backtracking_CodeStoryWithMik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Non_Decreasing_Sub_Sequences{
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {

        solve(nums,0,new ArrayList<>());
        return result;
    }

    public void solve(int[] nums, int idx, List<Integer> temp)
    {
        if(idx>=nums.length)
        {
                if(temp.size()>=2)
                    result.add(new ArrayList<>(temp));
            return;
        }

        if(temp.size()>=2)
        {
            result.add(new ArrayList<>(temp));

        }
        Set<Integer> set=new HashSet<>();
        boolean flag=false;
        for(int i=idx;i<nums.length;i++)
        {
            if(( temp.isEmpty() || nums[i]>=temp.get(temp.size()-1)) && (!set.contains(nums[i])))
            {

                //take
                temp.add(nums[i]);
                //explore


                solve(nums,i+1,temp);

                temp.remove(temp.size()-1);
                set.add(nums[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={4,6,7,7};
        Non_Decreasing_Sub_Sequences obj=new Non_Decreasing_Sub_Sequences();
        System.out.println( obj.findSubsequences(nums));
    }

}
