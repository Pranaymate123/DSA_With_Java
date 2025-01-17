package Accenture_Revision;

import java.util.Arrays;
import java.util.Locale;

public class NoOfPermutaionsPossibleByFixingVowels {

    public static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }

    public static int getNumberOfPermutations(String str)
    {
        str=str.toLowerCase();
        int[] arr=new int[26];
        int countConsonants=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!isVowel(ch))
            {
               arr[ch-'a']=arr[ch-'a']+1;
               countConsonants++;
            }

        }
        int ans;
        int divisor=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>1)
            {
                divisor=divisor*getFactorial(arr[i]);
            }
        }

        return getFactorial(countConsonants)/divisor;
    }

    public static int getFactorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String str="ABBC";
        System.out.println(getNumberOfPermutations(str));


    }
}
