package Backtracking_CodeStoryWithMik;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Score_Words_Formed_By_Letters {

    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        int[] map=new int[26];
        for(char c:letters)
        {
            map[c-'a']=map[c-'a']+1;
        }
        return solve(words,0,map,score);
    }

    public int solve(String[] words,int idx,int[] map,int[] score)
    {
        if(idx>=words.length) return 0;

        //take
        int take=0;
        int notTake=0;
        if(canWeTake(map,words[idx]))
        {
            ///do
            int currScore= getScore(score,words[idx]);
//            System.out.println("curr score "+ currScore + " Taken Words Are "+ words[idx]);
            //explore
            take=currScore+solve(words,idx+1,map,score);

            //undo
            revertMapChangesWhenWordIsTaken(map,words[idx]);

        }
        notTake=solve(words,idx+1,map,score);

        return Math.max(take,notTake);
    }

    public boolean canWeTake(int[] map,String word)
    {

        int[] temp=new int[map.length];
        System.arraycopy(map, 0, temp, 0, map.length);
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(temp[ch-'a']<=0)
            {
                return false;
            }
            else
            {
                temp[ch-'a']=temp[ch-'a']-1;
            }
        }

        System.arraycopy(temp, 0, map, 0, temp.length);
        return true;
    }

    public int getScore(int[] score,String word) {
        int result = 0;

        for (int i = 0; i < word.length(); i++){
            result+=score[word.charAt(i)-'a'];
        }

        return result;
    }

    public void revertMapChangesWhenWordIsTaken(int[] map,String word)
    {
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            map[ch-'a']=map[ch-'a']+1;
        }
    }
    public static void main(String[] args) {
        String[] words={"xxxz","ax","bx","cx"};

        char[] letters={'z','a','b','c','x','x','x'};

        int[] score={4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10};

        Maximum_Score_Words_Formed_By_Letters obj=new Maximum_Score_Words_Formed_By_Letters();
        System.out.println(obj.maxScoreWords(words,letters,score));
    }
}
