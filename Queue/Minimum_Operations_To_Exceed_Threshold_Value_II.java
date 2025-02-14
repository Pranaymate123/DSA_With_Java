package Queue;

import java.util.PriorityQueue;

public class Minimum_Operations_To_Exceed_Threshold_Value_II {

    public static int minOperations(int[] nums, int k) {

        PriorityQueue<Long> minHeap=new PriorityQueue<>();
        for(int e:nums)
        {
            minHeap.add((long) e);
        }

        int count=0;
        while (minHeap.peek()<k)
        {
            long num1=0;
            long num2=0;
            if(minHeap.size()>=2)
            {
                num1=minHeap.poll();
                num2=minHeap.poll();
                count++;
                minHeap.add(Math.min(num1,num2) * 2 + Math.max(num1,num2));
            }
            else
            {
                break;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums={2,11,10,1,3};
        int k=10;
        System.out.println(minOperations(nums,10));
    }
}
