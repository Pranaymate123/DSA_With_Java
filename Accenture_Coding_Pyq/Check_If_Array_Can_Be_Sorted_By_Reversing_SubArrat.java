package Accenture_Coding_Pyq;

import java.util.Arrays;

public class Check_If_Array_Can_Be_Sorted_By_Reversing_SubArrat {

    public static boolean isSorted(int[] arr)
    {
        int i=0;
        boolean flag=false;
        while (!flag && i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
            {
                int first=i;
                while (i<arr.length-1 && arr[i]>arr[i+1])
                {
                    i++;
                }
               int  second=i;
                reverse(arr,first,second);
                flag=true;
            }
            i++;
        }
//        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1]) return false;
        }
        return true;
    }

    public static void reverse(int[] arr,int first,int second)
    {
        while (first<second)
        {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
            first++;
            second--;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,4,3};
        System.out.println(isSorted(arr));
    }
}
