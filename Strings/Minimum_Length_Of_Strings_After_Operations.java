package Strings;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Length_Of_Strings_After_Operations {

    public static int minimumLength(String str) {
        if(str.length()<=2) return str.length();

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int size=0;
        for(Character key:map.keySet())
        {
            if(map.get(key)%2==0)
            {
                size+=2;
            }
            else
            {
                size++;
            }
        }

        return size;

    }


    public static void main(String[] args) {
        String str="abaacbcbb";
        System.out.println(minimumLength(str));
    }
}
