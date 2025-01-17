package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String getLongestPrefix(String [] str)
    {

        StringBuilder sb=new StringBuilder("");
        Arrays.sort(str);

        char [] first=str[0].toCharArray();
        char [] last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++)
        {
            if(first[i]==last[i])
            {
                sb.append(first[i]);
            }else {
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        String[] str={"flower","flow","flight"};
        System.out.println(getLongestPrefix(str));
    }
}
