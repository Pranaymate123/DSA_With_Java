package Strings;

import jdk.dynalink.beans.StaticClass;

public class TitleUppercase {

    public static  String convertTitleToUpperCase(String str)
    {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static String compress(String str)
    {
        StringBuilder builder=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            int count=1;
            builder.append(str.charAt(i));
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count>1)
            {
                builder.append(count);
            }

        }
        return builder.toString();
    }

    public static int countLowerCaseVowels(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        String str = "aaaabbbbcccc";
//        System.out.println(compressCharArray(str.toCharArray()));
        String str="cjkfrjkhf sajsrdgos;lpoagera;ogpoqoowfje";
        System.out.println(countLowerCaseVowels(str));

        String str1="Apna Collge";
        str1=str1.replace('l',' ' );
        System.out.println(str1);
    }
}
