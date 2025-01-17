package Heap;

import java.util.PriorityQueue;

public class Minimum_Cost_Of_Ropes {


   static long minCost(long arr[], int n)
    {
        PriorityQueue<Long> minHeap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            minHeap.add(arr[i]);
        }
        long totalCost=0;
        while (minHeap.size()>=2)
        {
            long a=minHeap.poll();
            long b=minHeap.poll();
            totalCost+=a+b;
            minHeap.add(a+b);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        long[] arr={4,3,2,6};
        System.out.println(minCost(arr,4));
    }
}
