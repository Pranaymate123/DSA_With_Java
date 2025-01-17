package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermuationOptimal {

    public static void getAllPermutations(int idx, int[] arr, List<List<Integer>> ans)
    {
        if(idx==arr.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
        }

        for(int i=idx;i<arr.length;i++)
        {
            swap(i,idx,arr);
            getAllPermutations(idx+1, arr, ans);
            //backtracking
            swap(i,idx,arr);
        }

    }
    public static void swap(int i,int j,int [] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static List<List<Integer>> permute(int arr[])
    {
        List<List<Integer>> ans=new ArrayList<>();
        getAllPermutations(0,arr,ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(permute(arr));
    }

}
