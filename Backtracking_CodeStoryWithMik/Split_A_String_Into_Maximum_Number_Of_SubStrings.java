package Backtracking_CodeStoryWithMik;

import java.util.HashSet;
import java.util.Set;

public class Split_A_String_Into_Maximum_Number_Of_SubStrings {

    int maxResult=0;
    public  int maxUniqueSplit(String s) {

       solve(s,0,0,new HashSet<>());
       return maxResult;
    }

    public void solve(String s,int idx,int result,Set<String> set)
    {
        if(result+(s.length()-idx)<=maxResult) return;
        if(idx>=s.length())
        {
            maxResult=Math.max(maxResult,result);
            return;
        }

        for(int i=idx;i<s.length();i++)
        {
            String word=s.substring(idx,i+1);

            if(!set.contains(word))
            {
                result++;    //do
                set.add(word);
                solve(s,i+1,result,set);  //explore
                set.remove(word);
                result--;  //undo
            }
        }

    }


    public static void main(String[] args) {

        String s="wwwzfvedwfvhsww";
        Split_A_String_Into_Maximum_Number_Of_SubStrings obj=new Split_A_String_Into_Maximum_Number_Of_SubStrings();
        System.out.println(obj.maxUniqueSplit(s));

        
    }
}
