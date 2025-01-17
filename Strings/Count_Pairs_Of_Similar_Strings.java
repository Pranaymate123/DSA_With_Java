package Strings;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class Count_Pairs_Of_Similar_Strings {

    public static int similarPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isSimilarStrings(words[i],words[j]))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static boolean isSimilarStrings(String str1,String str2)
    {
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        AtomicBoolean ans= new AtomicBoolean(true);
        for(int i=0;i<str1.length();i++)
        {
            set1.add(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++)
        {
            set2.add(str2.charAt(i));
        }
        if(set1.size()!= set2.size()) return false;

        set1.forEach(e->{
            if(!set2.contains(e)){
                ans.set(false);
                return;
            }
        });
        return ans.get();
    }

    public static void main(String[] args) {
       String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }
}
