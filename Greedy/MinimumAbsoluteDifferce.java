package Greedy;

import java.text.CollationElementIterator;
import java.util.*;

public class MinimumAbsoluteDifferce {


    public static List<List<Integer>> findAbsPairs(int arr[])
    {
        List<List<Integer>> ans= new ArrayList();
        Arrays.sort(arr);
        int minAbs=Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length-1;i++)
        {
            int abs= Math.abs(arr[i+1]-arr[i]);
            if(abs<minAbs)
            {
                minAbs=abs;
            }
        }
        System.out.println(minAbs);

        for(int i=0;i<arr.length-1;i++)
        {
            int abs= Math.abs(arr[i+1]-arr[i]);
            if(abs==minAbs)
            {
                List<Integer> ds= new ArrayList<>();
                ds.add(arr[i]);
                ds.add(arr[i+1]);

                Collections.sort(ds);
                if(!ans.contains(ds))
                {
                    ans.add(new ArrayList(ds));
                }
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        int arr[]={4,2,1,3};
//        System.out.println(gertMinAbsDiff(arr));
         System.out.println(findAbsPairs(arr));
    }

}
