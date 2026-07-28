package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Longest_Repeating_Character_Replacement {

    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int[] map = new int[26];
        int maxWindowSize = Integer.MIN_VALUE;
        int i=0,j=0;
        int windowSize = 0;
        int maxFreq=0;

        char[] arr = s.toCharArray();
        while (j<n)
        {
            char ch = arr[j];
            map[ch-'A']++;
            windowSize++;
            maxFreq = getMaxFreq(map);

            int chars_need_to_change = windowSize-maxFreq;

            if(chars_need_to_change<=k)
            {
                maxWindowSize=Math.max(maxWindowSize,windowSize);
//                System.out.println("Max Win Size "+maxWindowSize);
            }
            else{
                while ( i < n  && i< j && chars_need_to_change>k)
                {
                    char c = arr[i];
                   map[c-'A']--;
                    windowSize--;
                    maxFreq= getMaxFreq(map);
                    chars_need_to_change = windowSize-maxFreq;
                    i++;
                }
            }
            j++;
        }

        return maxWindowSize;
    }

    public static Integer getMaxFreq(int[] map)
    {
        int ansMax =0;

        for(int  i : map)
        {
            ansMax=Math.max(ansMax,i);
        }
        return ansMax;
    }

    public static void main(String[] args) {
        String s="ABBA";
        int k = 2;

        System.out.println(characterReplacement(s,k));
    }
}
