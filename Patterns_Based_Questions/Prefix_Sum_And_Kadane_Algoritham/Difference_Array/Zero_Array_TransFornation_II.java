package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

public class Zero_Array_TransFornation_II {

    public static int minZeroArray(int[] nums, int[][] queries) {
        int q = queries.length;
        int n = nums.length;
        boolean allZeros = true;
        for(int num : nums)
        {
            if(num>0) {
                allZeros=false;
            }
        }
        if(allZeros) return 0;

        //bonary search cameo
        int l =0;
        int h = q-1;
        int ans = -1;
        while (l<=h)
        {
            int mid = l+ (h-l)/2;
            if(checkQuery(nums,queries,mid))
            {
                //this can be our potential answer
                ans= mid+1;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        //linear searc give tle
//        for(int i=0;i<q;i++)
//        {
//            if(checkQuery(nums,queries,i))
//            {
//                return i+1;
//            }
//        }
        return ans;
    }

    public static boolean checkQuery(int[] nums , int[][] queries , int k )
    {

        int[] diff = new int[nums.length];
        int n = nums.length;
        for(int i=0;i<=k;i++)
        {
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];

            diff[l]+=x;
            if(r+1 < n)
            {
                diff[r+1]-=x;
            }
        }
        //cumulative

        int cSum=0;
        for(int i=0;i<n;i++)
        {
            cSum+=diff[i];
            diff[i]=cSum;

            if(nums[i]-diff[i] >0 )
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {10};
        int[][] queries = {{0,0,5},{0,0,3},{0,0,2}};

        System.out.println(minZeroArray(nums,queries));
    }
}
