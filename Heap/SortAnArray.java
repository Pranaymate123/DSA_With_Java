package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortAnArray {
    public static int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            minHeap.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=minHeap.poll();
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}
