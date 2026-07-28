package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_SubString {

    public static String minWindow(String s, String t) {
        int n = s.length();
        if(n<t.length()) return "";

        Map<Character,Integer> map = new HashMap<>();
        for(char c:t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int start_idx=0;
        int minWindowSize = Integer.MAX_VALUE;
        int requiredCount = t.length();

        int i=0,j=0;
        char[] arr = s.toCharArray();
        while (j<n)
        {
            char ch = arr[j];

            if(map.containsKey(ch))
            {
                if(map.get(ch)>0)
                {
                    requiredCount--;
                    map.put(ch,map.get(ch)-1);

                    while (requiredCount==0)
                    {
                        int currWinSize = j-i+1;

                        if(minWindowSize>currWinSize)
                        {
                            minWindowSize=currWinSize;
                            start_idx=i;
                        }

                        char c = arr[i];
                        if(!map.containsKey(c)) {
                            i++;
                            continue;
                        }
                        map.put(c,map.get(c)+1);
                        if(map.get(c)>0)
                        {
                            requiredCount++;
                        }
                        i++;
                    }
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            j++;
        }

//        System.out.println("Start idx "+ start_idx +"win size "+minWindowSize);
        return minWindowSize==Integer.MAX_VALUE ? "":s.substring(start_idx,start_idx+minWindowSize);


//        int n = s.length();
//        if(t.length()>n) return "";
//        Map<Character,Integer> map = new HashMap<>();
//        for(char c:t.toCharArray())
//        {
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//
//        int requiredCount=t.length();
//        int i=0,j=0;
//        int minWindowSize= Integer.MAX_VALUE;
//        int start_idx=0;
//        char[] arr = s.toCharArray();
//        while (j<n)
//        {
//            char ch = arr[j];
//            if(map.containsKey(ch))
//            {
//                if(map.get(ch)>0)
//                {
//                    requiredCount--;
//                    map.put(ch,map.get(ch)-1);
//
//                    while (requiredCount==0)
//                    {
//                        int currWinSize = j-i+1;
//                        if(minWindowSize>currWinSize)
//                        {
//                            minWindowSize=currWinSize;
//                            start_idx=i;
//                        }
//                        char c = arr[i];
//                        map.put(c,map.get(c)+1);
//                        if(map.get(c)>0)
//                        {
//                            requiredCount++;
//                        }
//
//                        i++;
//                    }
//
//                }
//                else{
//                    map.put(ch,map.get(ch)-1);
//                }
//
//            }
//            else{
//                map.put(ch,map.getOrDefault(ch,0)-1);
//
//            }
//            j++;
//        }
//
//        return  minWindowSize==Integer.MAX_VALUE ? "":s.substring(start_idx,start_idx+minWindowSize);

    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t ="ABC";

        System.out.println(minWindow(s,t));
    }
}
