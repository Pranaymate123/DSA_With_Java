package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        mergeSort(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));


    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }


    public static void mergeSort(int [] arr,int s,int e)
    {
        if(e-s==1)
        {
            return;
        }

        int m=(s+e)/2;

        mergeSort(arr,s,m);
         mergeSort(arr,m,e);

        merge(arr,s,m,e);
    }
    public  static  void merge(int [] arr,int s,int m,int e)
    {
        //take i on first and j on seconds
        int i=s;
        int j=m;
        int k=0;
        int mixArr[]=new int[e-s];

        while(i<m && j<e) {
            if (arr[i] < arr[j]) {
                 mixArr[k] = arr[i];

                i++;
            } else {
                mixArr[k] = arr[j];
                j++;

            }
            k++;
        }
             //agar second array kahatam ho jaye toh
            while (i<m)
            {
                mixArr[k]=arr[i];
                k++;
                i++;
            }
            while (j<e)
            {
                mixArr[k]=arr[j];
                k++;
                j++;
            }



        for(int l=0;l<mixArr.length;l++)
        {
            arr[s+l]=mixArr[l];
        }

    }
}
