package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.*;

public class GroupAnagrams {

    public  static List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs)
        {
            ///Check if this key available in map
            String key = getKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key,list);

        }
        return  new ArrayList<>(map.values());
    }


    public static String  getKey(String str)
    {
        int[] arr= new int[26];

        for(char c:str.toCharArray())
        {
            arr[c-'a']=arr[c-'a']+1;
        }
        StringBuilder key = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                key.append((char) ('a'+i));
                key.append(arr[i]);
            }

        }
        return key.toString();
    }
    public static String sortString(String str)
    {
        char[] chararr = str.toCharArray();
        Arrays.sort(chararr);

        return new String(chararr);
    }


    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};


        System.out.println(getKey("eat"));
        System.out.println(getKey("ate"));
        System.out.println(groupAnagrams(strs));

    }
}
