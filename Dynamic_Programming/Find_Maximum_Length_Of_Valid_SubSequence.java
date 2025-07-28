package Dynamic_Programming;

public class Find_Maximum_Length_Of_Valid_SubSequence {

    int max=0;
    public int maximumLength(int[] nums, int k) {
        // size =0 , prev=0 ;
        helper(nums,0,-1,0,k,0);
        return max;

    }


    public void helper (int[] nums,int idx,int rem,int prev,int k,int size)
    {
        if(idx>=nums.length)
        {
            max=Math.max(max,size);
            return;
        }

        if(size==0)
        {

            if(max>(nums.length-idx+1))
            {
                return;
            }
            //take

            helper(nums,idx+1,rem,nums[idx],k,size+1);

            //not-take
            helper(nums,idx+1,rem,prev,k,size);
        }
        else if(size==1)
        {
            if(max>(nums.length-idx+1))
            {
                return;
            }
            //take
            helper(nums,idx+1,(prev+nums[idx]) %k,nums[idx],k,size+1);

            //not take
            helper(nums,idx+1,rem,prev,k,size);
        }
        else {
            if(rem==(nums[idx]+prev)%k)
            {
                //take
                helper(nums,idx+1,rem,nums[idx],k,size+1);
            }
            else {
//                not take
                helper(nums,idx+1,rem,prev,k,size);
            }
        }

    }
    public static void main(String[] args) {
        int[] nums={1,4,2,3,1,4,1,2,1,2};
        Find_Maximum_Length_Of_Valid_SubSequence obj=new Find_Maximum_Length_Of_Valid_SubSequence();
        System.out.println(obj.maximumLength(nums,3));
    }
}
