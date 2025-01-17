package Dynamic_Programming;

public class House_Robber_I {

//    public static int rob(int[] nums) {
//        int[] dp=new int[nums.length+1];
//        Arrays.fill(dp,-1);
//        return solve(nums,0,dp);
//    }
//
//    public static int solve(int[] nums,int idx,int[] dp)
//    {
//        if(idx>=nums.length)
//        {
//            return 0;
//        }
//
//        if(dp[idx]!=-1) return dp[idx];
//
//        int steal=nums[idx]+solve(nums,idx+2,dp);
//
//        int skip=solve(nums,idx+1,dp);
//
//        return dp[idx]= Math.max(steal,skip);
//    }

    //---------------------------House Robber With The O(n) Space Approach

//    public static int house_robber_with_n_space(int[] arr)
//    {
//        int[] dp=new int[arr.length+1];
//        dp[0]=0;
//        dp[1]=arr[0];
//        for(int i=2;i<dp.length;i++)
//        {
//            int steal=arr[i-1]+dp[i-2]; // Steal Kiya toh pichla 2nd + current vale ki sum aayegi
//            int skip=dp[i-1]; // skip kiya toh dp me ka last prev vala aa jayega sidha
//
//            dp[i]=Math.max(steal,skip);
//        }
////        System.out.println(Arrays.toString(dp));
//        int max=-1;
//        for(int i=0;i<dp.length;i++)
//        {
//            if(dp[i]>max)
//            {
//                max=dp[i];
//            }
//        }
//        return max;
//    }

//   -----------------------------House Robber With Constant Space Approach ------------------------------
   public static int house_robber_1(int [] arr)
   {
       int steal=arr[0];
       int skip=0;
       int newSteal=0;
       int newSkip=0;
       for(int i=1;i<arr.length;i++)
       {
           newSteal=arr[i] + skip;
           newSkip=Math.max(steal,skip);

           steal=newSteal;
           skip=newSkip;
       }
       return Math.max(steal,skip);
   }
    public static void main(String[] args) {
        int [] arr={1,2,3,1};
        System.out.println(house_robber_1(arr));
    }
}
