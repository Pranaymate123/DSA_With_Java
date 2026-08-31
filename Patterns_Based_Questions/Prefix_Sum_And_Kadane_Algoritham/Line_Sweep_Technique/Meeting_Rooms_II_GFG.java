package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Line_Sweep_Technique;


import java.util.ArrayList;
import java.util.List;

public class Meeting_Rooms_II_GFG {
    static class Pair{
        int first;
        int delta;
        Pair(int first,int delta){
            this.first=first; this.delta=delta;
        }
    }

    //WE CAN ALSO USE THE TREEMAP HERE

    public static int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length;
        List<Pair> events = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            events.add(new Pair(start[i],1));
            events.add(new Pair(end[i],-1));
        }

        events.sort((a,b)->{
            if(a.first!=b.first)
            {
                return a.first-b.first;
            }
            return a.delta-b.delta;
        });


        int currRoom=0;
        int maxRoom=0;   //max operlapping intervals
        for(Pair p : events)
        {
            currRoom+=p.delta;

            if(currRoom>maxRoom)
            {
                maxRoom=currRoom;
            }
        }

        return maxRoom;
    }
    public static void main(String[] args) {

        int[] start = {2,9,6};
        int[] end = {4,12,10};

        System.out.println(minMeetingRooms(start,end));
    }
}
