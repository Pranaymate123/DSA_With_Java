package Revision.Array;

import java.util.Arrays;
import java.util.Stack;

public class Make_String_Great {

    public static String makeGood(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stk.isEmpty())
            {
                char topChar=stk.peek();
                if((topChar)==(ch +32)) {
                    stk.pop();
                } else if (topChar+32==ch) {
                    stk.pop();
                } else
                {
                    stk.push(ch);
                }
            }
            else {
                stk.push(ch);
            }
        }
        StringBuilder result=new StringBuilder("");
        while (!stk.isEmpty())
        {
            result.append(stk.pop());
        }
        result.reverse();
        return result.toString();
    }
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int[] arr1=new int[26];
        int[] arr2=new int[26];

        for(int i=0;i<word1.length();i++)
        {
            char ch=word1.charAt(i);
            arr1[ch-'a']=arr1[ch-'a']+1;

            System.out.println(arr1[ch-'a']);
        }
        for(int i=0;i<word2.length();i++)
        {
            char ch=word2.charAt(i);
            arr2[ch-'a']=arr2[ch-'a']+1;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static int getAns(int num)
    {
        String str=Integer.toBinaryString(num);
        int ans=0;
        int pow=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                ans=ans+(int) Math.pow(2,pow);
                pow++;
            }
        }
        return ans;

    }
    public static String printWords(String str,int k)
    {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                k--;
                if(k==0) break;
            }
            res.append(str.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
//        String str="cabbba";
//        String word="aabbss";
//        System.out.println(closeStrings(str,word));
//        System.out.println(makeGood(str));

//        System.out.println('g'>96);
//        System.out.println('a'<'b');
        System.out.println(printWords("Java is my fav language",3));

    }
}
