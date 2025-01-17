package Dynamic_Programming;

public class Maximum_Alternating_SubSequenece_Sum {

//    public static long solve(int[] nums,int idx,int flag,long[][] dp)
//    {
//        if(idx>=nums.length)
//        {
//            return 0;
//        }
//        if(dp[idx][flag]!=-1) return dp[idx][flag];
//
//        long skip=solve(nums,idx+1,flag,dp);
//        int val=nums[idx];
//        if(flag==0)
//        {
//            val=-val;
//        }
//        long pick=solve(nums,idx+1,flag==1?0:1,dp)+val;
//
//        return dp[idx][flag]= Math.max(skip,pick);
//    }
//    public static long maxAlternatingSum(int[] nums) {
//        long[][] dp=new long[1000000][2];
//
//        for(long[] e:dp)
//        {
//            Arrays.fill(e,-1);
//        }
//      return   solve(nums,0,1,dp);  //1  : +
//
//    }

//    ----------------------------------------------Bottom Up Approach ---------------------------------------------------------
    public static long maxAlternatingSum(int[] nums)
    {
        int n=nums.length;
        long [][] dp=new long[n+1][2];
        for(int i=1;i<n+1;i++)
        {
            //Even
            dp[i][0]=Math.max(dp[i-1][1]-nums[i-1],dp[i-1][0]);

            //odd
            dp[i][1]=Math.max(dp[i-1][0]+nums[i-1],dp[i-1][1]);
        }
        return Math.max(dp[n][0],dp[n][1]);
    }

    public static void main(String[] args) {
        int[] arr={4,2,5,3};
        System.out.println(maxAlternatingSum(arr));
    }
}
