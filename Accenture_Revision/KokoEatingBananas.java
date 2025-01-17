package Accenture_Revision;

public class KokoEatingBananas {

    public static int getMinimumSpeedToEatBananas(int[] arr,int h)
    {
        int start=1;
        int end=getMaxElement(arr);
        int ans=-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            int requiredHrs=getReuiredHrsForTheGivenSpeed(arr,mid);

            if(requiredHrs<=h)
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
    public static int getReuiredHrsForTheGivenSpeed(int [] arr,int n)
    {
        int hrs=0;
        for(int e:arr)
        {
            hrs+=e%n==0?e/n:(e/n)+1;
        }
        return hrs;
    }
    public static int getMaxElement(int [] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int e:arr)
        {
            if(e>max)
            {
                max=e;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={4,9,11,17};
        int H=8;
        System.out.println(getMinimumSpeedToEatBananas(arr,8));

    }
}
