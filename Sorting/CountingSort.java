package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count[] = new int[max + 1];
        //count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sort
        int j=0;
        for (int i = 0; i < count.length; i++)
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
        int[] arr={3,1,2,1,2,1,4,5,7,6,2,1};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
