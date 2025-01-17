package Accenture_Coding_Pyq;

import java.util.ArrayList;

public class Longest_SubSequence_With_Diff_Divisible_By_K {

    public static void solve(int idx,int[] arr, ArrayList<Integer> temp,int[] max,int k)
    {
        if(idx==arr.length)
        {
            if(max[0]<temp.size())
                max[0]=temp.size();
            return;
        }
         if(temp.size()==0 ||
        (arr[idx]-temp.get(temp.size()-1))%k==0)
        {
            //pick
            temp.add(arr[idx]);
            solve(idx+1,arr,temp,max,k);
            temp.remove(temp.size()-1);
        }
        solve(idx+1,arr,temp,max,k);
    }
    public static int getLongestSubSequence(int[] arr,int k)
    {
        int []max=new int[1];

        solve(0,arr,new ArrayList<>(),max,3);
        return max[0];
    }

    public static int getTripleSubSequence(int[] arr)
    {
        int []max=new int[1];

        solveTriple(0,arr,new ArrayList<>(),max);
        return max[0];
    }

    private static void solveTriple(int idx, int[] arr, ArrayList<Integer> temp, int[] max) {
        if(idx==arr.length)
        {
            max[0]=Math.max(max[0],temp.size());
            return;
        }
        if(temp.size()==0 ||
            temp.get(temp.size()-1)*3==arr[idx])
        {
            //pick
            temp.add(arr[idx]);
            solveTriple(idx+1,arr,temp,max);
            //backtrack
            temp.remove(temp.size()-1);
        }
        //not pick
       else solveTriple(idx+1,arr,temp,max);
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
//        System.out.println(getLongestSubSequence(arr,3));

        int[] arr1={2,3,6,18};
        System.out.println(getTripleSubSequence(arr1));

    }

}
