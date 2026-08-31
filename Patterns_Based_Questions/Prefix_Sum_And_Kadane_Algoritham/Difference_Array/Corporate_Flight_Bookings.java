package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

import java.util.Arrays;

public class Corporate_Flight_Bookings {

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] totalSeats = new int[n];

// totalSeats[L] +=x
//    totalSeats[L] -=x

        // NOTE : HERE Positions are given not actual indexes

        for(int[] booking : bookings)
        {
            totalSeats[booking[0]-1] += booking[2];
            if((booking[1])<n)
            {
                totalSeats[booking[1]]-=booking[2];
            }
        }

        //Take Cumulative Sums
        for(int i=1;i<n;i++)
        {
            totalSeats[i]=totalSeats[i] + totalSeats[i-1];
        }

        return totalSeats;


    }
    public static void main(String[] args) {
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int n =  5;

        System.out.println(Arrays.toString(corpFlightBookings(bookings,n)));


    }
}
