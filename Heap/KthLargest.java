package Heap;

import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] arr, int k) {
        //minHeap
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            if(minHeap.size()<=k)
            {
                minHeap.offer(arr[i]);
            }

            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        System.out.println(findKthLargest(arr,3));
    }
}
