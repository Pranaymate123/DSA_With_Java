package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;

import java.util.TreeMap;

public class My_Calender_III {

    TreeMap<Integer,Integer> map;

    public My_Calender_III() {
        this.map=new TreeMap<>();

    }

    public int book(int startTime, int endTime) {
        map.put(startTime,map.getOrDefault(startTime,0)+1);

        map.put(endTime,map.getOrDefault(endTime,0)-1);
        // System.out.println("Map --> "+map);

        int cSum=0;
        int max=0;
        for(Integer key:map.keySet())
        {
            int delta = map.get(key);
            cSum+=delta;

          max=  Math.max(max,cSum);
        }
        return max;
    }
    public static void main(String[] args) {

    }

}
