package Strings;

import java.util.Arrays;

public class CheckAnagrams {

    public static boolean checkAnagrams(String s,String t)
    {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length() == t.length())
        {
            char [] s1=s.toCharArray();
            char [] t1=t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);

            boolean result=Arrays.equals(s1,t1);
            if(result)
            {
                return true;
            }
            return false;



        }else{
            return false;
        }

    }

    public static void main(String[] args) {
//        String str1="abcadd";
//        String str2="dbcaaa";
//        System.out.println(checkAnagrams(str1,str2));

        String str1=new String("IronMan").intern();
        String str2=new String("IronMan").intern();
        System.out.println(str1==str2);
    }
}
