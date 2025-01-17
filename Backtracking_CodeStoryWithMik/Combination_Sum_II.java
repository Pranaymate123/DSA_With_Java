package Backtracking_CodeStoryWithMik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,result,new ArrayList<>());
        return result;
    }

    public static void solve(int[] candidates,int idx,int target,List<List<Integer>> result,List<Integer> curr)
    {

        if(target<0) return;
        if(target==0)
        {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<candidates.length;i++)
        {
            if(i>idx && candidates[i]==candidates[i-1])
            {
                continue;
            }

            curr.add(candidates[i]);
            solve(candidates,i+1,target-candidates[i],result,curr);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates={2,5,2,1,2};
        int target=5;
        System.out.println(combinationSum2(candidates,target));

    }
}
