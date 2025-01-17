package Sorting;

import java.util.Arrays;

public class D07_Insertion_Sort {

    public static void main(String[] args) {
        int arr[]={50,40,60,20,10};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] insertionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}
