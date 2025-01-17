package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum2 {

    public static void getCombinations(int idx, int [] arr, int target, ArrayList<Integer> ds, List<List<Integer>> ans)
    {
        if (target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i< arr.length;i++)
        {
            if(i > idx && arr[i]==arr[i-1]) continue;

            if(arr[i]>target) break;
            ds.add(arr[i]);
            getCombinations(i+1, arr, target-arr[i], ds, ans);
            ds.remove(ds.size()-1);

        }

    }

    public static List<List<Integer>> getCombination2(int arr[] ,int target)
    {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        getCombinations(0,arr,target,new ArrayList<>(),ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2,5,2,1,2};
        System.out.println(getCombination2(arr,5));
    }
}
