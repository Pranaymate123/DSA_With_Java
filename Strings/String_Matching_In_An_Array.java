package Strings;

import Backtracking_CodeStoryWithMik.Palindrom_Partitioning_I;

import java.util.ArrayList;
import java.util.List;

public class String_Matching_In_An_Array {

    public static List<String> stringMatching(String[] words) {

        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j &&  words[j].contains(words[i]) && !result.contains(words[i]))
                {
                   result.add(words[i]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words={"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));

    }
}
