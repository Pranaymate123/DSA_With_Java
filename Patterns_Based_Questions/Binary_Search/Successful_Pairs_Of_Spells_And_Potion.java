package Patterns_Based_Questions.Binary_Search;

import java.util.Arrays;

public class Successful_Pairs_Of_Spells_And_Potion {

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);
        int i=0;
        for(int s:spells)
        {
            int count =getNumOfPairs(s,potions,success);
            pairs[i]=count;
            i++;
        }

        return pairs;
    }
    public static int getNumOfPairs(int spell , int[] potions, long success)
    {
        int n = potions.length;

        int l = 0;
        int h = n-1;
        int ans=-1;
        while (l<=h)
        {
            int mid = l + (h-l) /2;

            long prod = (long) spell * potions[mid];

            if(prod>=success)
            {
                //we are saving mid in ans because this can be aur idx ans but we look for better solution also
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return ans==-1? 0 : n-ans ;
    }

    public static void main(String[] args) {
        int[] spells ={1,2,3,4,5,6,7};
        int[] potions = {1,2,3,4,5,6,7};
        int success =  25;

        System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));

//        System.out.println(getNumOfPairs( 1, potions ,success));
    }
}
