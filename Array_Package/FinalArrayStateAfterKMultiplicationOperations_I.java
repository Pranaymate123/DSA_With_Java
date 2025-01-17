package Array_Package;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class FinalArrayStateAfterKMultiplicationOperations_I {

    public static int[] getFinalState(int[] nums, int k, int multiplier) {

        //min heap
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.val!=p2.val)
                {
                    return Integer.compare(p1.val,p2.val);
                }
                else
                {
                    return Integer.compare(p1.idx,p2.idx);
                }
            }
        });

        for(int i=0;i<nums.length;i++)
        {
            minHeap.add(new Pair(nums[i],i));
        }

        while (k>0  && !minHeap.isEmpty())
        {
            Pair minPair= minHeap.peek();
            nums[minPair.idx]=minPair.val*multiplier;
            minPair.val=nums[minPair.idx];
            minHeap.poll();
            minHeap.add(minPair);
            k--;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={2,1,3,5,6};
        System.out.println(Arrays.toString(getFinalState(nums,5,2)));
    }
}
