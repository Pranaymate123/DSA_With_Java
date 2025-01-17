package Heap;

import java.util.PriorityQueue;

public class Sum_Of_Elements {

    public static int getSum(int [] arr,int k1,int k2)
    {
        int first=kthSmallest(arr,k1);
        int second=kthSmallest(arr,k2);

        System.out.println("First "+first);
        System.out.println("Second "+second);
        //in bettween first and second greater than first and smalleers than second
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > first && arr[i]<second)
            {
                sum+=arr[i];
            }
        }
        return sum;

    }

    public static int kthSmallest(int[] arr, int k)
    {

        //max Heap
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a, b)->b-a);
        for(int i=0;i<arr.length;i++)
        {
            if(maxHeap.size()<=k)
            {
                maxHeap.offer(arr[i]);
            }
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int [] arr={1,3,12,5,15,2};

        System.out.println(getSum(arr,2,6));
    }
}
