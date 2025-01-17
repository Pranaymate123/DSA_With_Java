package Strings;

import java.util.Arrays;

public class Shifting_Letter_II {


    public String shiftingLetters(String s, int[][] shifts) {
        int[] diff=new int[s.length()];

        int n=s.length();
        for(int [] shift:shifts)
        {
            int L=shift[0];
            int R=shift[1];
            int dir=shift[2];

            if(dir==1)
            {
                diff[L]+=1;

                if(R+1<n)
                {
                    diff[R+1]-=1;
                }
            }
            else
            {
                diff[L]-=1;

                if(R+1<n)
                {
                    diff[R+1]+=1;
                }
            }
//            System.out.println("Shifts "+ Arrays.toString(diff) );
        }

//        System.out.println(Arrays.toString(diff));
        for(int i=1;i<n;i++)
        {
            diff[i]+=diff[i-1];
        }

//        System.out.println(Arrays.toString(diff));

        StringBuilder result=new StringBuilder(s);
        for(int i=0;i<n;i++)
        {
            int shift=diff[i]%26;
            if(shift<0)
            {
                shift+=26;
            }
           char newChar=(char) (((result.charAt(i)-'a'+shift) %26)+'a');

            result.setCharAt(i,newChar);
        }

        return result.toString();

    }

//    public String shiftingLetters(String s, int[][] shifts) {
//
//        for(int[] shift:shifts)
//        {
//            s=shiftString(s,shift[0],shift[1],shift[2]);
//        }
//        return s;
//    }
//    public String shiftString(String s,int start,int end,int direction)
//    {
////        "abc"
//
//        char[] arr=s.toCharArray();
//
//        for(int i=start;i<=end;i++)
//        {
//            if(direction==1)
//            {
//                arr[i]=moveForward(arr[i]);
//            }
//            else
//            {
//                arr[i]=moveBackward(arr[i]);
//            }
//        }
//
//        return new String(arr);
//
//    }
//
//    public char moveForward(char ch)
//    {
//        if(ch=='z') return 'a';
//        return ++ch;
//    }
//
//    public char moveBackward(char ch)
//    {
//        if(ch=='a') return 'z';
//        return --ch;
//    }
    public static void main(String[] args) {
        Shifting_Letter_II obj=new Shifting_Letter_II();
        int[][] shifts={{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(obj.shiftingLetters("abc",shifts));

    }
}
