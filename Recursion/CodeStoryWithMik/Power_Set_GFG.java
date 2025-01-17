package Recursion.CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;

public class Power_Set_GFG {

    public static List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> lst=new ArrayList<>();
         solve(s,lst,0,new StringBuilder());
         lst.sort(String::compareTo);
         return lst;
    }
    public static void solve(String s,List<String> result,int idx,StringBuilder ans)
    {
        if(idx>=s.length())
        {
            if(ans.toString().isEmpty())
            {
                return;
            }
            result.add(ans.toString());
            return;
        }
        //take
        ans.append(s.charAt(idx));
        //explore
        solve(s,result,idx+1,ans);
        //not take remove the last added character
        ans.replace(ans.length()-1,ans.length(),"");
        solve(s,result,idx+1,ans);
    }
    public static void main(String[] args) {
        System.out.println(AllPossibleStrings("abc"));
    }
}
