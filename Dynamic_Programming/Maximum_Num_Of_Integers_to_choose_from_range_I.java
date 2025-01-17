package Dynamic_Programming;

import java.util.*;

public class Maximum_Num_Of_Integers_to_choose_from_range_I {

    public static int maxCount(int[] banned, int n, int maxSum) {

        Set<Integer> set=new HashSet<>();
        for(int e:banned)
        {
            set.add(e);
        }

        List<Integer> lst=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                lst.add(i);
            }
        }

        //Memoization ,,, Dynamic Programming
        int[] dp=new int[lst.size()+1];
        Arrays.fill(dp,-1);
        return solve(lst,0,0,maxSum,dp);
    }

    public static int solve(List<Integer> lst,int idx,int sum,int maxSum,int[] dp)
    {
        if(idx>=lst.size()) return 0;

        if(sum>=maxSum) return 0;

        if(dp[idx]!=-1) return dp[idx];

        int take=-1;
        int notTake=-1;

        if(sum+lst.get(idx) <= maxSum)
        {
            take=1+solve(lst,idx+1,sum+lst.get(idx),maxSum,dp);
        }
        notTake=solve(lst,idx+1,sum,maxSum,dp);
        return  dp[idx]=Math.max(take,notTake);
    }


    public static void main(String[] args) {
        int[] banned={1,6,5};
        int n=5;
        int maxSum=6;
        System.out.println(maxCount(banned,n,maxSum));

    }

}
