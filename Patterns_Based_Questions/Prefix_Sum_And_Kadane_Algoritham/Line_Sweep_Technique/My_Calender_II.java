package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;

import java.util.TreeMap;

public class My_Calender_II {

    TreeMap<Integer,Integer> map;

    public My_Calender_II() {
        this.map=new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        map.put(startTime,map.getOrDefault(startTime,1));

        map.put(endTime,map.getOrDefault(endTime,-1));

        int cSum=0;
        for(Integer key:map.keySet())
        {
            int delta = map.get(key);
            cSum+=delta;

            if(cSum>2)
            {
                if(map.get(startTime)>1)
                {
                    map.put(startTime,map.get(startTime)-1);
                }
                else{
                    map.remove(startTime);
                }
                if(map.get(endTime)<-1)
                {
                    map.put(endTime,map.get(endTime)+1);
                }
                else{
                    map.remove(endTime);
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
