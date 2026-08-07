package Patterns_Based_Questions.Binary_Search;

public class Koko_Earting_Bananas {

    public static int minEatingSpeed(int[] piles, int h) {


        int start=1;
        int end = getMax(piles);
        int minSpeed=end;
        while (start<=end)
        {

            int mid = start + (end-start)/2;
//            System.out.println("Start "+start + "end " + end);
            if(check(piles , mid, h))
            {
                //This can be minimum
                minSpeed=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return minSpeed;
    }

    public static boolean check(int[] piles , int speed , int hours)
    {
//        System.out.println("Speed "+speed);
        int reqHrs=0;
        for(int p:piles)
        {

            reqHrs = reqHrs +Math.ceilDiv(p,speed);

            if(reqHrs>hours) return false;
        }


        return reqHrs<=hours;
    }

    public static int getMax(int[] piles)
    {
        int max=0;
        for(int p:piles)
        {
            max = Math.max(p,max);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] piles ={30,11,23,4,20} ;
        int h = 6;


        System.out.println(minEatingSpeed(piles,h));
    }
}
