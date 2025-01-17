package Greedy;

import java.util.Arrays;

public class Halloween_Candies {

    public static int getNoOfCandies(int[] arr, int money)
    {
        //sorted the array in increasing order to maximize the count of the candies that can purchase by first buying the
        //candies which have minimum prices
        int cnt=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%5==0) cnt++;
            else if(arr[i]<=money)
            {
                cnt++;
                money=money-arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] candies={5,5,105,14,1,2,3,4};
        System.out.println(getNoOfCandies(candies,16));
    }
}
