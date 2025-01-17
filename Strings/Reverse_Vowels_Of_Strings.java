package Strings;

import java.util.Arrays;

public class Reverse_Vowels_Of_Strings {
    public static String reverseVowels(String s) {
        char [] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;

        while (i<=j)
        {
            while (!isVowelChar(arr[i]) && i<j)
            {
                i++;
            }
            while (!isVowelChar(arr[j]) && i<j)
            {
                j--;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        StringBuilder res=new StringBuilder();
        for(int k=0;k<arr.length;k++)
        {
            res.append(arr[k]);

        }
        return res.toString();
    }

    public static boolean isVowelChar(char c)
    {
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }

    public static void main(String[] args) {
        String str="leetcode";
        System.out.println(reverseVowels(str));
    }

}
