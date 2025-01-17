package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void BubbleSort(int arr[])
    {
        int swap=0;
        for(int i=0;i<arr.length-1;i++)
        {
            swap=0;
            for(int j=0;j< arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)
            {
                break;
            }
        }

    }

    public static void main(String[] args) {
//        int arr[]={10,54,8,45,21,41};
        int arr[]={10,20,30,40,50,60,70,80};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
