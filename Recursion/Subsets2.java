package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void getSubSets(int idx, int[] arr, ArrayList<Integer> ds, List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds));

        for(int i=idx;i<arr.length;i++)
        {
            if(i!=idx && arr[i]==arr[i-1]) continue;

            ds.add(arr[i]);
            getSubSets(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }

    }
    public static  List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        getSubSets(0,arr,new ArrayList<>(),ans);
        return ans;

    }

    public static void main(String[] args) {
        int [] arr={4,4,4,1,4};
        System.out.println(subsetsWithDup(arr));
    }
}
