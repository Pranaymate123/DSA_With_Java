package Array_Package;

import Recursion.Array;

import java.util.Arrays;

public class RepeatAndMissingArray
{
    public static int[] getNums(int arr[])
    {
        int i=0;
        while (i<arr.length)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else {
                i++;
            }
        }
        int ans[]=new int[2];
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j+1)
            {
                ans[0]=arr[j];
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,5,3};
        System.out.println(Arrays.toString(getNums(arr)));
    }
}
