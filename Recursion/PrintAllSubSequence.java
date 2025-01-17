package Recursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PrintAllSubSequence {

    public static void printAllSubSequences(int idx, int [] arr , Deque<Integer> lst, int n)
    {
        if(idx>=n)
        {
            System.out.println(lst);
            return;
        }
        //take
        lst.addLast(arr[idx]);
        printAllSubSequences(idx+1,arr,lst,3);
        //not take
        lst.removeLast();
        printAllSubSequences(idx+1,arr,lst,3);
        //Pranay  Mate
    }

    public static int printAllSubSequenceHavingSumK(int idx, int [] arr, Deque<Integer> lst,int sum,int n,int k)
    {
        if(idx>=n)
        {
            if(sum==k)
            {
//                System.out.println(lst);
                return 1;
            }
            return 0;
        }
        //take it
        lst.addLast(arr[idx]);
        sum+=arr[idx];
       int r= printAllSubSequenceHavingSumK(idx +1 , arr, lst, sum, n, k);
        //not take it
        sum-=lst.removeLast();
        int l= printAllSubSequenceHavingSumK(idx +1 , arr, lst, sum, n, k);
        return l+r ;
    }

    public static void main(String[] args) {
        int[] arr={3,1,2};
        int n=3;
        Deque<Integer> lst=new ArrayDeque<>();
//        printAllSubSequences(0,arr,lst,n);

        Deque<Integer> deque=new ArrayDeque<>();
        int arr1[]={1,2,1};
        System.out.println(printAllSubSequenceHavingSumK(0,arr1,deque,0,3,2));
    }
}
