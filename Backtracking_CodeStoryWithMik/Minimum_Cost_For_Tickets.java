package Backtracking_CodeStoryWithMik;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Minimum_Cost_For_Tickets {

    //Approach 2: Bottom Up Approach
    public int mincostTickets(int[] days, int[] costs) {

        int lastDay=days[days.length-1];
        int [] t=new int[lastDay+1];

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<days.length;i++)
        {
            set.add(days[i]);
        }


        for(int i=1;i<=lastDay;i++)
        {
            if(!set.contains(i))
            {
                t[i]=t[i-1];
                continue;
            }



            int cost_day1=costs[0] + t[Math.max(i-1,0)];

            int cost_day7=costs[1] + t[Math.max(i-7,0)];

            int cost_day30=costs[2] + t[Math.max(i-30,0)];

            t[i]= Math.min(Math.min(cost_day1,cost_day7),cost_day30);
        }
        return t[lastDay];
    }

    // Approach 1 : Recursion + Memoization
//    public int mincostTickets(int[] days, int[] costs) {
//
//        int[] dp=new int[days.length+1];
//        Arrays.fill(dp,-1);
//       return solve(0,days,costs,dp);
//
//    }
//    public int solve(int idx,int[] days,int[] costs,int[] dp)
//    {
//        if(idx>=days.length)
//        {
//            return 0;
//        }
//        if(dp[idx]!=-1) return dp[idx];
//        //One day pass
//        int cost_day1=costs[0]+solve(idx+1,days,costs,dp);
//
//         // Seven Days Pass
//        int maxDay=days[idx]+7;
//        int j=idx;
//        while (j< days.length &&days[j]<maxDay)
//        {
//            j++;
//        }
//
//        int cost_day7=costs[1]+solve(j,days,costs,dp);
//
//        // 30 days pass
//        maxDay=days[idx]+30;
//         j=idx;
//         while (j<days.length &&days[j]<maxDay)
//         {
//             j++;
//         }
//         int cost_day30=costs[2]+solve(j,days,costs,dp);
//
//         return dp[idx]=Math.min(Math.min(cost_day1,cost_day7),cost_day30);
//    }
    public static void main(String[] args) {

        Minimum_Cost_For_Tickets c=new Minimum_Cost_For_Tickets();
        int[] days={1,4,6,7,8,20};
        int[] costs={2,7,15};
        System.out.println(  c.mincostTickets(days,costs));
    }
}
