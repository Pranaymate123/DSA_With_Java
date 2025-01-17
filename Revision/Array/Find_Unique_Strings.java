package Revision.Array;

import java.util.*;

public class Find_Unique_Strings {
   public static int workingWeeks(int[] projC)
   {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


       for (int modules : projC) {
           if (modules > 0) {
               maxHeap.add(modules);
           }
       }

       int weeks = 0;


       // Simulate the process week by week
       while (maxHeap.size() > 1) {

           int first = maxHeap.poll();

           int second = maxHeap.poll();



           weeks += 2;

           if (first - 1 > 0) {
               maxHeap.add(first - 1);
           }
           if (second - 1 > 0) {
               maxHeap.add(second - 1);
           }
       }

       if (!maxHeap.isEmpty()) {
           weeks++;
       }

       return weeks;
   }

    public static long minDamage(int power, int[] damage, int[] health) {

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<damage.length;i++)
        {
            map.put(damage[i],health[i]);
        }
        Arrays.sort(damage);
        long ans=0;
        int point=0;
        int sum=0;
        for(int i=damage.length-1;i>=0;i--)
        {

            int time=(map.get(damage[i])+power-1)/power;
            sum=0;
            for(int j=i-1;j>=0;j--)
            {
                sum+=damage[j];
            }
            point=point + (sum+damage[i])*time;
            System.out.println("pont"+point+"time"+time);
        }
        return point;
    }


    public static void main(String[] args) {
       int power=4;
       int[] damage={1,2,3,4};
       int[] health={4,5,6,8};
        System.out.println(minDamage(power,damage,health));


    }
}
