package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.*;

public class Top_K_Frquent_Elements {

    static  class Pair{
        int key;
        int frequency;

        public Pair(int key, int frequency) {
            this.key = key;
            this.frequency = frequency;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {

//        Map<Integer,Integer> map = new TreeMap<>();
//        for(int n:nums)
//        {
//            map.put(n,map.getOrDefault(n,0)+1);
//        }
//
//        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.frequency - b.frequency);
//
//        for(Integer key:map.keySet())
//        {
//            pq.offer(new Pair(key,map.get(key)));
//            if(pq.size()>k){
//                pq.poll();
//            }
//        }
//
//        int[] ans = new int[k];
//
//        for(int i=k-1;i>=0;i--)
//        {
//            ans[i] = pq.poll().key;
//        }
//        return ans;


        //bukcet sort approach


        Map<Integer,Integer> map = new TreeMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int n= nums.length;
        List<List<Integer>> list = new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }

        for(Integer key: map.keySet())
        {
            int freq = map.get(key);
            list.get(freq).add(key);
        }

//        System.out.println(list);
        int m=0;
        int[] ans = new int[k];
        for(int i=list.size()-1;i>=0;i--)
        {
            List<Integer> temp = list.get(i);
            if(temp.isEmpty()) continue;
            for(Integer num : temp)
            {
                if(m==k)
                {
                    return ans;
                }
                ans[m]=num;
                m++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[]  nums = {1,1,1,2,2,3,3,3,3};
        int k = 2;

        System.out.println( Arrays.toString(topKFrequent(nums,k)));
    }
}
