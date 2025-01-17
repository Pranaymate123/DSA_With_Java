package Accenture_Revision;

import java.util.ArrayList;
import java.util.List;

public class LongestSubSequenceConseDiffDivisByK {

    public static int helper(int[] arr, int k, int idx, List<Integer> lst)
    {
        if(idx>=arr.length) return 0;
        int take=0;
        int notTake=0;

        if(idx==0)
        {
            lst.add(arr[idx]);
            take=1+helper(arr,k,idx+1,lst);
        }
        else if(Math.abs(arr[idx]-lst.get(lst.size()-1)) %k==0)
        {
            lst.add(arr[idx]);
            take=1+helper(arr,k,idx+1,lst);
        }
        else
        {
            if(!lst.isEmpty())
            {
                lst.remove(lst.size()-1);
            }
            notTake=helper(arr,k,idx+1,lst);
        }
        return Math.max(take,notTake);
    }
    public static int getLongestSubSequence(int [] arr,int k)
    {
        return helper(arr,k,0,new ArrayList<>());
    }
    public static void main(String[] args) {
        int []arr={2,3,4,5,6};
        System.out.println(getLongestSubSequence(arr,1));
    }
}
