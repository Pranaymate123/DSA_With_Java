package Backtracking_CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;

public class Palindrom_Partitioning_I {

    List<List<String>> result=new ArrayList<>();
    public List<List<String>> partition(String s) {

        backTrack(s,0,new ArrayList<>());
        return result;
    }

    public void backTrack(String s,int idx,List<String> curr)
    {
        if(idx>=s.length())
        {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=idx;i<s.length();i++)
        {
            if(isPalindrome(s,idx,i))
            {
                curr.add(s.substring(idx,i+1));

                backTrack(s,i+1,curr);

                curr.remove(curr.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s,int i, int j)
    {
        while (i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



    public static void main(String[] args) {
        Palindrom_Partitioning_I obj=new Palindrom_Partitioning_I();
        System.out.println( obj.partition("aab"));

//        System.out.println(obj.isPalindrome("abbba",0,4));
    }
}
