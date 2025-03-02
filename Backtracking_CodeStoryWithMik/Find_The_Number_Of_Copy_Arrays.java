package Backtracking_CodeStoryWithMik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_The_Number_Of_Copy_Arrays {

    int count=0;
    Set<List<Integer>> set=new HashSet<>();
    public int countArrays(int[] original, int[][] bounds) {

        int start=bounds[0][0];
        int end=bounds[0][1];
        List<Integer> temp=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            temp.add(i);
            solve(original,temp,bounds,1,original[1]-original[0]);
            temp.remove(temp.size()-1);
        }
        return set.size();
    }

    public  void  solve(int[] original, List<Integer> temp,int[][] bounds,int idx,int diff)
    {
        if(idx==original.length)
        {

            set.add(temp);
           return;
        }
        for(int j=idx;j<bounds.length;j++)
        {
            int start=bounds[j][0];
            int end=bounds[j][1];

//            System.out.println("For the Jth Iddx "+ temp);
            for(int i=start;i<=end;i++)
            {
                if(i- temp.get(temp.size()-1)==diff)
                {
                    temp.add(i);
                    solve(original,temp,bounds,idx+1,(idx+1==original.length)?0:(original[idx+1]-original[idx]));
                    temp.remove(temp.size()-1);
                } else if (i-temp.get(temp.size()-1) >diff) {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] original ={1,2,3,4};
        int[][] bounds={{1,2},{2,3},{3,4},{4,5}};
        Find_The_Number_Of_Copy_Arrays obj=new Find_The_Number_Of_Copy_Arrays();
        System.out.println(obj.countArrays(original,bounds));
    }
}
