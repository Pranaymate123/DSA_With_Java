package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;

import java.util.TreeMap;

public class Car_Pooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int[] trip : trips)
        {
            map.put(trip[1],map.getOrDefault(trip[1],0)+trip[0]);
            map.put(trip[2],map.getOrDefault(trip[2],0)-trip[0]);
        }

        //find cumusum that is overlappings
        int cSum=0;
        for(Integer key : map.keySet())
        {
            cSum+=map.get(key);
            if(cSum>capacity)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] trips ={{2,1,5},{3,3,7}};
        int capacity = 5;

        System.out.println(carPooling(trips,capacity));

    }
}
