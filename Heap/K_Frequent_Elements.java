package Heap;

import java.util.*;

public class K_Frequent_Elements {
    class Pair
    {
        int val;
        int freq;

        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }
    }
    public  int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> minHeap =new PriorityQueue<>((a,b)->a.freq-b.freq);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if (!map.containsKey(nums[i]))
            {
               map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Integer item:map.keySet())
        {
            if(minHeap.size()<=k)
            {
                minHeap.add(new Pair(item,map.get(item)));
            }
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }

        int[] ans=new int[k];
        int i=0;
        while (!minHeap.isEmpty())
        {
            ans[i]=minHeap.poll().val;
            i++;
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        K_Frequent_Elements ob=new K_Frequent_Elements();
        int [] arr={1};
        int k=1;
        System.out.println(Arrays.toString(ob.topKFrequent(arr,k)));
    }

}

