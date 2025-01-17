package Dynamic_Programming;

public class Two_Best_Non_Overlapping_Events {

    public static int maxTwoEvents(int[][] events) {

        return solve(events,0,0);
    }

    public static int solve(int [][] events,int idx,int count)
    {
        if(idx>=events.length) return 0;

        if(count>=2) return 0;

        int take=-1;
        int notTake=-1;

        if(idx!=events.length-1 &&events[idx][1]<events[idx+1][0])
        {
            take=events[idx][2]+solve(events,idx+1,count+1);
        }
        notTake=solve(events,idx+1,count);

        return Math.max(take,notTake);
    }
    public static void main(String[] args) {
        int[][] events={{1,3,2},{4,5,2},{2,4,3}};
        System.out.println(maxTwoEvents(events));
    }
}
