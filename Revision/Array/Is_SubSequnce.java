package Revision.Array;

import java.util.*;

public class Is_SubSequnce {

    public static boolean isSubsequence(String s ,String t)
    {
        if(s.length()>t.length()) return false;
        int i=0;
        int j=0;
        while (j<t.length() && i<s.length())
        {
            while (s.charAt(i)!=t.charAt(j))
            {
                j++;
            }
            i++;
        }
        return  i>=s.length()-1;
    }



    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdk";
        System.out.println(isSubsequence(s,t));
        Set<Character> set=new HashSet<>();

        StringBuilder str=new StringBuilder();
        
    }
}
