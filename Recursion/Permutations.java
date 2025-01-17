package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Permutations {
    public static void getPermutations(int [] arr, ArrayList<Integer> ds, List<List<Integer>> ans, boolean [] freq)
    {
        if(ds.size()==arr.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(arr[i]);
                getPermutations(arr,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static List<List<Integer>> permute(int [] arr)
    {
        List<List<Integer>> ans=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        getPermutations(arr,new ArrayList<>(),ans,freq);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(permute(arr));

    }

}
