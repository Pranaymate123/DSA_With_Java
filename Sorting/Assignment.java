package Sorting;

import java.util.Arrays;

public class Assignment {

    public static void BubbleSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0; j<arr.length-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int maxPosition=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[maxPosition])
                {
                    maxPosition = j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[maxPosition];
            arr[maxPosition]=temp;

        }
    }

    public static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]<curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void CountingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        //freq
        int []count=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--)
        {
            while (count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }



    }

    public static void main(String[] args) {
        int arr[]={50,40,20,10,30};
//        BubbleSort(arr);
//        SelectionSort(arr);
//        InsertionSort(arr);
        CountingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
