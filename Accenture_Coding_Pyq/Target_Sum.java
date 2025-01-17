package Accenture_Coding_Pyq;

import Recursion.Array;

import java.util.Arrays;
import java.util.HashMap;

public class Target_Sum {

    public static void getPairWithTargetSumAndMaxProduct(int[] arr,int target)
    {
        Arrays.sort(arr);
        int product=0;
        int[] ans=new int[2];
        int start=0;
        int end=arr.length-1;
        while (start<end)
        {
            if(arr[start]+arr[end]==target)
            {
                if(product<arr[start]*arr[end])
                {
                    product=arr[start]*arr[end];
                    ans[0]=arr[end];
                    ans[1]=arr[start];
                }
                start++;
                end--;
            }
            else if(arr[start]+arr[end] < target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        int[] arr={11,1,2,8,10,11,15,7};
        getPairWithTargetSumAndMaxProduct(arr,18);
    }
}
