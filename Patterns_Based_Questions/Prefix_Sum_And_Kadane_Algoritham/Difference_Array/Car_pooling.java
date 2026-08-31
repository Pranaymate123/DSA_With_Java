package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

import java.util.TreeMap;

public class Car_pooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1002];

        for(int[] trip : trips)
        {
            int l = trip[1];
            int r = trip[2];
            int x = trip[0];

            diff[l]+=x;
            diff[r+1]-=x;
        }

        //cumulative sum
        int cSum=0;
        for(int i=0;i<1002;i++)
        {
            cSum+=diff[i];
            diff[i]=cSum;

            if(cSum>capacity)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] trips ={{2,1,5},{3,3,7}};
        int capacity = 5;

        System.out.println(carPooling(trips,capacity));

    }
}
