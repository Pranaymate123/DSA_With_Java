package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.Arrays;

public class Permutation_In_String {

    public static boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int[] freqs1 = new int[26];
        for(char c:s1.toCharArray())
        {
            freqs1[c-'a']++;
        }

        int[] windowFreq = new int[26];

        int i=0;
        int j=0;
        char[] arr = s2.toCharArray();
        while (j<s1.length())
        {
            windowFreq[arr[j]-'a']++;
            j++;
        }
        if(Arrays.equals(freqs1,windowFreq)) return true;


        while (j<s2.length())
        {
            windowFreq[arr[i]-'a']--;
            i++;
            windowFreq[arr[j]-'a']++;
            if(Arrays.equals(freqs1,windowFreq)) return true;
            j++;
        }

        return false;
    }


    public static void main(String[] args) {

        String s1="abc";

        String s2 = "eibacooodf";

        System.out.println(checkInclusion(s1,s2));

    }
}
