package Array_Package;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_Candies {
    public static List <Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandy=0;
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>maxCandy)
            {
                maxCandy=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++)
        {
            result.add((candies[i]+extraCandies) >= maxCandy);
        }
        return result;

    }

    public static void main(String[] args) {
        int [] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
