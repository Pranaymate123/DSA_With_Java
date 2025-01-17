package Revision.Array;

import java.util.Arrays;
import java.util.Stack;

public class Remove_Duplicates_From_String {

    public static String removeDuplicateLetters(String s) {
        char [] arr=s.toCharArray();
        int[] lastIndex=new int[26];
        boolean [] taken=new boolean[26];
//        Arrays.fill(taken,false);

        for(int i=0;i<arr.length;i++)
        {
            lastIndex[arr[i] - 'a']=i;
        }
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            int idx=ch-'a';

            if(taken[idx]==true)
            {
                continue;
            }
            while(!stk.isEmpty() && stk.peek() > ch && lastIndex[stk.peek()-'a'] >i)
            {
                taken[stk.peek()-'a']=false;
                stk.pop();
            }

            stk.push(ch);
            taken[idx]=true;
        }

        StringBuilder result=new StringBuilder();
        while(!stk.isEmpty())
        {
            result.append(stk.pop());
        }

        return result.reverse().toString();
    }

    public static String decodeAtIndex(String s, int k) {
        long size=0;
        char[] arr=s.toCharArray();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                int num = c - '0';
                size = size * num;

            } else {
                size++;
            }
        }



        for(int i=arr.length-1;i>=0;i--)
        {
                k= (int) (k% size);
            if(k==0 && Character.isLetter(arr[i]))
            {
                return arr[i]+"";
            }
            if( Character.isDigit(arr[i]))
            {
                int num=arr[i]-'0';
                size=size/num;
            }
            else
            {
                size--;
            }
        }

        return arr[0]+"";
    }
    public static void main(String[] args) {
//        String str="cdadabcc";

//        System.out.println(removeDuplicateLetters(str));

        String str="yyuele72uthzyoeut7oyku2yqmghy5luy9qguc28ukav7an6a2bvizhph35t86qicv4gyeo6av7gerovv5lnw47954bsv2xruaej";
        System.out.println(decodeAtIndex(str,123365626));

    }
}
