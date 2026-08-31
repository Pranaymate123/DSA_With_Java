package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Describe_The_Painting {

    public static List<List<Long>> splitPainting(int[][] segments) {
        List<List<Long>> result = new ArrayList<>();
        TreeMap<Long,Long> map = new TreeMap<>();


        for(int[] segment:segments)
        {
            map.put((long)segment[0],map.getOrDefault((long)segment[0],0L)+segment[2]);
            map.put((long)segment[1],map.getOrDefault((long)segment[1],0L)-segment[2]);
        }

        long cSum=0;
        List<Long> keys = new ArrayList<>(map.keySet());
        //sweep line
       for(int i=0;i<map.size()-1;i++)
       {
           cSum+=map.get(keys.get(i));
           if(cSum==0) continue; //skip
           List<Long> ds = new ArrayList<>();
           ds.add((long)keys.get(i));
           ds.add((long)keys.get(i+1));
           ds.add(cSum);
           result.add(ds);
       }
        return result;
    }

    public static void main(String[] args) {
        int[][] segments = {{1,7,9},{6,8,15},{8,10,7}};

        System.out.println(splitPainting(segments));
    }
}
