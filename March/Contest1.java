package March;

import java.util.PriorityQueue;

public class Contest1 {
    public static int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        int cnt=0;
        while (pq.peek()<k)
        {
            pq.remove();
            cnt++;
        }
        return cnt;
    }
    public static int minOperations2(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.add((long)nums[i]);
        }

        int cnt=0;
        while(pq.peek() < (long) k)
        {
            long y=0;
            long x=pq.remove();
            if(pq.peek()!=null)
                 y=pq.poll();
            else
                return cnt;
           long newEle=Math.min(x,y)*2 + Math.max(x,y);
            pq.add(newEle);
            cnt++;
        }
        return cnt;

    }

    public static void main(String[] args) {
        int arr[]={1000000000,999999999,1000000000,999999999,1000000000,999999999};
        int k=1000000000;

        System.out.println(  minOperations2(arr,k));

    }
}



