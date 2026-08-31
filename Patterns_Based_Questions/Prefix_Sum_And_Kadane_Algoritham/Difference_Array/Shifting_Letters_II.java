package Patterns_Based_Questions.Prefix_Sum_And_Kadane_Algoritham.Difference_Array;

import java.util.Arrays;

public class Shifting_Letters_II {

    public static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] updates = new int[n];

        StringBuilder result = new StringBuilder();

//        Step1 : Finding the difference array which is updates array
        for(int[] shift:shifts)
        {
            int L = shift[0];
            int R =shift[1];
            int dir = shift[2];

            int x = dir==1?1:-1;

            updates[L]+=x;
            if(R+1<n)
            {
                updates[R+1]-=x;
            }
        }

        ///Step 2: Calculate the Cumulative Sum
        for(int i=1;i<n;i++)
        {
            updates[i]+=updates[i-1];
        }

        int i=0;
        for(char c:s.toCharArray())
        {
            // if shift is bove 26 take it to range of 0-25
            updates[i]=updates[i] % 26;

            //// if it is negative wrap it to its positive value just like -1 becomes +25
            if(updates[i]<0)
            {
                updates[i]=updates[i] + 26;
            }


            //here also we do %26 so that after adding the resultant update it shopuld not go above 26
            char ch =(char) ((c-'a' + updates[i])%26 +'a');
            result.append(ch);
            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s="dztz";
        int[][] shifts = {{0,0,0},{1,1,1}};

        System.out.println(shiftingLetters(s,shifts));
    }
}
