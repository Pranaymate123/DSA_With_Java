package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Anagrams_In_A_String {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        if(p.length()>s.length()) return result;
        int[] map1 = new int[26];
        for(char c:p.toCharArray())
        {
            map1[c-'a']++;
        }
        int[]  map2 = new int[26];

        char[] srr = s.toCharArray();

        int i=0;
        int j=0;
        int winSize=p.length();

        while (j<winSize)
        {
            map2[srr[j]-'a']++;
            j++;
        }

//        i=0; j=3;
        if(Arrays.equals(map1,map2))
        {
            result.add(i);
        }

        while (j<s.length())
        {
            map2[srr[j]-'a']++;
            map2[srr[i]-'a']--;
            i++;
            j++;
            if(Arrays.equals(map1,map2))
            {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String s ="abab";
        String p ="ab";

        System.out.println(findAnagrams(s,p));
    }
}
