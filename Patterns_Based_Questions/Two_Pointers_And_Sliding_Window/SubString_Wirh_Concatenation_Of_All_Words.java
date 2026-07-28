package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.*;

public class SubString_Wirh_Concatenation_Of_All_Words {
    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        for(String w:words)
        {
            map1.put(w, map1.getOrDefault(w,0)+1);
        }
        int buff = words[0].length();
        int i=0;
        int j=0;
        int winSize = words.length * words[0].length();
        while (j<winSize)
        {
            String key = s.substring(j,j+buff);
            map2.put(key,map2.getOrDefault(key,0)+1);
            j=j+buff;
        }

        if(map1.equals(map2)){
            result.add(i);
        }
        System.out.println(map1);
        System.out.println(map2);

        while (j<s.length())
        {
            String key2 = s.substring(j,j+buff);
            map2.put(key2,map2.getOrDefault(key2,0)+1);
            String key1 = s.substring(i,i+buff);
            map2.put(key1,map2.get(key1)-1);

            if(map2.get(key1)==0) map2.remove(key1);
            j=j+buff;
            i=i+buff;

            if(map1.equals(map2))
            {
                result.add(i);
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return result;
    }

    public static void main(String[] args) {
        String s ="lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words ={"fooo","barr","wing","ding","wing"};

        System.out.println(findSubstring(s,words));
    }
}
