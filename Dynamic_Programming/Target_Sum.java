package Dynamic_Programming;

public class Target_Sum {

    public  static int findTargetSumWays(int[] nums, int target) {

        int[] count=new int[1];

        solve(0,count,nums,0,target);

        return count[0];

    }

    public static  void solve(int result,int[] count,int[] nums,int idx,int target)
    {
        if(idx>=nums.length)
        {
            if(result==target)
            {
                count[0]=count[0]+1;
            }
            return;
        }
        //Add + do
        result+=nums[idx];
        solve(result,count,nums,idx+1,target);
        //Add undo
        result-=nums[idx];

        //subtract - do

        result-=nums[idx];
        solve(result,count,nums,idx+1,target);
        result+=nums[idx];

    }
    public static void main(String[] args) {

        int[] nums={1,1,1,1};
        System.out.println(findTargetSumWays(nums,2));
    }
}
