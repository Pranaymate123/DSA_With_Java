package BinarySearch;

public class Capacity_To_Ship_The_Packages_In_D_Days {

    public static int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int w:weights)
        {
            sum+=w;
        }

        int start=getMaxElement(weights);
        int end=sum;
        int ans=-1;

        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(isPossibleCapacity(weights,days,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return ans;
    }

    public static boolean isPossibleCapacity(int[] weights,int days,int mid)
    {
        int totalDaysRequired=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum=sum+weights[i];
            if(sum == mid)
            {
                totalDaysRequired++;
                sum=0;
            }
            else if(sum>mid) {
                totalDaysRequired++;
                sum=weights[i];
            }
        }
        //for last element
        if(sum>0) totalDaysRequired++;

        System.out.println(totalDaysRequired+ " for "+ mid);
        return totalDaysRequired<=days;
    }

    public static int getMaxElement(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        for(int e:nums)
        {
            if(e>max)
            {
                max=e;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,1,1};
        System.out.println(shipWithinDays(nums,4));

//        System.out.println(isPossibleCapacity(nums,5,7));
    }
}
