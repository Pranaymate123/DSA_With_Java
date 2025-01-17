package Array_Package;

import java.util.Arrays;

public class Max_Chunks_To_Make_Sorted {

    public static int maxChunksToSorted(int[] arr) {

//        int[] maxPrefix=new int[arr.length];
//        int[] minSuffix=new int[arr.length];
//
//        maxPrefix[0]=arr[0];
//        for(int i=1;i<arr.length;i++)
//        {
//            if(maxPrefix[i-1]<arr[i])
//            {
//                maxPrefix[i]=arr[i];
//            }
//            else
//            {
//                maxPrefix[i]=maxPrefix[i-1];
//            }
//        }
//
//        minSuffix[arr.length-1]=arr[arr.length-1];
//        for(int i=arr.length-2;i>=0;i--)
//        {
//            if(minSuffix[i+1]>arr[i])
//            {
//                minSuffix[i]=arr[i];
//            }
//            else
//            {
//                minSuffix[i]=minSuffix[i+1];
//            }
//        }
////        System.out.println(Arrays.toString(maxPrefix));
////        System.out.println(Arrays.toString(minSuffix));
//
//        int chunks=1;
//        for(int i=1;i<arr.length;i++)
//        {
//            if(maxPrefix[i-1]<minSuffix[i])
//            {
//                chunks++;
//            }
//        }
//
//        return chunks;


//        second approach

        int chunks=0;
        int cumulativeSum=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            cumulativeSum+=i;

            if(sum==cumulativeSum)
            {
                chunks++;
            }
        }
        return chunks;
    }


    public static void main(String[] args) {
        int[] arr={1,0,2,3,4};

        System.out.println(maxChunksToSorted(arr));
    }
}
