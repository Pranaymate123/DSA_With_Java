package Strings;

import java.util.Arrays;

public class Count_The_Vowels_In_The_String {

    public static int[] vowelStrings(String[] words, int[][] queries) {

        int[] ans=new int[queries.length];
        int[] temp=new int[words.length+1];
        int j=0;
        temp[0]=0;
        for(int i=0;i<words.length;i++)
        {
            if(isStartWithAndEndWithVowel(words[i]))
            {
                temp[i+1]=temp[i]+1;
            }
            else
            {
                temp[i+1]=temp[i];
            }
        }

        for(int[] q:queries)
        {
            ans[j]=temp[q[1]+1]-temp[q[0]];
            j++;
        }
        return ans;
    }

    public static boolean isStartWithAndEndWithVowel(String str){
        return  isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1));
    }
    public static boolean isVowel(char ch)
    {
        return (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
    public static void main(String[] args) {
        String[] words={"aba","bcb","ece","aa","e"};
        int[][] queries ={{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(vowelStrings(words,queries)));
    }
}
