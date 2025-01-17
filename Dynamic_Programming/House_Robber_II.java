package Dynamic_Programming;

public class House_Robber_II {
    public static int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        //Solve for the case in which we steal 1st House
        int steal_first_house=house_robber_1(nums,0,nums.length-2);

        int not_steal_first_house=house_robber_1(nums,1,nums.length-1);

        return Math.max(steal_first_house,not_steal_first_house);

    }

//    public static int solve(int[] nums,int idx,int[] dp,int n)
//    {
//        if(idx>n)
//        {
//            return 0;
//        }
//
//        if(dp[idx]!=-1) return dp[idx];
//
//        int steal=nums[idx]+solve(nums,idx+2,dp,n);
//
//        int skip=solve(nums,idx+1,dp,n);
//
//        return dp[idx]= Math.max(steal,skip);
//    }

    public static int house_robber_1(int [] arr,int idx,int end)
    {
        int steal=arr[idx];
        int skip=0;
        int newSteal=0;
        int newSkip=0;

        for(int i=idx+1;i<=end;i++)
        {
            newSteal=arr[i] + skip;
            newSkip=Math.max(steal,skip);

            steal=newSteal;
            skip=newSkip;
        }
        return Math.max(steal,skip);
    }

    public static void main(String[] args) {
        int[] arr={2,3,2};
        System.out.println(rob(arr));
    }
}
