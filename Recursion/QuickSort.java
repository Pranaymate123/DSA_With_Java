package Recursion;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int [] arr, int low, int high)
    {
        if(low < high)
        {
            int parttionIdx=getPartitionIndex(arr,low,high);

            //left half
            quickSort(arr, low, parttionIdx-1);

            //right half

            quickSort(arr,parttionIdx+1, high);
        }


    }
    public static int getPartitionIndex(int[] arr,int low, int high)
    {
        int i=low;
        int j=high;
        int pivot=arr[low];
        while (i<j)
        {
            while (arr[i]<=pivot && i <=high-1)
            {
                i++;
            }
            while (arr[j]>pivot && j >=low+1)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap j with pivot
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;

        //return parttion index
        return j;
    }


    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
