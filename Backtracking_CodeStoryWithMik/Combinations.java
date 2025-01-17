package Backtracking_CodeStoryWithMik;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result=new ArrayList<>();
        solve(result,new ArrayList<>(),1,k,n);
        return result;
    }
    public static void solve(List<List<Integer>> result,List<Integer> curr,int idx,int k,int n)
    {
        if(idx>n || curr.size()==k)
        {
           if(curr.size()==k)
           {
               result.add(new ArrayList<>(curr));
           }
           return;
        }
//        if(curr.size()==k)
//        {
//            result.add(new ArrayList<>(curr));
//            return;
//        }
        for(int i=idx;i<=n;i++)
        {
            curr.add(i);

            solve(result,curr,i+1,k,n);

            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
