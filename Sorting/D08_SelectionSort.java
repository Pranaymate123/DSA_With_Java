package Sorting;

import java.util.Arrays;

public class D08_SelectionSort {
    public static void main(String[] args) {
        int arr[]={50,40,60,20,10};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static  void selectionsort(int [] arr)
    {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=findMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static  int findMaxIndex(int arr[],int start,int end)
    {
        int max=0;
        for(int i=start;i<end;i++)
        {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
