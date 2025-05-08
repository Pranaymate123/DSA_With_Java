package Greedy;

import java.util.Arrays;

public class Push_Dominoes {

    public static String pushDominoes(String dominoes) {
        int rightP=0;
        int leftP=0;
         int[]rightForce=new int[dominoes.length()];
         int[]leftForce=new  int[dominoes.length()];

         char[] domino=dominoes.toCharArray();
         int rightF=0;
         int i=1;
         while (i<dominoes.length())
         {

             if(domino[i-1]=='R')
             {
                 rightForce[i]=1;
                 i++;
                 while (i<dominoes.length() && domino[i]!='L')
                 {

                     rightForce[i] = rightForce[i-1]-1;
                     i++;
                 }
                 continue;
             }

             if(domino[i]=='L' || domino[i]=='.')
             {
                 rightForce[i]=0;
             }
             i++;
         }
        System.out.println(Arrays.toString(rightForce));
        return  "";
    }

    public static void main(String[] args) {
        String str=".L.RR..LR..L..";
        System.out.println(pushDominoes(str));
    }
}
