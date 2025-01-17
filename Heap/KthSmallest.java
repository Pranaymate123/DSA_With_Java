package Heap;

import java.util.PriorityQueue;

public class KthSmallest {

    public static int kthSmallest(int[] arr, int k)
    {

        //max Heap
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->b-a);
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
        int arr[]={7,10,4,3,20,15};
        System.out.println(kthSmallest(arr,3));
    }
}
