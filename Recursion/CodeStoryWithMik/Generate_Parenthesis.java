package Recursion.CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generate_Parenthesis {

//Approach 2
    public static List<String> generateParenthesis(int n) {
        StringBuilder result=new StringBuilder();
        List<String> ans=new ArrayList<>();
        generate(n,new StringBuilder(),ans,0,0);
        return ans;
    }

    public static void generate(int n,StringBuilder result,List<String> ans,int openCount,int closedCount)
    {
        if(result.length()>=2*n)
        {
            ans.add(result.toString());

            return;
        }
        if(openCount<n)
        {
            result.append("(");
            generate(n,result,ans,openCount+1,closedCount);
            result.replace(result.length()-1,result.length(),"");
        }
        if(closedCount<openCount)
        {
            result.append(")");
            generate(n,result,ans,openCount,closedCount+1);
            result.replace(result.length()-1,result.length(),"");
        }

    }

    //Approach 1



//    public static List<String> generateParenthesis(int n) {
//        StringBuilder result=new StringBuilder();
//        List<String> ans=new ArrayList<>();
//         generate(n,new StringBuilder(),ans);
//         return ans;
//    }
//
//    public static void generate(int n,StringBuilder result,List<String> ans)
//    {
//        if(result.length()>=2*n)
//        {
//            if(isValid(result))
//            {
//                ans.add(result.toString());
//            }
//            return;
//        }
//        result.append("(");
//        generate(n,result,ans);
//        result.replace(result.length()-1,result.length(),"");
//
//        result.append(")");
//        generate(n,result,ans);
//        result.replace(result.length()-1,result.length(),"");
//    }
//
//    public static boolean isValid(StringBuilder str)
//    {
//        int cnt=0;
//        for(int i=0;i<str.length();i++)
//        {
//            char ch=str.charAt(i);
//            if(ch=='(')
//            {
//                cnt++;
//            }
//            else
//            {
//                cnt--;
//            }
//            if(cnt<0)
//            {
//                return false;
//            }
//        }
//        return cnt==0;
//    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
