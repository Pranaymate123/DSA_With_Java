package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Pair{ int year; int delta; Pair(int year,int delta){ this.year=year; this.delta=delta; } }

public class Maximum_Population_Year {

    //public static int maximumPopulation(int[][] logs) {



//
//        TreeMap<Integer,Integer> events = new TreeMap<>();
//        for(int[] l : logs)
//        {
//           events.put(l[0],events.getOrDefault(l[0],0)+1);
//            events.put(l[1],events.getOrDefault(l[1],0)-1);
//
//        }
//
//
//
//
//        int maxPop=0;
//        int ansYear=-1;
//        int population=0;
//        for(Integer year : events.keySet())
//        {
//
//
//            population+=events.get(year);
//            System.out.println("Year "+year + "  Curreent  Population "+ population);
//            if(population>maxPop)
//            {
//                maxPop=population;
//                ansYear=year;
//            }
//        }
//        return ansYear;
   // }

    public static int maximumPopulation(int[][] logs) {
        List<Pair> events = new ArrayList<>();

        for (int[] l : logs) {
            events.add(new Pair(l[0], 1));
            events.add(new Pair(l[1], -1));
        }

        events.sort((a,b) -> {
            if (a.year != b.year)
                return a.year - b.year;

            return a.delta - b.delta; // -1 before +1
        } );

        int maxPop = 0;
        int ansYear = -1;
        int population = 0;

        for (Pair p : events) {
            population += p.delta;

            if (population > maxPop) {
                maxPop = population;
                ansYear = p.year;
            }
        }

        return ansYear;
    }
    public static void main(String[] args) {

        int[][] logs = {{2008,2026},{2004,2008},{2034,2035},{1999,2050},{2049,2050},{2011,2035},{1966,2033},{2044,2049}};

        System.out.println(maximumPopulation(logs));
    }
}
