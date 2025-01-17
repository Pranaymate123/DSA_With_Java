package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void getCombinations(int idx,int [] arr,int target,List<Integer> ds,List<List<Integer>> ans)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));

            }
            return;
        }

        if(arr[idx] <= target)
        {
            //pick it
            ds.add(arr[idx]);
        getCombinations(idx,arr,target-arr[idx],ds,ans);
            ds.remove(ds.size()-1);
        }
        //not pick it
       getCombinations(idx+1,arr,target,ds,ans);
    }


public static List<List<Integer>> combinarionSum( int [] arr,int target)
{
    List<List<Integer>> ans=new ArrayList<>();
    getCombinations(0,arr,target,new ArrayList<>(),ans);
    return ans;
}
    public static void main(String[] args) {
        int arr[]={2,5,2,1,2};
        System.out.println(combinarionSum(arr,5));

    }
}
