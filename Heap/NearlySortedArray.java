package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySortedArray {

   public static ArrayList<Integer> nearlySorted(int arr[], int num, int k)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        // your code here
        // code here
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int j=0;
        for(int i=0;i< arr.length;i++)
        {
            if(minHeap.size()<=k)
            {
                minHeap.offer(arr[i]);
            }
            if(minHeap.size()>k)
            {
                ans.add(minHeap.poll());
            }
        }
        while (!minHeap.isEmpty())
        {
            ans.add(minHeap.poll());
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6,5,3,2,8,10,9};
        System.out.println(nearlySorted(arr, arr.length, 3));
    }
}
