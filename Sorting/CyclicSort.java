package Sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int arr[]={3,4,-1,1};
        int num=findMissing(arr);
        System.out.println(num);
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));

    }

    public static  void cyclicSort(int arr[])
    {
        int i=0;

        while (i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i])
            {
                //move forward
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
    }

    public static  void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static int findMissing(int arr[])
    {
        int i=0;
        while (i<arr.length)
        {
            int correct=arr[i]+1;
            if(arr[i]>=arr.length-1)
            {
                i++;
            }
            else if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        int ans=-1;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j-1 && j-1!=0)
            {
                ans=j-1;
                break;
            }
            else
            {
                ans=arr.length;
            }
        }
        return ans;
    }
}
