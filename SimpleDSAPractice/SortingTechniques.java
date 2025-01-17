package SimpleDSAPractice;

import java.util.Arrays;

public class SortingTechniques {

    public static void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1,arr);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
    {
        int min=0;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }

            swap(i,min,arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(j,j-1,arr);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int a,int b,int[] arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void mergeSort(int[] arr,int l ,int r)
    {
        if (l>=r) return;
        int mid= l + (r - l) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        merge(arr,l,r,mid);
    }

    public static void merge(int[] arr ,int l, int r, int mid)
    {
        int []Left=new int[mid-l+1];
        int[] Right=new int[r-mid];

       int k=l;
        for(int i=0;i<Left.length;i++)
        {
            Left[i]=arr[k];
            k++;
        }

        for(int j=0;j<Right.length;j++)
        {
            Right[j]=arr[k];
            k++;
        }
//        merge;
        int i=0;
        int j=0;
        k=l;
        while (i<Left.length && j<Right.length)
        {
            if(Left[i]<=Right[j])
            {
                arr[k]=Left[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=Right[j];
                j++;
                k++;
            }
        }

        while (i<Left.length)
        {
            arr[k]=Left[i];
            k++;
            i++;
        }

        while (j<Right.length)
        {
            arr[k]=Right[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr={10,60,40,50,30,20,10};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
