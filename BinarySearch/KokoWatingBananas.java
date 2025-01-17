package BinarySearch;

import jdk.swing.interop.SwingInterOpUtils;

public class KokoWatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;

        int high=getMaxEle(piles);
        while (low<=high)
        {
            int mid=(high+low)/2;
            int tHrs=getTotalHrs(piles,mid);
            if(tHrs<=h)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int getMaxEle(int [] piles)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            {
                max=piles[i];
            }
        }
        return max;
    }

    public static int getTotalHrs(int[] piles,int h)
    {
        int tHrs=0;
        for(int i=0;i<piles.length;i++)
        {
            tHrs+=Math.ceilDiv(piles[i],h);
        }
        return tHrs;
    }

    public static void main(String[] args) {
        int [] piles={805306368,805306368,805306368};
        int h=1000000000;
        System.out.println(minEatingSpeed(piles,h));
        System.out.println(Math.ceilDiv(7,6));
    }
}
