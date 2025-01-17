package Backtracking_CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;

public class Word_Break_II {

    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result=new ArrayList<>();
         solve(s,0,result,wordDict,new String());
         return result;
    }

    public static void solve(String s,int idx,List<String> result,List<String> wordDict,String currSentence)
    {
        if(idx>=s.length())
        {
           String str= currSentence.trim();
           result.add(str);

            return;
        }
        for(int j=idx;j<s.length();j++)
        {
            String tempWord=s.substring(idx,j+1);
            if(wordDict.contains(tempWord))
            {
                String  originalSentence=currSentence;
                if(!currSentence.isEmpty())
                {
                    currSentence+=" ";
                }
                currSentence+=tempWord;
                solve(s,j+1,result,wordDict,currSentence);
               currSentence=originalSentence;
            }

        }
    }
    public static void main(String[] args) {
        String s="catsanddog";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");

        System.out.println(wordBreak(s,wordDict));
    }
}
