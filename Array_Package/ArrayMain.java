package Array_Package;

import java.util.Arrays;

public class ArrayMain {

    public static int LargestNum(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return  max;
    }
    public static int BinSearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length;
       int mid=0;
        while (start<=end)
        {
            mid=start+(end-start)/2;
             if(arr[mid]==target)
             {
                 return mid;
             } else if (arr[mid]>target) {
                 end=mid-1;

             }else{
                 start=mid+1;
             }
        }
        return -1;
    }
    public static int[] ReverseArray(int arr[])
    {
        int s=0;
        int e=arr.length-1;
        while (s<e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void  PairsOfArray(int arr[])
    {
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {

            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                tp++;
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();

        }
        System.out.println("Total Pairs "+tp);
    }

    public static void PrintSubArrays(int [] arr)
    {
        int total=0;
        int maxSubArraySum=Integer.MIN_VALUE;
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        //start
        for(int i=0;i<arr.length;i++)
        {
            //end
            for(int j=i;j<arr.length;j++)
            {
                total++;
                int sum=0;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                System.out.print("[");
                sum=prefix[j]-prefix[i-1];
//                for(int k=i;k<=j;k++)
//                {
//                    if(arr[k]>max)
//                    {
//                        max=arr[k];
//                    }
//                    if(arr[k]<min)
//                    {
//                        min=arr[k];
//                    }
//                    sum=sum+arr[k];
//                    System.out.print(arr[k]+",");
//                }
                if(sum>maxSubArraySum)
                {
                    maxSubArraySum=sum;
                }
                System.out.print("] ");
                System.out.println( "{ Sum == "+ sum +", Max = "+max +", Min = "+min+" }");
            }
            System.out.println();
        }
        System.out.println("Total Number Of SubArrays "+total);
        System.out.println("Maximum Sum of SubArray Is "+maxSubArraySum);
    }
    public static int KadanesMaxSumOfSubArray(int arr[])
    {
        int maxSum=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+sum >0)
            {
                sum=sum+arr[i];
            }else {
                sum=0;
            }
            if(sum>maxSum)
            {
                maxSum=sum;
            }


        }
        return maxSum;
    }





    public static void main(String[] args) {
            int arr[]={10,20,30,40,50,60,70,80,90};
//           int max= LargestNum(arr);
//        System.out.println("Largest Number is "+max);
//        System.out.println(BinSearch(arr,10));
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Reverse Is "+ Arrays.toString(ReverseArray(arr)));
//        System.out.println(Arrays.toString(arr));
//        PairsOfArray(arr);

//        PrintSubArrays(arr);
        System.out.println("Maximum Sum Of Subarray "+KadanesMaxSumOfSubArray(arr));
    }
}
