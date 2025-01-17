package Sorting;

import java.util.Arrays;

public class D06_BubbleSort {

    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static  void bubbleSort(int arr[])
    {
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++)
        {
            swapped=false;
            for (int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            if(!swapped)
            {
                break;
            }
        }
    }
}
