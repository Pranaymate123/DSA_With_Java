package Cognizant_Coding_Pyq;

import java.awt.print.Pageable;

public class Star_Sum {

    public static int getStarSum(int num)
    {
        int starSum=0;
        while (num>0)
        {
            starSum+=num;
            num=num/10;
        }
        return starSum;
    }
    public static int getCountOfStarsSum(int num)
    {
        int starSum=0;
        int cnt=0;
        int temp=num;
        starSum=getStarSum(temp);
        while (starSum>num)
        {
            temp--;
            cnt++;
            starSum=getStarSum(temp);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfStarsSum(112));
    }
}
