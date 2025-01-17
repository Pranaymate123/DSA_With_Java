package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;


public class FrequencySort {


    class Pair{
        char ch;
        int freq;

        public Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Pair> maxHeap=new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        }

        for(Character ch:map.keySet())
        {

            maxHeap.add(new Pair(ch,map.get(ch)));
        }

        StringBuilder sb=new StringBuilder("");
        while (!maxHeap.isEmpty())
        {
            Pair p=maxHeap.peek();
            char ch=p.ch;
            int freq=p.freq;
            for(int i=0;i<freq;i++)
            {
                sb.append(ch);
            }
            maxHeap.poll();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="Aabb";
        FrequencySort pobj=new FrequencySort();
        System.out.println(pobj.frequencySort(str));
    }

}
