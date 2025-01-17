package Recursion.CodeStoryWithMik;

import java.util.Arrays;

public class MergeSortWithRecursion {

    public static void solve(int[] arr,int l,int r)
    {
        if(l>=r) return;

        int mid=l+(r-l)/2;

        solve(arr,l,mid);

        solve(arr,mid+1,r);

        merge(arr,l,mid,r);
    }
    public static void mergeSort(int [] arr)
    {
        int n=arr.length;
        int l=0;
        int r=n-1;
        solve(arr,l,r);
    }

    public static void merge(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int [] R=new int[n2];
        int k=l;
        //Fill L from arr
        for(int i=0;i<n1;i++)
        {
            L[i]=arr[k];
            k++;
        }

        //Fill R from arr
        for(int i=0;i<n2;i++)
        {
            R[i]=arr[k];
            k++;
        }

        //Merge the L and R into the arr
        int i=0;  //idx on L
        int j=0;  //idx on R
        k=l;      // idx on original array
        while (i<n1 && j<n2)
        {
            if(L[i]<=R[j]) {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;

            }
            k++;

        }

        while (i<n1)
        {
            arr[k]=L[i];
            k++;
            i++;

        }

        while (j<n2)
        {
            arr[k]=R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr={3,2,1,5};
        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
