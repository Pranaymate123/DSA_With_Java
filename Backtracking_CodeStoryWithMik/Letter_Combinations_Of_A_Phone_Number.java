package Backtracking_CodeStoryWithMik;

import Tree.MaxPathSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_Of_A_Phone_Number {

    Map<Character,String> map=new HashMap<>();

    public List<String> letterCombinations(String digits) {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> result=new ArrayList<>();

        solve(result,new StringBuilder(),digits,0);
        return result;
    }

    public void solve(List<String> result,StringBuilder temp,String digits,int idx)
    {
        if(idx>=digits.length())
        {
            result.add(temp.toString());
            return;
        }

        String str=map.get(digits.charAt(idx));
        for(int i=0;i<str.length();i++)
        {
           temp.append(str.charAt(i));

           solve(result,temp,digits,idx+1);

           temp.replace(temp.length()-1,temp.length(),"");
        }
    }
    public static void main(String[] args) {
        Letter_Combinations_Of_A_Phone_Number obj=new Letter_Combinations_Of_A_Phone_Number();
        System.out.println(obj.letterCombinations("23"));
    }
}
