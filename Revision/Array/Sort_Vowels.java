package Revision.Array;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class Sort_Vowels {

    public static String sortVowels(String s) {
        String vowels="AEIOUaeiou";
        Map<Character,Integer> map=new HashMap<>();
        map.put('A',0);   map.put('E',0);  map.put('I',0);  map.put('O',0);  map.put('U',0);
        map.put('a',0);   map.put('e',0);  map.put('i',0);  map.put('o',0);  map.put('u',0);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
                    map.put(ch,map.get(ch)+1);
            }
        }
        int j=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch))
            {
//                System.out.println("Called");
                while(map.containsKey(vowels.charAt(j)) && map.get(vowels.charAt(j))<=0)
                {

                    j++;
                }
                if(map.getOrDefault(vowels.charAt(j),0)>0)
                {

                    result.append(vowels.charAt(j));
                    map.put(vowels.charAt(j),map.getOrDefault(vowels.charAt(j),0)-1);
                }
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();

    }
    public static boolean isVowel(char c)
    {
        return (c=='a' || c=='e' ||c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' );
    }
    public static void main(String[] args) {
        String str="lEetcOde";
        System.out.println(sortVowels(str));
    }
}
