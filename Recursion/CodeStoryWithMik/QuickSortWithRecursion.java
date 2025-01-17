package Recursion.CodeStoryWithMik;

import java.util.Arrays;

public class QuickSortWithRecursion {

    public static void  quickSort(int[] arr,int low,int high)
    {
        if(low>=high) return;
        int pIdx=getPartitionIdx(arr,low,high);

        quickSort(arr,low,pIdx-1);
        quickSort(arr,pIdx+1,high);
    }

    public static int getPartitionIdx(int[] arr, int low, int high) {
        int pivot=arr[high];
        int pIdx=low;

        for(int i=low;i<high;i++)
        {
            if(arr[i]<pivot)
            {
                int temp=arr[i];
                arr[i]=arr[pIdx];
                arr[pIdx]=temp;
                pIdx++;
            }
        }

        int temp=arr[pIdx];
        arr[pIdx]=arr[high];
        arr[high]=temp;

        return pIdx;
    }

    public static void main(String[] args) {
        int[] arr={8,3,2,7,9,6,4,5};
       quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
