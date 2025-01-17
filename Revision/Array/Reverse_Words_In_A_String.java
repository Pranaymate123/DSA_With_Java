package Revision.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reverse_Words_In_A_String {

    public static String reverseWords(String s) {

        s=s.trim();
        System.out.println(s);
        StringBuilder result=new StringBuilder();
        int j=s.length()-1;
        int i=s.length();
        while (j>=0)
        {
            if(s.charAt(j)==' ')
            {
                String temp=s.substring(j+1,i);
                result.append(temp);
                result.append(" ");
                while (s.charAt(j)==' ')
                {
                    j--;
                }
                i=j+1;
            }
            j--;
        }
        //for first word
        result.append(s,j+1,i);
        return result.toString();
    }
    public static void main(String[] args) {
        String str="      Hello      World      ";
//        System.out.println(str.trim());
        System.out.println(reverseWords(str));

        List<Integer> lst=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();

    }
}
