package Array_Package;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair{
    int val;
    int idx;

    public Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}
public class Find_Score_Of_Array_After_Marking_All_Elements {

    public static long findScore(int[] nums) {

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
        boolean [] marked=new boolean[nums.length];
        long score =0;
        for(int i=nums.length-1;i>=0;i--)
        {
            minHeap.add(new Pair(nums[i],i));
        }

        Arrays.fill(marked,false);
        while (!minHeap.isEmpty())
        {
            Pair pair = minHeap.peek();


            if(!marked[pair.idx])
            {

                score+=pair.val;
                marked[pair.idx]=true;
                if(pair.idx!=0)
                {
                    marked[pair.idx-1]=true;
                }
                if(pair.idx==nums.length-1)
                {
                    continue;
                }
                marked[pair.idx+1]=true;
            }
            minHeap.poll();

        }
        return score;
    }
    public static void main(String[] args) {
        int[] nums={2,4,6,6,10};
        System.out.println("Output");
        System.out.println(findScore(nums));
    }
}
