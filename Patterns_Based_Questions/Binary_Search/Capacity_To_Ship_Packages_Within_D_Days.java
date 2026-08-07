package Patterns_Based_Questions.Binary_Search;

public class Capacity_To_Ship_Packages_Within_D_Days {

    public static int shipWithinDays(int[] weights, int days) {
        int start = getMaxWeight(weights);  //Min capacity
        int end = getMaxCapacity(weights);
        int minCapacity=end;
        while (start<=end)
        {
            int mid = start+(end-start)/2;

//            System.out.println("Mid --> "+mid);
            if(checkCapacity(weights,mid,days))
            {
                minCapacity=mid;  //Mid can be aur potential answer  but will look for minimum than this
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return minCapacity;
    }

    public static int getMaxWeight(int[] weights)
    {
        int max  = 0;

        for(int w:weights)
        {
            max=Math.max(w,max);
        }
        return max;
    }
    public static  int getMaxCapacity(int[] weights)
    {
        int sum=0;
        for(int w :weights)
        {
            sum+=w;
        }
        return sum;
    }

    public static boolean checkCapacity(int[] weights , int capacity , int days)
    {
        int reqDays=0;
        int sum=0;
        int i=0;

        while (i<weights.length)
        {
            sum+=weights[i];

            if(reqDays>days) return false;
            if(sum>capacity)
            {
                reqDays++;
                sum=weights[i];
            }
            i++;

        }
        if(sum>0)
        {
            reqDays++;
        }
        return reqDays<=days;
    }

    public static void main(String[] args) {

        int[] weights ={1,2,3,4,5,6,7,8,9,10};
        int days = 10;
        System.out.println(shipWithinDays(weights,days));

//        System.out.println(checkCapacity(weights,9,days));
    }
}
